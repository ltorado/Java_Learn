
public class Main {

	public static void main(String[] args) {
		//printf() - control, a zobrazeni textu v konzoli ma 2 hodnoty 
		// %[flags][precision] [width][conversion-character]


		System.out.printf("This is format string %d",123); // vypise se misto %d 123
		
		//conversion-character
		boolean myBoolean = true;
		char myChar = '@';
		String myString = "Bro";
		int myInt = 50;
		double myDouble = 1000;
		System.out.printf("%b",myBoolean);
		System.out.printf("%c",myChar);
		System.out.printf("%s",myString);
		System.out.printf("%d",myInt);
		System.out.printf("%f",myDouble); //double a float stejny 

		//width - minimum znaku co se vrati ze vstupu 
		
		System.out.printf(" Hello %10s",myString); // vrati 10 znaku , kdyz nedostacuje tak to bude prazdne a pak da string
		System.out.printf(" Hello %-10s",myString); //opak mezery pridava na konec stringu 

		//precision

		System.out.printf("%f",myDouble); // vypsalo by se 1000.000000
		System.out.printf("%.2f",myDouble); //1000.00

		//flags

		System.out.printf("%20f",myDouble); // pridava mezery
		System.out.printf("%+f",myDouble); // vypise +1000.000000 , kdyz myDoubel bude minus tak bude minus
		System.out.printf("%-020f",myDouble); // pridava 0 pred cislo s minusem na zacatku 
		System.out.printf("%,f",myDouble); // oddeluje po 3 -> 1,000.000000
	}

}
