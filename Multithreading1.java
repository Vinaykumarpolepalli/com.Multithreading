package com.Multithreading;

public class Multithreading1 {

	public static void main(String[] args) {
		System.out.println("Main method is Started");
		Multithreading1 m = new Multithreading1();
		m.show();
		System.out.println("Name of the thread :"+Thread.currentThread().getName());
		System.out.println("Main Method  is ended");
	}
	
	 void show() {
		System.out.println("good morning ,hava good day");
	}

}
