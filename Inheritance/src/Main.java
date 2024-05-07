
public class Main {

	public static void main(String[] args) {
		// Inheritance - proces kde tridy ziskava atribute metody.
		// vznikaji child class , ktere dedi veci od rodice 
		
		
		Car car = new Car();
		
		car.go();
		
		Bicycle bicycle = new Bicycle();
		
		bicycle.stop();
		
		System.out.println(bicycle.speed);
		System.out.println(car.doors); // to uz je specialni pro danou classu 
	}

}
