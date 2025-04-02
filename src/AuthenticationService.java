public class AuthenticationService {
	public static boolean authenticate(char[] username, char[] password) {
		return SecureStorage.verifyCredentials(username, password);
	}
}
