package logtest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BarComponent {
	private static final Logger logger = LoggerFactory.getLogger(BarComponent.class);

	public void bar() {
		String name = "lordofthejars";
		logger.info("Hello from Bar.");
		logger.debug("in bar my name is {}.", name);
		logger.error("My name is Max not {}.",name);
	}
}
