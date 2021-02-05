package org.rose.multi_threading.threadGroup;

public class ThreadGroupDemo {
	public static void main(String[] args) {

		ThreadGroup grp1 = new ThreadGroup("Group AA");
		ThreadGroup grp2 = new ThreadGroup("Group BB");
		
		ThreadGroupEx th1 = new ThreadGroupEx(grp1,"Thread 11");
		ThreadGroupEx th2 = new ThreadGroupEx(grp1,"Thread 22");
		ThreadGroupEx th3 = new ThreadGroupEx(grp2,"Thread 33");
		ThreadGroupEx th4 = new ThreadGroupEx(grp2,"Thread 44");
		
		grp1.list();
		grp2.list();
		
		System.out.println("Suspending grp1");
		grp1.suspend();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Resuming grp1");
		grp1.resume();
		
//		th1.
	}
}
