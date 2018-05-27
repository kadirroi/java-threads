package com.roi.thread;

public class UsingWaitNotifyMethods {

	public static void main(String[] args) {

		Message msg = new Message("Hello");
		Waiter waiter = new Waiter(msg);
		Thread th1 = new Thread(waiter, "waiter");
		th1.start();

		Waiter waiter1 = new Waiter(msg);
		Thread th2 = new Thread(waiter1, "waiter2");
		th2.start();

		Notifier notifier = new Notifier(msg);
		Thread th3 = new Thread(notifier, "notifier");
		th3.start();

		System.out.println("All the threads are started");

		// Result :
		// waiter waiting thread to get notified at time
		// waiter2 waiting thread to get notified at time
		// All the threads are started
		// waiter waiter thread to got notified at time
		// waiter processed: notifier Welcome
		// waiter2 waiter thread to got notified at time
		// waiter2 processed: notifier Welcome

	}
}
