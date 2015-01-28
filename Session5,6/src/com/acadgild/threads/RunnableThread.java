package com.acadgild.threads;


class RunnableThread extends Thread {

	Thread runner;
	public RunnableThread() {
	}
	

		public void run() {
		//Display info about this particular thread
		System.out.println(Thread.currentThread());
	}
}
