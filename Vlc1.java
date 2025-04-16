package com.Multithreading;

class Videoinfo extends Thread {
	// @Override the run method from Tread class
	public void run() {

		for (int i = 0; i <= 10; i++) {
			System.out.println("videoinfomation " + i);
		}
	}

}

class Audioinf  extends Thread{
	// @Override the run method from Tread class
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Audiopinfomation " + i);
		}
	}

}

class Timmer extends Thread{

	// @Override the run method from Tread class
	public void run() {

		for (int i = 0; i <= 10; i++) {
			System.out.println("Timmerinfomation " + i);
		}
	}
}

	public class Vlc1 {

	public static void main(String[] args) {
		System.out.println("Main method is started");
		Videoinfo v1 = new Videoinfo();
		Audioinf a1 = new Audioinf();
		Timmer t1 = new Timmer();
		
		v1.start();
        a1.start();
		t1.start();
	}
		

	

}
