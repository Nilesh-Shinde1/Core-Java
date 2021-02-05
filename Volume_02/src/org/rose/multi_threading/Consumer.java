package org.rose.multi_threading;

public class Consumer implements Runnable {
	Factory factory;
	
	public Consumer(Factory factory) {
		this.factory = factory;
		new Thread(this, "consumer").start();
	}
	@Override
	public void run() {
		int i = 1;
		while(i<=10) {
			factory.consume();
			i++;
		}
	}

}
