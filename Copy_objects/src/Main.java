
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car("Chevrolet","Model",2023);
		//Car car2 = new Car("BMW","M3",2021);
		
		//car2 = car1; // nebudou dva separatni obejkty ale jeden, kdy oba atributy budou ukazovat na to same
		
		//car2.copy(car1); //uz musi existovat nevytvori novy jen prepise 
		
		Car car2 =new Car(car1); //vytvori a okopiruje
		
		
		System.out.println(car1);
		System.out.println(car2);
		System.out.println();
		System.out.println(car1.getMake());
		System.out.println(car2.getMake());
	}

}
