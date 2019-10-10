package com.duck.interflow;

import java.util.ArrayList;
import java.util.List;

public class Producer_Consumer {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		Object lock = new Object();
		Producer producer = new Producer(list, lock);
		Consumer consumer = new Consumer(list, lock);
		Consumer consumer1 = new Consumer(list, lock);
		producer.start();
		consumer.start();
		consumer1.start();
	}
}
