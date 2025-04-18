package com.Multithreading;

public class MyThread5Sleep  extends Thread {
	
	public void run() {
		System.out.println("Run method is runninig");
	}

	public static void main(String[] args) throws InterruptedException  {
		System.out.println("Main Method is Started");
		MyThread5Sleep t = new MyThread5Sleep();
		t.start();
		Thread.sleep(3000);
		
		System.out.println("Main method is wait for 3seconds");
	}
	
	
}
//public class MainThreadSleepExample {
//    public static void main(String[] args) {
//        System.out.println("Main thread starting...");
//
//        try {
//            Thread.sleep(3000); // Pause for 3 seconds (3000 milliseconds)
//        } catch (InterruptedException e) {
//            System.out.println("Main thread interrupted.");
//        }
//
//        System.out.println("Main thread resumed after sleep.");
//    }



