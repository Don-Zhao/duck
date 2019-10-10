package com.duck.interflow;

import org.apache.log4j.Logger;

public class ListThreadA extends Thread {
	
	private static Logger logger = Logger.getLogger(ListThreadA.class);
	
	private volatile MyList list;
	
	public ListThreadA(MyList list) {
		this.list = list;
	}
	
	@Override
	public void run() {
		try {
		for (int i = 0; i < 10; i++) {
			this.list.add(i);
			logger.debug("已经添加了" + (i + 1) + "个元素");
			Thread.sleep(1000);
		}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
