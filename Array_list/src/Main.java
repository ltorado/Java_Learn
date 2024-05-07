import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//Array list - ukladaji pouze referencni typey

	//	ArrayList<string> //jde
	//	ArrayList<int> //nelze
	//	ArrayList<Integer> //jde
		
		ArrayList<String> food = new ArrayList<String>();
		food.add("pizza");
		food.add("hamburger");
		food.add("hotdog");

		food.set(0, "sushi"); //prepis prvni hodnotu
		food.remove(2); //smaz metodu
		food.clear();

		for (int i=0; i< food.size(); i++){ //vsimneme si ze arraylist ma size ne lenght
			
			System.out.println(food.get(i));
		}

	}

}
