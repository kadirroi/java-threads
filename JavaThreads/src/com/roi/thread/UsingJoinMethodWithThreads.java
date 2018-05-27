package com.roi.thread;

public class UsingJoinMethodWithThreads {

	public static void main(String[] args) {
		Thread th1 = new Thread(new ThreadRunnable(), "th1");
		Thread th2 = new Thread(new ThreadRunnable(), "th2");
		Thread th3 = new Thread(new ThreadRunnable(), "th3");
		th1.start();

		
		//Actually,there are three overload join methods which are
		//synchronized void join() ,synchronized void join(long millis),
		//synchronized void join(long millis, int nanos)
		
		// start second thread after th1 as a thread is waiting for 2 second or if it is
		// dead
		try {
			th1.join(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		th2.start();

		// Start th3 as a thread only when th1 as first thread is dead
		try {
			th1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		th3.start();

		// lets all thread finished execution before finishing main thread
		try {
			th2.join();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		try {
			th3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("All threads are dead ,exiting main thread");

		// Thread started : th1
		// Thread started : th2
		// Thread ended : th1
		// Thread started : th3
		// Thread ended : th2
		// Thread ended : th3
		// All threads are dead ,exiting main thread
	}

}

class ThreadRunnable implements Runnable {

	@Override
	public void run() {

		System.out.println("Thread started : " + Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread ended : " + Thread.currentThread().getName());

	}
}
