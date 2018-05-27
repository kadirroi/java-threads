package com.roi.thread;


//Thread class implements runnable interface!!
//class Thread implements Runnable 
public class ThreadFromExtendThreadClass extends Thread {

	
	public ThreadFromExtendThreadClass(String name) {
		super(name);
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
	
}
