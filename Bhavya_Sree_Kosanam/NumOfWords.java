package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class NumOfWords {

	public static void main(String[] args) throws FileNotFoundException {
		int count=0;
		// TODO Auto-generated method stub
		File f=new File("/Users/bhavyasreekosanam/Desktop");
		FileInputStream fis = new FileInputStream(f);
	      byte[] ba = new byte[(int)f.length()];
	     try {
			fis.read(ba);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      String s = new String(ba);
	      String [] data = s.split(" ");
	      System.out.println("Number of words in the given file are " +data.length);

	}

}