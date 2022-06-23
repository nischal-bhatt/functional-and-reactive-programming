import java.util.Optional;

public class PersonExample {

	public static void main(String[] args) {

		String val = "A String";
		
		Optional<String> optional = Optional.of(val);
		
		Optional<Integer> empty = Optional.empty();
		
		Optional<String> nullable = Optional.ofNullable(val);
		Optional<String> nullable2 = Optional.ofNullable(null);
		
		Integer a = 10;
		Optional<Integer> optional1 = Optional.of(a);
		
		Integer integer = optional1.get();
		System.out.println(integer);
		
		//Integer integer2 = empty.get();
		//System.out.println(integer2);
		
		Integer vall = empty.isPresent() ? empty.get() : 0;
		System.out.println( vall );
		
		Integer orElse = optional1.orElse(3);
		
		System.out.println(orElse);
		
		
		Integer a1=empty.orElseGet(()->0);
	    
		System.out.println(a1);
		
		Integer a4 = empty.orElseThrow(()-> new IllegalArgumentException());
		System.out.println(a4);
	}

}
