import java.util.function.BinaryOperator;

public class BinaryOperatorPractise {

	public static void main(String[] args) {

		BinaryOperator<String> biOp
		   = (x,y) -> x + "." + y;
		   
		  String r= biOp.apply("hi", "john");
	      System.out.println(r);
	}

}
