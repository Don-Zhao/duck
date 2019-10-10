package com.duck.base;

import org.apache.log4j.Logger;
import org.junit.Test;

public class ThreadOneTest {
	
	private static Logger logger = Logger.getLogger(ThreadOneTest.class);
	
	@Test
	public void testThreadOne() {
		try {
			Thread threadOne = new Thread(new ThreadOne());
			//threadOne.setDaemon(true);
			threadOne.start();
			Thread.sleep(1000);
			logger.debug("我离开thread对象也不再打印了，也算是停止了");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
