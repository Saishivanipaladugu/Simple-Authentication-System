public class InputSanitizer {
	public static char[] sanitizeUsername(char[] input) {
		if (input == null) return new char[0];

		String sanitized = new String(input).trim().replaceAll("[^a-zA-Z0-9_]", "");
		return sanitized.toCharArray();
	}

	public static char[] sanitizePassword(char[] input) {
		if (input == null) return new char[0];

		String sanitized = new String(input).trim()
				.replaceAll("[^a-zA-Z0-9@!#$%^&*()_+\\-=\\[\\]{}'\"\\\\|,.?/`~]", "");
		return sanitized.toCharArray();
	}
}
