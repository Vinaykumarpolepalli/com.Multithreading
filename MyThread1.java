package com.Multithreading;

public class MyThread1  extends Thread {

	public static void main(String[] args) {
		MyThread1 m = new MyThread1();
		m.start();
		System.out.println("Main Methiod is Started");

		for(int i =0;i<=10;i++) {
			System.out.println("Main "+i);
		}
		System.out.println("Main method is Ended");
	}
	
//	@Override the  run method from  Tread class
	public void run() {
		System.out.println("child Thread Started");
		
		for(int i =0;i<=10;i++) {
			System.out.println("Hello "+i);
		}
		System.out.println("Child Thread is Ended");
	}
		

}
