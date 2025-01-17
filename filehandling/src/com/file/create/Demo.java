package com.file.create;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class Demo implements Serializable {
	transient final int i = 10;
	int j = 20;

	public static void main(String[] args) {
		Demo d1=new Demo();
		try {
		OutputStream fos=new FileOutputStream("myfile.txt");
	
		try {
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d1);
		}
	    catch(IOException e) {
		e.printStackTrace();
	}}
		catch(FileNotFoundException e) {
		e.printStackTrace();
	}
		
		//deserialization
		FileInputStream fis;
		try {
			fis=new FileInputStream("myfile.txt");
			try {
				ObjectInputStream ois=new ObjectInputStream(fis);
				try {
					Demo d2=(Demo)ois.readObject();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
}
}
