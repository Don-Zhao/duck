package com.duck.interflow;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class ReadWriteMain {
	
	public static void main(String[] args) {
		try {
			WriteData writeData = new WriteData();
			ReadData readData = new ReadData();
			PipedInputStream in = new PipedInputStream();
			PipedOutputStream out = new PipedOutputStream();
			out.connect(in);
			
			ReadThread threadRead = new ReadThread(readData, in);
			threadRead.start();
			WriteThread threadWrite = new WriteThread(writeData, out);
			threadWrite.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
