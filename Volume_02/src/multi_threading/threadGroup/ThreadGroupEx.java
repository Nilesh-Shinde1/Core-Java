package multi_threading.threadGroup;

public class ThreadGroupEx implements Runnable {
	String name;

	public ThreadGroupEx(ThreadGroup thg, String name) {
		this.name = name;
		new Thread(thg, name).start();
	}

	@Override
	public void run() {
		try {
			for (int i = 1; i <= 10; i++) {
				System.out.println(name + " : " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println(name + " interupted..");
			e.printStackTrace();
		}
		System.out.println("exiting "+name);
	}

}
