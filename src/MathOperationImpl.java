
public class MathOperationImpl {

	public static void main(String[] args) {

		MathOperation mo = (a, b) -> System.out.println(a + b);
		MathOperation mo1 = (a, b) -> System.out.println(a * b);

		mo.operation(10, 20);
		mo1.operation(10, 20);

	}

}
