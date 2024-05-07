
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String name = "Bro";
		boolean result = name.equals("Bro");// vraci True / false
		boolean result2 = name.equalsIgnoreCase("bro"); //ignoruje velke male
		
		int result3 = name.length(); //delka jmena Bro =3
		char result4 = name.charAt(0); //vraci pismeno ze slova podle ukazatele od 0 do x
		
		int result5 = name.indexOf("B"); //vraci jaky ma index to pismeno
		
		boolean result6 = name.isEmpty(); //je string prazdy ? true / false
		
		String result7 = name.toUpperCase();//vse  udela velke 
		String result8 = name.toLowerCase();//vse  udela velke 
		
		String result9 = name.trim(); // z tohodle "   B   ro   " udela B  ro (bez mezer pred a po)
		
		String result10 = name.replace("r", "R"); // nahradi stary charakter za novy, poradi old,new
		
		System.out.println(result10);
	}

}
