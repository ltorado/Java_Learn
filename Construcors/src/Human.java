
public class Human {
	
	String name;
	int age;
	double weight;
	
	Human(String name, int age, double weight){ //konstruktor
		this.name = name; //proc this, aby jsme rikali objektu ze se jedna prave o ten co je volany a ne o vseobecny
		this.age=age;
		this.weight=weight;
				
	}
	
	void eat() {
		System.out.println(this.name + " eating");
		
	}
	
}
