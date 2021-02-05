package org.rose.multi_threading;
class Practice_01 extends Thread{
	public static void main(String[] args){
		System.out.println("main started"+Thread.currentThread());
		Practice_01 p1 = new Practice_01();
		Practice_02 p2 = new Practice_02();

		p1.setName("Practice_01(first) Thread");
		p2.setName("Practice_02(second) Thread");

		p1.start();
		p2.start();
		p1.m1();
		for (int i=0; i<10;i++){		
			System.out.println("main for"+Thread.currentThread());
		}
		p1.m2();
	
		System.out.println("main ended"+Thread.currentThread());
	}

	public void run(){
		System.out.println("run started"+Thread.currentThread());
		for (int i=0; i<10;i++){
			System.out.println("run for"+i+" "+Thread.currentThread());
			try{
				Thread.sleep(100);
			}catch(Exception e){
				System.out.println("Exception...!");				
			}
		}
		System.out.println("run ended"+Thread.currentThread());
	}

	public void m1(){		
		for (int i=0; i<10;i++){		
			System.out.println("m1 for"+i+" "+Thread.currentThread());
		}
	}

	public void m2(){		
		for (int i=0; i<10;i++){		
			System.out.println("m2 for"+i+" "+Thread.currentThread());
		}
	}
}

class Practice_02 extends Thread{
	public void run(){
		System.out.println("Practice_02 run started"+Thread.currentThread());
		for (int i=0; i<10;i++){
			System.out.println("Practice_02 run for"+i+" "+Thread.currentThread());
		}
		System.out.println("Practice_02 run ended"+Thread.currentThread());
	}
}