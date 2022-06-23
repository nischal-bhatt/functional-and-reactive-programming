import java.util.Optional;

public class MoreOptionals {

	public static void main(String[] args) {

		Optional<String> optional = Optional.of("value");
		
		optional.ifPresent((val)->  System.out.println(val) );
		Optional<String> optional1 = Optional.of("val");
		
		
		System.out.println(optional1);
		boolean equals2 = optional.equals(optional1);
		System.out.println(equals2);
		
		
		int hashCode = optional.hashCode();
		System.out.println(hashCode);
	}

}
