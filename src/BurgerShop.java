import java.util.function.Function;

public class BurgerShop {

	Function<Burger,Burger> decoration;
	
	public Burger use(Burger baseBurger)
	{
		System.out.println("base burger " + baseBurger);
		return decoration.apply(baseBurger);
	}
	
	public BurgerShop(Function<Burger,Burger> burgerFunc)
	{
		this.decoration = burgerFunc;
	}
	
}
