package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validador {
	private Pattern pattern;
	private Matcher matcher;
	
	public Validador(String strX) {
		 final String PASSWORD_PATTERN = strX; 
		            
		pattern = Pattern.compile(PASSWORD_PATTERN);
	}
	
	public boolean validar(final String tag) {
		matcher = pattern.matcher(tag);
		return matcher.matches();

	}
}
