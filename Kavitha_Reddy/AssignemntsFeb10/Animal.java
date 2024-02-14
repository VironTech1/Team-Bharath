package com;

public class Animal {
   public void eat() {
	   System.out.println("Animal is grass");
	   
   }
   public void sleep() {
	   System.out.println("Animal is sleeping");
	   
   }
}
 class Cat extends Animal{
	 public void eat() {
		System.out.println("Cat is meat");
	 }
	 public void Meow() {
		System.out.println("Cat is meow");
		 }
	 }
 class Dog extends Animal{
	 public void eat() {
		System.out.println("Dog is meat");
	 }
	 public void Bark() {
		System.out.println("Dog is bark");
			 
		 }
 }
 class Goat extends Animal{
	 public void eat() {
			System.out.println("Goat is grass");
		 }
			 
			 public void May() {
					System.out.println("Goat is May");
				 }
	
  }
