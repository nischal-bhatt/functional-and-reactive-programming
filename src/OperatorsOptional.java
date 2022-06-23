import java.util.Optional;

public class OperatorsOptional {

	public static void main(String[] args) {

		  //Optional<String> optional = Optional.of("hey");
		  Optional<String> optional = Optional.empty();
		  //transforming the value
		  Optional<String> map = optional.map(val -> "replaced");
	      
		  System.out.println(map.orElseGet(()-> "hey"));
		  
		  
		  Optional<String> filter = optional.filter(val-> val.equals("hey"));
	      System.out.println(filter.orElse("noval"));
	      
	      
	      Optional<String> flatMap = optional.flatMap(val->Optional.of("replaced"));
	      System.out.println(flatMap.orElse("none"));
	}

}
