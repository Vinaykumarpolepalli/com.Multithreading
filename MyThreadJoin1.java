package com.Multithreading;

class JThread1 extends Thread {

	@Override
	public void run() {
		int sum = 0;
		for (int i = 0; i <= 50; i++) {
			System.out.println("JThread1 :" + i);
			sum  = sum +i;
		}
		System.out.println("JThread 1 sum value :"+sum);
		System.out.println("JThread 1 Ended");
	}
}

class JThread2 extends Thread {
	JThread1 jt1;
	JThread2 (JThread1 jt1){
		this.jt1=jt1;
		
	}
	
	@Override
	public void run() {
		int sum = 0;
		for (int i = 50; i <= 100; i++) {
			if(i == 75) {
				try {
					jt1.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				
			
				}
				System.out.println("JThread2 :" + i);
				sum  = sum +i;
			}
		}
		System.out.println("JThread 2 sum value :"+sum);
		System.out.println("JThread 2 Ended");
	}
}

class JThread3 extends Thread {
	@Override
	public void run() {
		int sum = 0;
		for (int i = 100; i <= 150; i++) {
			
				System.out.println("JThread3 :" + i);
				sum  = sum +i;
			
		}
		System.out.println("JThread  2 sum value :"+sum);
		System.out.println("JThread 3 Ended");
	}
}

public class MyThreadJoin1 {

	public static void main(String[] args) {
		JThread1 jt1 = new JThread1();
		JThread2 jt2 = new JThread2(jt1);
		JThread3 jt3= new JThread3();
		
		jt1.start();
		jt2.start();
		jt3.start();

	}

}
