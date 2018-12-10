package regularexpression;

public class UsuarioValidador extends Validador{

	private static final String USERNAME_PATTERN = "^[a-z0-9_-]{3,15}$";
	/*
	 * ^                        # Start of the line 
	 * [a-z0-9_-]               # Match characters and symbols in the list, a-z, 0-9, underscore, 
	 * hyphen {3,15}            # Length at least 3 characters and
	 * maximum length of 15 $   # End of the line
	 */

	public UsuarioValidador() {
		 super(USERNAME_PATTERN);
	}

}
