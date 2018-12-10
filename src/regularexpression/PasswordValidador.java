package regularexpression;

public class PasswordValidador extends Validador {
	
	private static final String PASSWORD_PATTERN = 
            "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";
		/*
		 * (               # Start of group 
		 * (?=.*\d)        # must contains one digit from 0-9 
		 * (?=.*[a-z])     # must contains one lowercase characters 
		 * (?=.*[A-Z])     # must contains one uppercase characters
		 * (?=.*[@#$%])    # must contains one special symbols in the list "@#$%" 
		 *           .     # match anything with previous condition checking 
		 *          {6,20} # length at least 6 characters and maximum of 20 ) 
		 *          # End of group
		 */      
	  public PasswordValidador(){
		  super(PASSWORD_PATTERN);
	  }
}
