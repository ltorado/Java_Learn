import java.util.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<String>> groceryList = new ArrayList();

		ArrayList<String> bakeryList = new ArrayList();
		bakeryList.add("pasta");
		bakeryList.add("garlic bread");
		bakeryList.add("donouts");

		//System.out.println(bakeryList);
		//System.out.println(bakeryList.get(0));
		

		ArrayList<String> produceList = new ArrayList();
		produceList.add("tomatos");
		produceList.add("zucchini");
		produceList.add("peppers");

		ArrayList<String> drinkList = new ArrayList();
		drinkList.add("tonic");
		drinkList.add("cola");
		

		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinkList);

		System.out.println(groceryList);
		System.out.println(groceryList.get(0)); //prvni list

		System.out.println(groceryList.get(0).get(0)); //prvni element v prvnim listu

		
	}

}
