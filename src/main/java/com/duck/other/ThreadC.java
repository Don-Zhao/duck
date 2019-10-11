package com.duck.other;

public class ThreadC extends Thread {
	public void run() {
		ServiceA.service();
	}
}
