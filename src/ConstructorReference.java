import java.util.function.Function;

public class ConstructorReference {

	public static void main(String[] args) {
		
	Function<Runnable,Thread> threadGenereator=	 Thread::new;

	Runnable r = () -> System.out.println("task 1 executed");
	
	Runnable r1 = () -> System.out.println("task 2 executed");
	
	
    Thread thread1 = threadGenereator.apply(r);
	Thread thread2 = threadGenereator.apply(r1);
	
	thread1.start();
	thread2.start();
	
	threadGenereator.apply(()->System.out.println("heya")).start();
	
	
	}

}
