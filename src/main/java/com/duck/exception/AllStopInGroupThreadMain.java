package com.duck.exception;

public class AllStopInGroupThreadMain {

	public static void main(String[] args) {
		MyThreadGroup group = new MyThreadGroup("MyThreadGroup");
		
		InAllGroupThread[] threads = new InAllGroupThread[10];
		
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new InAllGroupThread(group, "thread-" + i, "" + i);
			threads[i].start();
		}
		
		InAllGroupThread thread = new InAllGroupThread(group, "ErrorThread", "a");
		thread.start();
	}
	
}
