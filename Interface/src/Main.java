
public class Main {

	public static void main(String[] args) {
		// Interfaces - tamplate can be applied to a class similar to inheratance
		// inheritanc je omezen na jednu super classu ale toto ne 
		
		
		Rabbit rabbit = new Rabbit();
		
		rabbit.flee();
		
		Hawk hawk = new Hawk();
		
		hawk.hutn();
		
		
		Fish fish = new Fish();
		fish.hutn();
		fish.flee();

	}

}
