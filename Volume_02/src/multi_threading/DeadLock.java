package multi_threading;

public class DeadLock extends Thread{
	First fe = new First();
	Second se = new Second();
	
	public DeadLock() {
		Thread th = new Thread(this,"Racing");
		th.start();
		
		fe.firstMethod(se);
		System.out.println("Back in main thread");
	}
	
	public void run() {
		se.secondMethod(fe);
		System.out.println("Back in other thread");
	}
	
	public static void main(String[] args) {
		new DeadLock();
	}
}

class First{
	public synchronized void firstMethod(Second se) {
		System.out.println(Thread.currentThread().getName() + " entered in firstMethod()");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " calling lastMethod()");
		se.lastMethod();
	}
	public synchronized void lastMethod() {
		System.out.println(Thread.currentThread().getName() + " entered in lastMethod()");
	}
}

class Second{
	public synchronized void secondMethod(First fe) {
		System.out.println(Thread.currentThread().getName() + " entered in secondMethod()");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " calling lastMethod()");
		fe.lastMethod();
	}
	public synchronized void lastMethod() {
		System.out.println(Thread.currentThread().getName() + " entered in lastMethod()");
	}
}
