package com.duck.exception;

public class InGroupThreadMain {

	public static void main(String[] args) {
		ThreadGroup group = new ThreadGroup("MyThreadGroup");
		
		InGroupThread[] threads = new InGroupThread[10];
		
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new InGroupThread(group, "thread-" + i, "" + i);
			threads[i].start();
		}
		
		InGroupThread thread = new InGroupThread(group, "ErrorThread", "a");
		thread.start();
	}

}
