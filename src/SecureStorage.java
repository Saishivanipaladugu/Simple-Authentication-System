import org.mindrot.jbcrypt.BCrypt;

public class SecureStorage {

	private static final String STORED_USERNAME = "Alexsandro";
	private static final String STORED_PASSWORD_HASH = hashPassword("password#123!");

	public static boolean verifyCredentials(char[] username, char[] password) {
		String usernameStr = new String(username);
		String passwordStr = new String(password);

		boolean isValid = STORED_USERNAME.equals(usernameStr) &&
				BCrypt.checkpw(passwordStr, STORED_PASSWORD_HASH);

		clearArray(username);
		clearArray(password);

		return isValid;
	}

	private static String hashPassword(String password) {
		return BCrypt.hashpw(password, BCrypt.gensalt(12));
	}

	private static void clearArray(char[] array) {
		if (array != null) {
			for (int i = 0; i < array.length; i++) {
				array[i] = '\0';
			}
		}
	}
}
