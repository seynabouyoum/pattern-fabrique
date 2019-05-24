
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pays="fr";
		
		PizzaFactory pizza;
		pizza= PizzaFactory.getFactory(pays);
		
		AbstractPizzaReine n= pizza.Createpizzareine();
		n.getPays();
		
		
		
		AbstractPizzaOriental b= pizza.CreatepizzaOriental();
		b.getPays();
		
		
		
		AbstractPizzaFrm c= pizza.CreatepizzaFrom();
		c.getPays();
		
		
		System.out.println(n.toString());
		System.out.println(b.toString());
		System.out.println(c.toString());
		

	}

}
