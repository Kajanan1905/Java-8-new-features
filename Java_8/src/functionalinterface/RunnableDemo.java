package functionalinterface;

class RunnableImpl implements Runnable {

	@Override
	public void run() {
		System.out.println("Run method called");
	}

}

public class RunnableDemo {

	public static void main(String[] args) {

		Thread thread = new Thread(new RunnableImpl());
		thread.start();

		Runnable runnable = () -> System.out.println("Run method called using lambda");
		Thread threadLambda = new Thread(runnable);
		threadLambda.start();

	}

}
