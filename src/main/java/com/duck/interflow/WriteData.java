package com.duck.interflow;

import java.io.IOException;
import java.io.PipedOutputStream;

import org.apache.log4j.Logger;

public class WriteData {
	
	private static Logger logger = Logger.getLogger(WriteData.class);
	
	public void writeMethod(PipedOutputStream out) {
		try {
			logger.debug("write:");
			for (int i = 0; i < 300; i++) {
				String outData = "" + (i + 1);
				out.write(outData.getBytes());
				logger.debug(outData);
			}
			
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
