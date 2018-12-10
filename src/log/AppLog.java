package log;
import org.apache.log4j.Logger;

public class AppLog {
	
final static Logger logger = Logger.getLogger(AppLog.class);
	
	public static void main(String[] args) {
	
		AppLog obj = new AppLog();
		obj.runMe("Log test");

	}
	
	private void runMe(String parameter){
		
		if(logger.isDebugEnabled()){
			logger.debug("This is debug : " + parameter);
		}
		
		if(logger.isInfoEnabled()){
			logger.info("This is info : " + parameter);
		}
		
		Integer a =10;
		Integer b =5;
		Integer c =0;
		
		try{
			divide(a,b);
			divide(a,c);
			
		}catch(ArithmeticException ex){
			logger.error("Sorry, something wrong!", ex);
		}
		
		logger.warn("This is warn : " + parameter);
		logger.error("This is error : " + parameter);
		logger.fatal("This is fatal : " + parameter);
		
	}

	private Integer divide(Integer a, Integer b) {
		logger.warn("divide : " + a + b );
		return a / b;
	}

}
