package multi_threading;

public class Producer implements Runnable {
	Factory factory;
	public Producer(Factory factory) {
		this.factory = factory;
		new Thread(this,"producer").start();
	}
	@Override
	public void run() {
		int i = 1;
		while(i<=10) {
			factory.produce(i++);
		}
	}

}
