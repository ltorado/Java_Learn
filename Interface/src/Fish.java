
public class Fish implements Prey,Predator{

	@Override
	public void hutn() {
		System.out.println("fish hunt");
		
	}

	@Override
	public void flee() {
		System.out.println("fish is fleeing");
		
	}

}
