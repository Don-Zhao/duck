package com.duck.singleton;

public class InnerStaticClassSingletonMain {

	public static void main(String[] args) {
		InnerStaticClassSingletonThread threadA = new InnerStaticClassSingletonThread();
		InnerStaticClassSingletonThread threadB = new InnerStaticClassSingletonThread();
		InnerStaticClassSingletonThread threadC = new InnerStaticClassSingletonThread();
		
		threadA.start();
		threadB.start();
		threadC.start();
	}

}
