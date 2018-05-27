package com.roi.thread;

public class Waiter implements Runnable {

	private Message msg;

	public Waiter(Message msg) {
		this.msg = msg;
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		//provided thread safet with using synchronized
		synchronized (msg) {

			try {
				// waiting thread to get notified
				System.out.println(name + " waiting thread to get notified at time ");
				msg.wait();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			//Waiter thread to got notified 
			System.out.println(name +" waiter thread to got notified at time ");
		
			
			//Processing message after waiter thread to got notified
			System.out.println(name +" processed: "+msg.getMsg());

		}

	}
}
