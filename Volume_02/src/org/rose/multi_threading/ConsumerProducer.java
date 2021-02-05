package org.rose.multi_threading;

public class ConsumerProducer {
	public static void main(String[] args) {
		Factory factory = new Factory();
		new Consumer(factory);
		new Producer(factory);
	}
}
