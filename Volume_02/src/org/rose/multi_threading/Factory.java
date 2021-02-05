package org.rose.multi_threading;

public class Factory {
	int items;
	boolean isAvailable;
	
	synchronized void produce(int items) {
		if(isAvailable) {
			try {
//				wait();
				wait(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.items = items;
		isAvailable = true;
		System.out.println("Produced items "+items);
//		notify();
	}
	
	synchronized void consume() {
		if(!isAvailable) {
			try {
//				wait();
				wait(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Items consumed "+items);
		isAvailable = false;
//		notify();
	}
}
