import java.util.Scanner;
import java.util.Arrays;

public class AuthenticationSystem {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your username: ");
		char[] username = scanner.nextLine().toCharArray();
		username = InputSanitizer.sanitizeUsername(username);

		System.out.print("Enter your password: ");
		char[] password = scanner.nextLine().toCharArray();
		password = InputSanitizer.sanitizePassword(password);

		if (AuthenticationService.authenticate(username, password)) {
			System.out.println("Authentication successful!");
		} else {
			System.out.println("Invalid username or password.");
		}

		Arrays.fill(username, ' ');
		Arrays.fill(password, ' ');

		scanner.close();
	}
}
