package encapsulation;

public class Main {

	public static void main(String[] args) {
		// Encapsulation - atributy ve tride mohou byt skryte nebo privatni 
		// pristupy pres getter a setter
		
		Car car = new Car("Chevrolet", "Camaro", 22);
		
		//System.out.println(car.make); // nepujde kdyz je privatni
		System.out.println(car.getMake()); // nepujde kdyz je privatni
	
		//car.year = 23; // nepujde je private
		
		car.setYear(23);
	
	}

}
