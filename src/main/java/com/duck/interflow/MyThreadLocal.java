package com.duck.interflow;

public class MyThreadLocal extends ThreadLocal<String> {

	@Override
	protected String initialValue() {
		return "我是初始值";
	}
	
}
