package regularExpression;

public class HTMLTagValidator extends Validator {

	private static final String TAG_PATTERN = "<(\"[^\"]*\"|'[^']*'|[^'\">])*>";
	/*
	<	  	#start with opening tag "<"
	 (		    #   start of group #1
	   "[^"]*"	#	allow string with double quotes enclosed - "string"
	   |		#	..or
	   '[^']*'	#	allow string with single quote enclosed - 'string'
	   |		#	..or
	   [^'">]	#	cant contains one single quotes, double quotes and ">"
	 )		    #   end of group #1
	 *	      	# 0 or more
	>		    #end with closing tag ">"
	*/
	public HTMLTagValidator() {
		super(TAG_PATTERN);
	}

}
