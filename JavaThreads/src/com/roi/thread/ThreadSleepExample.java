package com.roi.thread;

public class ThreadSleepExample {

	public static void main(String[] args) throws InterruptedException {
		
		//to get current date now
		long start = System.nanoTime();
		
		
		//if you want to pause the current execution
		//you can call this method in your program as a developer
		Thread.sleep(5000);
		//Calculating elapsed time  to get current date now
		long end = System.nanoTime()-start;

		//Elapsed Time :5000507668
		//if you run this program ,you will notice 
		//that Elapsed time is grater than thread sleep time
		//this concerns with operating system specific implementation of thread scheduler
		System.out.println("Elapsed Time :"+end);
	}

}
