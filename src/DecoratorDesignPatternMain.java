
public class DecoratorDesignPatternMain {

	public static void main(String[] args) {

		Burger myOrder = new BurgerShop(burger -> burger.addVeggies())
				
				.use(
						new BurgerShop(burger -> burger.addCheese())
						.use(
								new Burger()
								)

				);

		System.out.println(myOrder);
	}

}
