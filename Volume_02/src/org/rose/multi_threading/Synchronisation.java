package org.rose.multi_threading;

public class Synchronisation {
	public static void main(String[] args) {
		Add a = new Add();
		new Thread1(a).start();
		new Thread2(a).start();
	}
}

class Thread1 extends Thread{
	Add a;
	public Thread1(Add a) {
		this.a = a;
	}
	public void run() {
		a.add(50, 60);
	}
}

class Thread2 extends Thread{
	Add a;
	public Thread2(Add a) {
		this.a = a;
	}
	public void run() {
		a.add(80, 90);
	}
}

class Add{
	private int x,y;
	public void add(int a, int b) {
//	public synchronized void add(int a, int b) {
		this.x = a;
		this.y = b;
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName()+" -> "+(x+y));
	}
}
