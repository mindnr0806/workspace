package com.kh.practice;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class IO06_ObjectInputStream {

	public static void main(String[] args) {
	
		File f = new File("./resources", "objectTest.txt");
		
		ObjectInputStream ois = null;
		try {
		ois = new ObjectInputStream(
				new BufferedInputStream(
						new FileInputStream(f)));	
		Object obj1 = ois.readObject();
		Student obj2 =(Student)ois.readObject();
		Student obj3 =(Student)ois.readObject();
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		
		
		
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}catch(IOException e) {
		e.printStackTrace();
	}catch(ClassNotFoundException w){
		w.printStackTrace();			
	}finally {
		try {
			if(ois !=null)ois.close();
		}catch(IOException e) {
			e.printStackTrace();
	}
}
}
}	