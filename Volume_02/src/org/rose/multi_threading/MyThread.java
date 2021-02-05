package org.rose.multi_threading;
class MyThread extends Thread {
	MyThread(){
		super();
	}
	MyThread(Runnable r){
		super(r);
	}
	public void run() {
		System.out.println("		MyThread : run()");
	}
}
