
public class Main {

	public static void main(String[] args) {
		int age = 70;
		
		if((age >= 18) && (age < 70)) {
			
			System.out.println("you are adult");
		}
		else if(age >= 70) { //neprojde porotoze vzdy zkontroluje prvni tu 18 a to projde, musim pridat podminku mensi nez 70
			System.out.println("you are boomer");
		}
		else {
			System.out.println("you are not adult");
		}

	}

}
