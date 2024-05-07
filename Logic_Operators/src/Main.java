import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// && = AND
		// || = OR
		// ! = NOT
		
		
		int temp = 22;
		
		if(temp > 30) {
			System.out.println("it is hot outside");
		}
		else if(temp >=20 && temp <=30) {
			
			System.out.println("it is warm outside");
		}
		else {
			System.out.println("it is cold outside");
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("You playing a game. Press q or Q to quit");
		String response = scanner.next();
		
		if(!response.equals("q") || !response.equals("Q")) { //NEJDE == NA string
			System.out.println("You win");
		}else {
			System.out.println("You lose");
		}
		
		
	}

}
