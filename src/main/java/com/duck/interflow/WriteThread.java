package com.duck.interflow;

import java.io.PipedOutputStream;

public class WriteThread extends Thread {
	
	private WriteData write;
	
	private PipedOutputStream out;
	
	public WriteThread(WriteData write, PipedOutputStream out) {
		this.write = write;
		this.out = out;
	}
	
	@Override
	public void run() {
		this.write.writeMethod(out);
	}
}
