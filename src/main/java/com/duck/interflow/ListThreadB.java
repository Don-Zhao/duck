package com.duck.interflow;

import org.apache.log4j.Logger;

public class ListThreadB extends Thread {
	
	private static Logger logger = Logger.getLogger(ListThreadB.class);
	
	private volatile MyList list;
	
	public ListThreadB(MyList list) {
		this.list = list;
	}
	
	@Override
	public void run() {
		try {
			while (true) {
				if (list.size() == 5) {
					logger.debug("已经添加了5个元素，B线程现在要退出了");
					throw new InterruptedException();
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
