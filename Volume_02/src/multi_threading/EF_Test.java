package multi_threading;
class EF_Test {
	public static void main(String[] args) {
		System.out.println("Case : 01 -------------------------------");
		Thread th1=new Thread();
		th1.start();
		System.out.println("Case : 02 -------------------------------");
		MyThread mt=new MyThread();
		mt.start();
		System.out.println("Case : 03 -------------------------------");
		MyRunnable mr=new MyRunnable();
//		mr.start();
		System.out.println("Case : 04 -------------------------------");
		Thread th2=new Thread(mr);
		th2.start();
		System.out.println("Case : 05 -------------------------------");
		Thread th3=new Thread(mt);
		th3.start();
		System.out.println("Case : 06 -------------------------------");
		Thread th4=new MyThread();
		th4.start();
		System.out.println("Case : 07 -------------------------------");
//		Thread th5=new MyRunnable();
//		th5.start();
		System.out.println("Case : 08 -------------------------------");
		Runnable r1=new MyRunnable();
//		r1.start();
		System.out.println("Case : 09 -------------------------------");
		Thread th6=new Thread(r1);
		th6.start();
		System.out.println("Case : 10 -------------------------------");
		Runnable r2=new MyThread();
//		r2.start();
		System.out.println("Case : 11 -------------------------------");
		Thread th7=new Thread(r2);
		th7.start();
		System.out.println("Case : 12 -------------------------------");
		MyRunnable mr2=new MyRunnable();
		MyThread mt2=new MyThread(mr2);
		mt2.start();
	}
}
