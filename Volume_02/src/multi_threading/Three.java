package multi_threading;
class Three implements Runnable{
	public void run(){
		long start = System.currentTimeMillis();
		
		System.out.println("Three run() started");
		for (int i=0; i<10;i++){
//			System.out.println("----------Active Threads are : "+Thread.activeCount());
			System.out.println("Three run() "+i+" "+Thread.currentThread());
		}
		System.out.println("Three run() ended");
		
		long end = System.currentTimeMillis();
		System.out.println("Time taken by "+Thread.currentThread()+" to execute is : "+(end-start)+" millisec");
	}
}
