package com;

import java.util.*;
public class Tvmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
		
		Tv1 t=new Tv1();
		
		System.out.println("Enter the values");
		
		t.brand=s.next();
		t.model=s.next();
		t.color=s.next();
		
		t.getDetails();
		t.increaseVolume();
		t.decreaseVolume();
		t.changeChannel();
		

	}

}