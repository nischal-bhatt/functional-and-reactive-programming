import java.util.function.BiFunction;

public class BiFunctionPractise {

	public static void main(String[] args)
	{
		BiFunction<String, String, String> bifunction 
		    =A_Class:: staticMethod;
		    
		    String gh =bifunction.apply("7", "66");
	        System.out.println(gh);
	}
}

class A_Class {
	
	static String staticMethod(String a, String b)
	{
		return a + b;
	}
}
