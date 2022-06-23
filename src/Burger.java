
public class Burger {
  
	private String burgerType;
	
	public Burger()
	{
		this.burgerType = "";
	}
	
	private Burger(String burgerType)
	{
		this.burgerType = burgerType;
	}
	
	public Burger addVeggies()
	{
		System.out.println("adding vegie to b");
		return new Burger(this.burgerType += " vegie ");
	}
	
	public Burger addCheese()
	{
		System.out.println("adding cheese to b");
		return new Burger(this.burgerType += " cheese ");
	}

	@Override
	public String toString() {
		return "Burger [burgerType=" + burgerType + "]";
	}
	
	
}
