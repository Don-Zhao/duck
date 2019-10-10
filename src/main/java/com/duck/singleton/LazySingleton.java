package com.duck.singleton;

public class LazySingleton {

	private static Object object;
	
	private LazySingleton() {
		
	}
	
	// thread unsafe
//	public static Object getInstance() {
//		try {
//			if (object == null) {
//				Thread.sleep(1000);
//				object = new Object();
//			}
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		return object;
//	}
	
	// thread safe
//	public synchronized static Object getInstance() {
//		try {
//			if (object == null) {
//				Thread.sleep(1000);
//				object = new Object();
//			}
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		return object;
//	}
	
	// thread unsafe
//	public static Object getInstance() {
//		try {
//			if (object == null) {
//				Thread.sleep(1000);
//				synchronized(Object.class) {
//					object = new Object();
//				}
//			}
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		return object;
//	}
	
	// thread safe
	public static Object getInstance() {
		try {
			if (object == null) {
				Thread.sleep(1000);
				synchronized(Object.class) {
					if (object == null) {
						object = new Object();
					}
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		return object;
	}
}
