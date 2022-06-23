
public class LengthOfStringImpl {

	public static void main(String[] args) {

		LengthOfString ls = (y) -> {
			return y.length();
		};

		int returned = ls.length("bni");

		System.out.println(returned);

		LengthOfString ls1 = (y) -> {

			String r = "ord";
			String x = "nish";

			return (r + x).length();

		};

		int returned1 = ls1.length("something");

		System.out.println(returned1);
	}

}
