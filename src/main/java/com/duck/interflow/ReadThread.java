package com.duck.interflow;

import java.io.PipedInputStream;

public class ReadThread extends Thread {
	
	private ReadData read;
	
	private PipedInputStream in;
	
	public ReadThread(ReadData read, PipedInputStream in) {
		this.read = read;
		this.in = in;
	}
	
	@Override
	public void run() {
		this.read.readMethod(in);
	}
}
