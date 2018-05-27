package com.roi.thread;

public class Counter implements Runnable {

	private int count;

	@Override
	public void run() {
		for (int i = 0; i < 6; i++) {
			processSomething(i);
			count++;
		}

	}

	private void processSomething(int i) {
		// processing job
		try {
			Thread.sleep(i * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
}
