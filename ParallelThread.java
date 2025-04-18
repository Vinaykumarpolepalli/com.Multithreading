package com.Multithreading;

	//class Task1 implements Runnable {
class Task1 extends Thread{
	    public void run() {
	        for (int i = 1; i <= 5; i++) {
	            System.out.println( "Thread  1:"+ i);
	            try {
	                Thread.sleep(5000);
	            } catch (InterruptedException e) {
	                System.out.println(" Interrupted ");
	            }
	        }
	    }
	}

	//class Task2 implements Runnable {
class Task2 extends Thread{
	    public void run() {
	        for (int i = 1; i <= 5; i++) {
	            System.out.println( "Thread 2:"+ i);
	            try {
	                Thread.sleep(5000);
	            } catch (InterruptedException e) {
	                System.out.println("Interrupted 2");
	            }
	        }
	    }
	}

	public class ParallelThread {
	    public static void main(String[] args) {
	    	Task1  ta1 = new Task1();
	    	Task2  ta2 = new Task2();
//	        Thread t1 = new Thread(ta1);
//	        Thread t2 = new Thread(ta2);

	        ta1.start();
	        ta2.start(); 
	    }
	}



