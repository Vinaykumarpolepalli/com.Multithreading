package com.Multithreading;

public class MyThread4  implements Runnable {

	@Override
	public void run() {
		System.out.println("Main run Method");
		for (int i = 0; i <= 50; i++) {
			System.out.println("Run:" + i);
		}
	}

	public static void main(String[] args) {
		System.out.println("Main Method is Started");
		MyThread4 m = new MyThread4();
		Thread t = new Thread(m);
		t.start();
		//t.start();java.lang.IllegalThreadStateException
		
		for (int i = 0; i <= 100; i++) {
			System.out.println("main:"+i);
		}
	
		System.out.println("Main method is Ended");
	}

}
