package com;

import java.io.File;

public class FileName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File folder = new File("/Users/bhavyasreekosanam/Desktop/Assignments");
		File[] listOfFiles = folder.listFiles();
		

		for (int i = 0; i < listOfFiles.length; i++) {
		  if (listOfFiles[i].isFile()) {
		    System.out.println(listOfFiles[i].getName());
		  } 
		  
		  
		  
		  
	}
	}

}