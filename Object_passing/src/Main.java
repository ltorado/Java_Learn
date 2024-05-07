
public class Main {

	public static void main(String[] args) {
		// autopassing - posilani objektu do objektu , stejne jak string on je to vlastne take objekt
		
		Garage garage = new Garage();
		Car car1 = new Car("BMW");
		Car car2 = new Car("Honda");
		
		garage.park(car1);
		garage.park(car2);

	}

}
