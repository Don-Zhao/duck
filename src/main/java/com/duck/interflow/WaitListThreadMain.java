package com.duck.interflow;

public class WaitListThreadMain {
	
	public static void main(String[] args) {
		Object lock = new Object();
		MyList list = new MyList();
		
		WaitListThreadA threadA = new WaitListThreadA(list, lock);
		WaitListThreadB threadB = new WaitListThreadB(list, lock);
		threadA.start();
		threadB.start();
	}
}
