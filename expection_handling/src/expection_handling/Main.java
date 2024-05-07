package expection_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		try{
			System.out.println("Enter a whole number to devide:");

			int x = scanner.nextInt();

			System.out.println("Enter a whole number to devide by:");

			int y = scanner.nextInt();

			int z = x/y;

			System.out.println("result: "+ z); // vydelim 5/0 bude error a kod skonci s chybou , musim zabalit do try catch
		}
		catch(ArithmeticException e){ //chyta deleni nulou
			
			System.out.println("You can not devide by 0");

		}
		catch(InputMismatchException e){ // chyta kdyz je misto cisla vlozena neco jineho 
			System.out.println("Pleas enter number");
		}
		catch(Exception e){ // chyta vse , kdyz jsme lini zajistovat vse, mel bych se snazit udelat ty co znam a pak na konec udelat obecnou
			System.out.println("Something went wront");
		}
		finally{
			scanner.close();// zavirat otevrene session nebo spojeni, 
			System.out.println("this always print"); // vzdy se vykona na konci. at je error nebo ok 
			
		//jde dat 2 prikazy? - muze

		}
	}

}
