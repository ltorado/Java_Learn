import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			//this is command
			
			System.out.println("test");
			System.out.println("test2");
			
			System.out.print("\"\t test\n");
			System.out.print("test2");
			
			/*
			 * multi
			 * lini
			 * command 
			 *
			 */
			//sysout ctrl + space
			
			System.out.println();
			
			//variable
			int x1; //declaration
			x1 = 123; //assignment
			int x2 = 1234; //inicialization
			
			System.out.println("my number is :"+ x2);
			
			//long
			long x3 = 165345643541354354L;
			
			System.out.println("my number is :"+ x3);
			//byte
			
			byte x4 = 100; //130 je moc
			
			//doouble X float 
			
			float y = 3.14f;
			double y1 = 3.14;
			
			//boole
			boolean z = true;
			
			//char
			
			char symbol = '@';
			
			//string - musi byt velke S
			
			String name = "name";
			
			System.out.println("What is your "+ name);
			
			String a = "water";
			String b = "cola";
			String temp;
			temp=a;
			a=b;
			b=temp;
			System.out.println("a:" +a);
			System.out.println("b:" +b);
					
			//user input
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("what is your name?");
			
			String name1 = scanner.nextLine(); //bere jen string
			
			System.out.println("How old are you");
			int age = scanner.nextInt(); //pro int , kdyz za to dam dalsi nextline, tak se nenacte, jelikoz kdyz dam cislo a 18\n (\n reprezentuje entr) a to by snedlo to dalsi 
			scanner.nextLine(); //proto se da resit jen pridam toto
			System.out.println("Hello:"+name1);
			System.out.println("your age is: "+age);
			
			
	}

}
