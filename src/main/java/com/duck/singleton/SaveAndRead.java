package com.duck.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.apache.log4j.Logger;

public class SaveAndRead {

	private static Logger logger = Logger.getLogger(SaveAndRead.class);
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		SerializableInnerStaticClassSingleton object = SerializableInnerStaticClassSingleton.getInstance();
		FileOutputStream fos = new FileOutputStream(new File("D:\\save.txt"));
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(object);
		oos.close();
		fos.close();
		logger.debug(object.hashCode());
		
		FileInputStream fis = new FileInputStream(new File("D:\\save.txt"));
		ObjectInputStream ois = new ObjectInputStream(fis);
		SerializableInnerStaticClassSingleton returnObject = (SerializableInnerStaticClassSingleton)ois.readObject();
		ois.close();
		fis.close();
//		logger.debug(returnObject.hashCode());
		logger.debug(returnObject.readResolve().hashCode());
	}

}
