package com.file.create;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Sample {
	public static void main(String[] args) {
		File obj=new File("myfile2.txt");
		try {
			obj.createNewFile();
			System.out.println("created");
		} catch (IOException e) {
			e.printStackTrace();
		}
		//write to a file
		try {
			FileWriter write=new FileWriter("myfile.txt");
			Scanner sc=new Scanner(System.in);
			System.out.println("enter your msg");
			String msg=sc.nextLine();
			write.write(msg);
			write.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
//		//read file
//		try {
//			Scanner sc1=new Scanner(obj);
//			while(sc1.hasNext()){
//				String lines=sc1.nextLine();
//				System.out.println(lines);
//			}
//		}catch(FileNotFoundException e){
//			e.printStackTrace();
//		}
//		//delete
//		if(obj.delete()) {
//			System.out.println("my file is deleted");
//		}
//		else {
//			System.out.println("problem to delete file");
//		}
//		obj.delete();
	}
}
