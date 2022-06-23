
public class LambdaUnderTheHood {

	public static void main(String[] args) {

		FunctionalInterfaceIsBehindLambda fun = new FunctionalInterfaceIsBehindLambda() {

			@Override
			public void myMethod() {
                  System.out.println("implementation 1");
			}

		};
		
		
		
		
		FunctionalInterfaceIsBehindLambda fun2 = new FunctionalInterfaceIsBehindLambda() {

			@Override
			public void myMethod() {
                  System.out.println("implementation 2");
			}

		};
		
		fun.myMethod();
		fun2.myMethod();
		// jar file becomes bulky
		
		
		FunctionalInterfaceIsBehindLambda fun3 = () -> System.out.println("im light weight");
		FunctionalInterfaceIsBehindLambda fun4 = () -> System.out.println("im also light weight");
		
		fun3.myMethod();
		fun4.myMethod();
	}

}
