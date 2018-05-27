package com.roi.thread;

public class UsingThreadSafety {

	public static void main(String[] args) {

		Counter counter = new Counter();
		Thread th1 = new Thread(counter, "th1");
		th1.start();

		Thread th2 = new Thread(counter, "th2");
		th2.start();

		// waiting for threads to finish execution
		try {
			th1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			th2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        //We except that counting will be result as 10 cause there are two threads
		//each one will increase by 1 with for loop but we will see that result wont be 10
		//cause the variable count is not atomic operations in java level and not thread safe
		//Result 8
		System.out.println("Result "+counter.getCount());
	}

}
