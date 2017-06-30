package com.fannie.threads;

class BusinessLogic extends Thread {

	public void run() {

		for (int i = 0; i < 500; i++) {
			System.out.println("IValue is" + i + " In thread" + Thread.currentThread().getName());
		}

		System.out.println("Thread" + Thread.currentThread().getName() + "exsiting");
	}
}

public class ThreadEx1 {

	public static void main(String[] args) {
		// if the class main method then is it thread class
		System.out.println("Thread Name:" + Thread.currentThread().getName());
		// Min Priority = 1
		// Max_Priority =
		System.out.println("Priority");
		Thread.currentThread().getPriority();

		BusinessLogic bl1 = new BusinessLogic();
		bl1.setPriority(Thread.NORM_PRIORITY + 1); // ---6
		bl1.start();

		int bl1priority = bl1.getPriority();
		BusinessLogic bl2 = new BusinessLogic();
		bl2.setPriority(bl1priority + 1);
		bl2.start();
		for (int i = 0; i < 500; i++) {
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("IValue is" + i + " In thread" + Thread.currentThread().getName());
		}

		try {
			bl1.join();
			bl2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread" + Thread.currentThread().getName() + "exitting");

	}

}
