package multi_threading;

public class ThreadPriority {
	
	static {
		Thread th = Thread.currentThread();
		System.out.println("SB is executed in .."+th.getName());
	}
	{
		Thread th = Thread.currentThread();
		System.out.println("NSB is executed in .."+th.getName());
	}
	public static void main(String[] args) {
		System.out.println("main start");
		Two two = new Two();
		Thread th1 = new Thread(two);
		Three three = new Three();
		Thread th2 = new Thread(three);
		
		th1.setPriority(9);
		th2.setPriority(1);
		
		th1.start();
		th2.start();
		
//		ThreadPriority th = new ThreadPriority();	//to execute NSB
		System.out.println("main end");
	}
}
