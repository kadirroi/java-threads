package com.roi.thread;

public class Test {

	public static void main(String[] args) {

		/*
		 * Starting Runnable Threads Ending Runnable Threads Doing heavy processing like
		 * fetching or deleting record from database : t2 Doing heavy processing like
		 * fetching or deleting record from database : t1 Starting name of current
		 * thread :t1 Starting name of current thread :t2 Ending name of current thread
		 * :t2 Ending name of current thread :t1
		 */

		ThreadFromRunnableInterface t1 = new ThreadFromRunnableInterface("t1");
		ThreadFromRunnableInterface t2 = new ThreadFromRunnableInterface("t2");

		Thread th1 = new Thread(t1, t1.getName());

		Thread th2 = new Thread(t2, t2.getName());

		System.out.println("Starting Runnable Threads");
		th1.start();
		th2.start();
		System.out.println("Ending Runnable Threads");

		/*Starting ThreadFromExtendThreadClass
		 ThreadFromExtendThreadClass has been started
		 Doing heavy processing like fetching or deleting record from database : t3
		 Doing heavy processing like fetching or deleting record from database : t4
		 Starting name of current thread :t3
		 Starting name of current thread :t4
		 Ending name of current thread :t3
		 Ending name of current thread :t4 
		 */
		
		Thread th3 = new ThreadFromExtendThreadClass("t3");
		Thread th4 = new ThreadFromExtendThreadClass("t4");
		System.out.println("Starting ThreadFromExtendThreadClass");
		th3.start();
		th4.start();
		System.out.println("ThreadFromExtendThreadClass has been started");

	}

}
