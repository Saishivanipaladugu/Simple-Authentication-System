import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;

public class SecureStorage {
	private static final byte[] SALT = loadSalt();

	public static boolean verifyCredentials(char[] username, char[] password) {
		byte[] usernameHash = hash(username);
		byte[] passwordHash = hash(password);

		boolean isValid = Arrays.equals(usernameHash, hash("Alexsandro".toCharArray())) &&
				Arrays.equals(passwordHash, hash("password#123!".toCharArray()));

		Arrays.fill(username, ' ');
		Arrays.fill(password, ' ');

		return isValid;
	}

	private static byte[] hash(char[] input) {
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			md.update(SecureStorage.SALT);
			return md.digest(charArrayToBytes(input));
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException("Error generating hash", e);
		}
	}

	private static byte[] charArrayToBytes(char[] input) {
		byte[] bytes = new byte[input.length];
		for (int i = 0; i < input.length; i++) {
			bytes[i] = (byte) input[i];
		}
		return bytes;
	}

	private static byte[] loadSalt() {
		SecureRandom random = new SecureRandom();
		byte[] salt = new byte[16];
		random.nextBytes(salt);
		return salt;
	}
}
