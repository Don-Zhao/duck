package com.duck.lock;

public class FairOrNotServiceMain {

	public static void main(String[] args) {
		FairOrNotService service = new FairOrNotService(true);
		Thread[] threadArray = new Thread[10];
		for (int i = 0; i < 10; i++) {
			threadArray[i] = new ThreadC(service);
		}
		
		for (int i = 0; i < 10; i++) {
			threadArray[i].start();
		}
	}

}
