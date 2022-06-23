
public class MyOwnFunctionalInterfaceExample {

	public static void main(String[] args) {

		FunctionalInterfaceIsBehindLambda f = () -> System.out.println("heya");
		
		f.myMethod();
		
		onThefly(f);
		onThefly(()-> System.out.println("hehe"));
	}
	
	public static void onThefly(FunctionalInterfaceIsBehindLambda r)
	{
		r.myMethod();
	}
	

}
