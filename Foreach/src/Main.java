import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String[] animals = {"cat","dog","rat","bird"};

		for(String i : animals) {

			System.out.println(i);

		}

		ArrayList<String> animals2 = new ArrayList<String>();
		
		animals2.add("dog");
		animals2.add("rat");
		animals2.add("bird");

		for(String i : animals2) { //stejne

			System.out.println(i);

		}
	}

}
