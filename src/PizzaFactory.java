
public abstract class PizzaFactory {
	public static PizzaFactory getFactory(String type)
			{
		PizzaFactory pizza;
		if(type.equalsIgnoreCase("SN"))
		{
			pizza=new PizzaSN();
		}else if(type.equalsIgnoreCase("USA")) {
			pizza= new PizzaUS();
		}
		else {
			pizza= new PizzaFR();
		}
		  return pizza;
			}
	//factory method
	
	public abstract AbstractPizzaReine Createpizzareine();
	
	public abstract AbstractPizzaOriental CreatepizzaOriental();
	
	public abstract AbstractPizzaFrm CreatepizzaFrom();
	

}
