package logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {

	private static Logger logger = LogManager.getLogger(App.class);
	
	public static void main(String[] args) {
		logger.info("Start " + App.class);
		
		Double a = 3.0;
		Double b = 7.0;
		
		logger.info("A " + a);
		logger.info("B " + b);
		
		
		System.out.println("A: " + a);
		System.out.println(" somado com  ");
		System.out.println("B: " + b);
		
		System.out.println("result: "+ a+b);

	}

}
