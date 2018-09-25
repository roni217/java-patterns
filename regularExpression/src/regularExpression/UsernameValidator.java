package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsernameValidator {

	private Pattern pattern;
	private Matcher matcher;
	private static final String USERNAME_PATTERN = "^[a-z0-9_-]{3,15}$";
	/*
	 * ^                        # Start of the line 
	 * [a-z0-9_-]               # Match characters and symbols in the list, a-z, 0-9, underscore, 
	 * hyphen {3,15}            # Length at least 3 characters and
	 * maximum length of 15 $   # End of the line
	 */

	public UsernameValidator() {
		pattern = Pattern.compile(USERNAME_PATTERN);
	}

	/**
	 * Validate username with regular expression
	 * 
	 * @param username username for validation
	 * @return true valid username, false invalid username
	 */
	public boolean validate(final String username) {

		matcher = pattern.matcher(username);
		return matcher.matches();

	}

}
