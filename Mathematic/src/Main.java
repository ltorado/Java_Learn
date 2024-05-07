import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double x = 3.14;
		double y = -10;
		
		double z = Math.max(x, y);
		double z1 = Math.min(x, y);
		double z2 = Math.abs(y); //absolutni hodnota
		double z3 = Math.sqrt(x); //odmocnina
		double z4 = Math.round(x); //zaokrouhluje
		double z5 = Math.ceil(x); //zaokrouhluje vzdy nahoru
		double z6 = Math.floor(x); //zaokrouhluje vzdy dolu
		
		System.out.println(z6);
		
		//vypocet strany trojuhelniku 
		
		double a;
		double b;
		double c;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a: ");
		a = scanner.nextDouble();
		System.out.println("Enter B: ");
		b = scanner.nextDouble();
		
		c = Math.sqrt((a*a)+(b*b));
		
		System.out.println(c);
		
		scanner.close();
	}

}
