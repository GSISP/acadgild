package com.acadgild.threads;

public class RunnableExample {

	public static void main(String[] args) {
		Thread download = new Thread(new RunnableThread(), "download");
		Thread transfer = new Thread(new RunnableThread(), "transfer");
		//Start the threads
		download.start();
		transfer.start();
		try {
			Thread.currentThread();
			//delay for one second
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		//Display info about the main thread
		System.out.println(Thread.currentThread());
	}
}
