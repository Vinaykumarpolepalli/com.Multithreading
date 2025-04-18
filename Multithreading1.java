package com.Multithreading;

public class Multithreading1 extends Thread {

	public static void main(String[] args) {
		System.out.println("Main method is Started");
		Multithreading1 m = new Multithreading1();
		m.show();
		m.start();
	
	
		
		Thread.currentThread().setName("Vinay");
		
		Thread.currentThread().setPriority(9);//java.lang.IllegalArgumentException 
		System.out.println(Thread.currentThread());
		System.out.println("Name of the thread :"+Thread.currentThread().getName());

		for(int i =1;i<=20;i++) {
			System.out.println("Main:"+i);
		}
		System.out.println("Main Method  is ended");
	}
	
	@Override
	public void run() {
		
//		Thread.currentThread().setPriority(MAX_PRIORITY);
		System.out.println(Thread.currentThread());
		for(int i =1;i<=20;i++) {
			System.out.println("Run :"+i);
		}
	}
	
	 void show() {
		System.out.println("good morning ,hava good day");
	}

}
