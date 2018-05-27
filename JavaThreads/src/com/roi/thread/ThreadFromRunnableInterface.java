package com.roi.thread;

/*
 * To make a class runnable ,we can implement  
 * runnable interface and provide implementation
 * in void run() method.
 * To use this class as a thread , we need to a create a thread object
 * by passing object of this runnable thread 
 * and then call start method to execute  run() method
 * */
public class ThreadFromRunnableInterface implements Runnable {

	private String name;

	public ThreadFromRunnableInterface(String name) {
		this.name = name;
	}

	@Override
	public void run() {

		System.out.println("Doing heavy processing like fetching or deleting record from database : "
				+ Thread.currentThread().getName());
		System.out.println("Starting name of current thread :" + Thread.currentThread().getName());

		try {
			waitMiliSecond(1000);
			// Get database connection and then delete unused from database
			doDatabaseProcessing();

		} catch (InterruptedException e) {

		}

		System.out.println("Ending name of current thread :" + Thread.currentThread().getName());

	}

	private void waitMiliSecond(long milisecond) throws InterruptedException {
		Thread.sleep(milisecond);
	}

	private void doDatabaseProcessing() throws InterruptedException {
		waitMiliSecond(5000);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
