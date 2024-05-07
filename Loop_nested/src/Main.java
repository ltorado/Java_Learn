import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// Loop inside of a loop = nasted loops
		
		Scanner scanner = new Scanner(System.in);
		
		int rows;
		int collumns;
		String symbol= "";
		
		System.out.println("Enter # of rows: ");
		rows = scanner.nextInt();
		System.out.println("Enter # of collumns: ");
		collumns = scanner.nextInt();
		
		System.out.println("Enter symbol to use: ");
		symbol = scanner.next();
		
		for(int i=1; i<=rows;i++) {
			
			System.out.println();
			for(int j=1; j<=collumns;j++) {
				System.out.print(symbol);
			}
			
		}

	}

}
