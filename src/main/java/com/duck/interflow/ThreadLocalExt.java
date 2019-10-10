package com.duck.interflow;

public class ThreadLocalExt extends InheritableThreadLocal<Long> {

	@Override
	protected Long initialValue() {
		return System.currentTimeMillis();
	}

	@Override
	protected Long childValue(Long parentValue) {
		return parentValue + 5L;
	}
	
	
	
}
