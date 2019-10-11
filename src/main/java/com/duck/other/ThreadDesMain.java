package com.duck.other;

public class ThreadDesMain {

	public static void main(String[] args) {
		Object lock = new Object();
		ThreadDes a = new ThreadDes(lock, "A", 1);
		ThreadDes b = new ThreadDes(lock, "B", 2);
		ThreadDes c = new ThreadDes(lock, "C", 0);
		
		a.start();
		b.start();
		c.start();
	}

}
