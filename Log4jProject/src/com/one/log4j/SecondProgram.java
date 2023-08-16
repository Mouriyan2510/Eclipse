package com.one.log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class SecondProgram {
	static Logger log=Logger.getLogger(SecondProgram.class); 
	public static void main(String...args) {
		PropertyConfigurator.configure("log4j.properties");
		log.info("Information");
		log.warn("Warning");
		log.error("Error Occurs");
		log.debug("Debugging");
		log.fatal("Critical Error");
	}
}
