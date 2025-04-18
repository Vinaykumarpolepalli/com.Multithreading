package com.Multithreading;

class SThread1 extends Thread{
	@Override
	public void run() {
		for(int i =0;i<=10;i++) {
			System.out.println("S Thread 1:"+i);
			try {
				Thread.sleep(1000);
				
			}catch (InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

public class MyThreadSleep2 {

	public static void main(String[] args) {
		System.out.println("Main method is Started");
		SThread1 st1 = new SThread1();
		st1.start();
		st1.interrupt();
		
		for( int i = 0; i<=10;i++) {
			System.out.println("Main thread :"+i);
		}

	}

}
