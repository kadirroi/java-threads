package com.roi.thread;

public class UsingJoinMethodWithThreads {

}


class ThreadRunnable implements Runnable{

	@Override
	public void run() {
		try {
			Thread.sleep(4000);
		} catch (Exception e) {
			
		}
		
	}
}
