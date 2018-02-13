package com.surya.log;

import org.apache.log4j.Logger;;

public class TestLog4J {
	static Logger log = Logger.getLogger(TestLog4J.class.getName());

	public static void main(String args[]) throws Exception {
		//BasicConfigurator.configure();
		TestLog4J.primeNumber();
		// log.debug("message");
		// log.info("message");
	}
//Line Added
	public static void primeNumber() {
		System.out.println("Printing of Prime Numbers between 1 to 1000...");
		System.out.println("Hello...1");
		System.out.println("Hello...2");
		int i = 2, count = 0;
		while (i < 1000) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					count = 0;
					break;
					break;
				}
				count = 1;
			}
			if (count == 1)
				log.info(i + " is a prime number");
			else
				log.debug(i + " is not a Prime Number");
			i++;
		}
	}
}