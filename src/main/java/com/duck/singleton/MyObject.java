package com.duck.singleton;

public enum MyObject {
	
	OBJECT;
	
	private Object object;
	
	private MyObject() {
		this.object = new Object();
	}
	
	public Object getInstance() {
		return this.object;
	}
}
