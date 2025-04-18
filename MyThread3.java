package com.Multithreading;

public class MyThread3 extends Thread {
	@Override
	public void run(){
	System.out.println(Thread.currentThread().getName());
	System.out.println(Thread.currentThread());
	
	}

	public static void main(String[] args) {
		System.out.println("Main method is Started");
		MyThread3 m = new MyThread3();
		MyThread3 m1 = new MyThread3();
		
		m.setName("Thread is Started 1");
		m.start();
		m1.start();
		
		m1.setName("Thread is Started 2");
		m1.start();
		m1.setPriority(30);
	}
	
}	



	
	
		
		
	


