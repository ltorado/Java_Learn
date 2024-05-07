package toString;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new Car();
		
		//abych nemusel vyposovat car.maek ,car.model pouziji toString
		//udelma overaidng toString
		
		System.out.println(car.toString());
		
		
		System.out.println(car); // stejne
		
	}

}
