package log4jproject;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Test {
	
	static Logger logger = Logger.getLogger(Test.class);
	
	public static void main(String[] args) {
		BasicConfigurator.configure();
		logger.debug("Hello");
	}

}
