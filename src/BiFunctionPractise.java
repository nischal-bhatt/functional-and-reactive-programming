import java.util.function.BiFunction;

public class BiFunctionPractise {

	public static void main(String[] args)
	{
		BiFunction<String, String, Integer> bifunction 
		    =(a,b) -> Integer.parseInt(a)+ Integer.parseInt(b);
		    
		    int gh =bifunction.apply("7", "66");
	        System.out.println(gh);
	}
}
