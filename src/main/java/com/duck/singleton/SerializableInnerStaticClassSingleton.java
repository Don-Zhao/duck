package com.duck.singleton;

import java.io.Serializable;

public class SerializableInnerStaticClassSingleton implements Serializable{

	private static final long serialVersionUID = 7216162619657123341L;

	private static class ObjectHolder {
		private static SerializableInnerStaticClassSingleton object = new SerializableInnerStaticClassSingleton();
	}
	
	private SerializableInnerStaticClassSingleton() {
		
	}
	
	public static SerializableInnerStaticClassSingleton getInstance() {
		return ObjectHolder.object;
	}
	
	protected SerializableInnerStaticClassSingleton readResolve() {
		System.out.println("readResolve method invoke");
		return ObjectHolder.object;
	}
}
