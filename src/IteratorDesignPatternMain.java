
public class IteratorDesignPatternMain {

	public static void main(String[] args) {
		
		MyArrayList list = new MyArrayList(new Object[] {1,2,3,8,9,16});
		
		list.forEach(System.out::println);

	}

}
