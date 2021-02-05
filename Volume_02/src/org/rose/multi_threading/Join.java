package org.rose.multi_threading;

public class Join extends Thread{
	
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(Thread.currentThread().getName() + "  "+i);
			if(Thread.currentThread().getName().equals("child2")) {
				try {
					Thread.currentThread().sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main start");
		Join j1 = new Join();
		j1.setName("child1");
		j1.start();
		Join j2 = new Join();
		j2.setName("child2");
		j2.start();
		
		j1.join();
		j2.join();
		System.out.println("main end");
	}
	
}
