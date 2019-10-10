package com.duck.lock;

public class MyServiceThreadMain {
	public static void main(String[] args) {
		MyService myService = new MyService();
		MyServiceThread threadA = new MyServiceThread(myService);
		MyServiceThread threadB = new MyServiceThread(myService);
		MyServiceThread threadC = new MyServiceThread(myService);
		MyServiceThread threadD = new MyServiceThread(myService);
		MyServiceThread threadE = new MyServiceThread(myService);
		threadA.start();
		threadB.start();
		threadC.start();
		threadD.start();
		threadE.start();
	}
}
