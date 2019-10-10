package com.duck.singleton;

public class HungrySingletonMain {

	public static void main(String[] args) {
		HungrySingletonThread threadA = new HungrySingletonThread();
		HungrySingletonThread threadB = new HungrySingletonThread();
		HungrySingletonThread threadC = new HungrySingletonThread();
		
		threadA.start();
		threadB.start();
		threadC.start();
	}

}
