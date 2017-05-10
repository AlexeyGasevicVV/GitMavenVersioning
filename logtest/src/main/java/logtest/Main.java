package logtest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;

public class Main {
	final static Logger logger = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {
		BarComponent bc = new BarComponent();
		FooComponent fc = new FooComponent();
		bc.bar();
		fc.foo();
		
		logger.info("Entering application.");

		fc.doIt();
	    logger.info("Exiting application.");
	    
	    LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
	    // print logback's internal status
	    StatusPrinter.print(lc);
	}
}
