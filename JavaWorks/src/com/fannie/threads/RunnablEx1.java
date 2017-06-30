package com.fannie.threads;
class YourJob{}

class MyJob extends YourJob implements Runnable {
				Thread t;
    public MyJob() {}
	public MyJob(String threadName, int priority) {
		t = new Thread(this, threadName);
		t.setPriority(priority);
		t.start();

	}

	@Override

	public void run() {

		for (int i = 0; i < 500; i++) {
			System.out.println("IValue is" + i + " In thread" + Thread.currentThread().getName());
		}
		System.out.println("Thread" + Thread.currentThread().getName() + "exitting");
	}
}

public class RunnablEx1 {

	public static void main(String[] args) {
		MyJob m1 = new MyJob("senthil",6);	
		MyJob m2 = new MyJob("senthil1",7);
		MyJob m3 = new MyJob("senthil2",8);
		Thread t1 = new Thread(new MyJob());
		t1.setName("senthil");
		t1.setPriority(6);
		t1.start();
	}

	}


