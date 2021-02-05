package org.rose.multi_threading;

public class InlineThread {
	public static void main(String[] args) {
		new Thread() {
			public void run(){
				for(int i=1; i<=10;i++) {
					System.out.println(Thread.currentThread().getName() + "  "+i);
				}
			}
		}.start();
		
		for(int i=80; i<=90;i++) {
			System.out.println(Thread.currentThread().getName() + "  "+i);
		}
	}
}
