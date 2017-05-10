package logtest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FooComponent {
	private static final Logger logger = LoggerFactory.getLogger(FooComponent.class);

	public void foo() {
		String name = "Alex";
		logger.info("Hello from foo.");
		logger.debug("In foo my name is {}.", name);
		logger.error("My name is not Hans, it's {}.", name);
	}

	public void doIt() {
		logger.debug("Did it again!");
	}
}
