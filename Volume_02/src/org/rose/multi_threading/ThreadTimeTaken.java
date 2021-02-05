package org.rose.multi_threading;

public class ThreadTimeTaken {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		One one = new One();
		Thread th = new Thread(one);
		th.start();
		long end = System.currentTimeMillis();
		System.out.println("Time taken by "+Thread.currentThread()+" to execute is : "+(start-end));
	}
}
