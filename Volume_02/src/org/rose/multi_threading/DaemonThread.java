package org.rose.multi_threading;

public class DaemonThread implements Runnable{
	
	public DaemonThread() {
		Thread th = new Thread(this);
		th.setDaemon(true);
		th.start();
	}

	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println(Thread.currentThread().isDaemon()+" run "+i);
		}
	}
	
	public static void main(String[] args) {
		DaemonThread th = new DaemonThread();
		for(int i=0; i<100; i++) {
			System.out.println(Thread.currentThread().isDaemon()+" main "+i);
		}
	}

}
