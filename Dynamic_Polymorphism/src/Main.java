import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// Po kompilaci behem runtime 
		
		Animal animal; //jen jej deklaruji a az v behu se rozhodne co to bude
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("What animal do zou want");
		System.out.println("1 = dog or 2 = cat ");
		int choice = scanner.nextInt();
		
		if(choice ==1) {
			animal = new Dog();
			animal.speak();
		}else if (choice == 2) {
			animal = new Cat();
			animal.speak();
		}else {
			animal = new Animal();
			animal.speak();
			
		}
		

	}

}
