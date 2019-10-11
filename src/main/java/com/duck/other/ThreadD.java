package com.duck.other;

public class ThreadD extends Thread {
	public void run() {
		ServiceA.service();
	}
}
