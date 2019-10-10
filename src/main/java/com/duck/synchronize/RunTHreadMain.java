package com.duck.synchronize;

public class RunTHreadMain {
	
	public static void main(String[] args) throws InterruptedException {
		RunThread thread = new RunThread();
		thread.start();
		Thread.sleep(1000);
		thread.setFlag(false);
	}
}
