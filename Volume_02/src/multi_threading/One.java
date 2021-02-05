package multi_threading;
class One implements Runnable{
	public void run() {
		long start = System.currentTimeMillis();
		
//		System.out.println("----------Active Threads are : "+Thread.activeCount());
		System.out.println("One run() started");
		for (int i=0; i<10;i++){
//			System.out.println("----------Active Threads are : "+Thread.activeCount());
			Two two = new Two();
			Thread th = new Thread(two);
			th.setName("ThreadNic-"+i);
			th.start();
			System.out.println("One run() "+i+" "+Thread.currentThread());
//			try{
//				Thread.sleep(100);
//			}
//			catch(Exception e){
//				System.err.println("errrrror");
//			}
		}
		System.out.println("One run() ended");
		
		long end = System.currentTimeMillis();
		System.out.println("Time taken by "+Thread.currentThread()+" to execute is : "+(end-start)+" millisec");
	}
}
