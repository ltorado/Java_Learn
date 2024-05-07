
public class Main {

	public static void main(String[] args) {
		// schopnot objektu identifikovat jeden nebo vice data typu
		
		Car car = new Car();
		Bicycle bicycle = new Bicycle();
		Boat boat = new Boat();
		
		//Car[] racers = {car, bicycle,boat}; // ulozi jen jednu ale ja chci vsechny 
		Vehicle[] racers = {car, bicycle,boat}; // mohu pozut superclassu
		
		car.go(); // funguje ale je lepsi zapis
		
		for(Vehicle x : racers) {
			
			x.go(); //musi byt ve vehicle go definovany
			
		}
		

	}

}
