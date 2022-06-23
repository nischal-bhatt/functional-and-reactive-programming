
public class FunctionalGenericsImpl {

	public static void main(String[] args) {

		FunctionalGenerics <String,String> fun = s -> s.substring(1,5);
		
		String q=fun.execute("hello!!");
	    System.out.println(q);
	    
	    FunctionalGenerics <String,Integer> fun1 = s-> s.length();
	    int g = fun1.execute("nishal");
	    System.out.println(g);
	}

}
