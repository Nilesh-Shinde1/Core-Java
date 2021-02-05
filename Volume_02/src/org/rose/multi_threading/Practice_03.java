package org.rose.multi_threading;

public class Practice_03 {
	public static void main(String[] args) {
		//Total threads = 10(of Two) + 1(of One) + 1(main) = 12
		System.out.println("......main started......"+Thread.currentThread());
//		System.out.println("----------Active Threads are : "+Thread.activeCount());
		One one = new One();
		Thread th = new Thread(one);
		th.setName("NileshOneThread");
		th.start();
		System.out.println("......main ended......"+Thread.currentThread());
	}
}
