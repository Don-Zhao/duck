package com.duck.interflow;

public class ListThreadMain {

	public static void main(String[] args) {
		MyList list = new MyList();
		
		ListThreadA threadA = new ListThreadA(list);
		ListThreadB threadB = new ListThreadB(list);
		
		threadA.start();
		threadB.start();
	}
}
