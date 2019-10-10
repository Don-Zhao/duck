package com.duck.singleton;

public class InnerStaticClassSingleton {
	
	private static class ObjectHolder {
		private static InnerStaticClassSingleton object = new InnerStaticClassSingleton();
	}
	
	private InnerStaticClassSingleton() {
		
	}
	
	public static InnerStaticClassSingleton getInstance() {
		return ObjectHolder.object;
	}
}
