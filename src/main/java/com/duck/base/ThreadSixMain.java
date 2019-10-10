package com.duck.base;

/**
 * 利用标记停止线程
 * @author zhao.jiahong
 *
 */
public class ThreadSixMain {
	public static void main(String[] args) throws InterruptedException {
		ThreadSix thread = new ThreadSix();
		thread.start();
		Thread.sleep(1000);
		thread.interrupt();
	}
}
