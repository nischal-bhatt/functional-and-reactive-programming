import java.util.List;
import java.util.function.Consumer;

public class ConsumerPractise {

	public static void main(String[] args) {

		List<Integer> list = List.of(34,67,8,23,67,89,90);
		//use method references at places where we use lambda
		Consumer<Integer> consumer = ConsumerPractise::haha;
		
		consumer.accept(56);
		System.out.println(" ");
		printList(list,consumer);
	}

	private static<T> void printList(List<T> list,Consumer<T> consumer) {
		
		for (T t : list)
		{
			consumer.accept(t);
		}
		
	}
	
	private static void haha(int r)
	{
		System.out.println(r);
	}

}
