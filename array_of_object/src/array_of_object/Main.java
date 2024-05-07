package array_of_object;

public class Main {

	public static void main(String[] args) {
		// array of object
		//int[] numbers = new int[3];
		//char[] characters = new char[4];
		//String[] strings = new String[5];
		
		
		
		//food[] refrigerator = new food[3];
		
		food food1 = new food("pizza");
		food food2 = new food("hamburger");
		food food3 = new food("hotdog");
		
		
		//moznost zapisu
		food[] refrigerator = {food1,food2,food3};
		
		
		//ulozit tyto objekty do pole 
		
		//refrigerator[0] = food1;
		//refrigerator[1] = food2;
		//refrigerator[2] = food3;
		
		System.out.println(refrigerator[0].name);
		
	}

}
