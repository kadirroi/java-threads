package com.roi.thread;

public class Notifier implements Runnable {

	private Message msg;

	public Notifier(Message msg) {

		this.msg = msg;

	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();

		// Notifier thread started
		synchronized (msg) {
			msg.setMsg(name + " Welcome");
			// notify method wakes up only one thread waiting on object
			msg.notify();
			//notifyAll Method wakes up all thread waiting on object
			msg.notifyAll();
		}

	}
}
