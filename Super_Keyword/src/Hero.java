
public class Hero extends Person {
	
	String power;
	
	Hero(String name, int age, String power){
		
		super(name, age); //takto rikam tyhle hodnoty vem a posli je nahoru 
		//this.name = name; //bylo by jen v classe musim to poslat nahoru do rodice
		//this.age = age;
		this.power = power;
		

		
	}
	
	public String toString() {
		return super.toString()+this.power;
	}
}
