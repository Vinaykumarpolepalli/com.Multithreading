package com.Multithreading;

public class MyThread2 extends Thread {

	public static void main(String[] args) {
		System.out.println("Main method is Started");

		MyThread2 m = new MyThread2();
		m.start();
		

		for(int i =1;i<=10;i++) {
			System.out.println("Main"+i);
		}
		
		System.out.println("Main method is Ended");

			
		}
	@Override
	public void run() {
		for(int i =1;i<=10;i++) {
			System.out.println("Hai"+i);
			
		}
	}
		
		public void run(int a) {
			for(int i =1;i<=10;i++) {
				System.out.println("Hai with hai"+i);
				
			
		}
	}

}
