package com.duck.singleton;

public class StaticBlockSingletonMain {

	public static void main(String[] args) {
		StaticBlockSingletonThread threadA = new StaticBlockSingletonThread();
		StaticBlockSingletonThread threadB = new StaticBlockSingletonThread();
		StaticBlockSingletonThread threadC = new StaticBlockSingletonThread();
		
		threadA.start();
		threadB.start();
		threadC.start();
	}

}
