package com.duck.singleton;

public class StaticBlockSingleton {

	private static Object object;
	
	static {
		object = new Object();
	}
	
	private StaticBlockSingleton() {
		
	}
	
	public static Object getInstance() {
		return StaticBlockSingleton.object;
	}
}
