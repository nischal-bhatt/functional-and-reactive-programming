
public class LambdaExampleOne {

	public static void main(String[] args) throws InterruptedException {

		// MyRunnable runnable = new MyRunnable();
		// Thread t = new Thread(runnable);
		// t.start();

		// Thread t = new Thread(new Runnable() {

		// @Override
		// public void run() {
		// System.out.println("thread executed inner class");

		// }

		// });
		// t.start();

		// Runnable r = () -> System.out.println("from inside lambda");

		// Thread t = new Thread(r);
		// t.start();

		Thread t = new Thread(() -> System.out.println("hi"));
		t.start();

		System.out.println("in main");
		// lambdas can be used for interfaces having 1 abstract method only

	}

}
