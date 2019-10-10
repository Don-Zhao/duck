package com.duck.interflow;

import java.io.IOException;
import java.io.PipedInputStream;

import org.apache.log4j.Logger;

public class ReadData {
	
	private static Logger logger = Logger.getLogger(ReadData.class);
	
	public void readMethod(PipedInputStream in) {
		try {
			logger.debug("read:");
			byte[] byteArray = new byte[20];
			int readLength = in.read(byteArray);
			while (readLength != -1) {
				String readData = new String(byteArray, 0, readLength);
				logger.debug(readData);
				readLength = in.read(byteArray);
			}
			
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
