package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
	
	private Pattern pattern;
	private Matcher matcher;
	
	public Validator(String strX) {
		 final String PASSWORD_PATTERN = strX; 
		            
		pattern = Pattern.compile(PASSWORD_PATTERN);
	}
	
	public boolean validate(final String tag) {
		matcher = pattern.matcher(tag);
		return matcher.matches();

	}
	
	
}
