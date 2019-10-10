package com.duck.singleton;

public class HungrySingleton {

	private static Object object = new Object();
	
	private HungrySingleton() {
		
	}
	
	public static Object getInstance() {
		return HungrySingleton.object;
	}
}
