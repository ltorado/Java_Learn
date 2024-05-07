import java.util.Random;

public class DiceRoller {

	
	/*local
	DiceRoller(){
		Random random = new Random();
		int number =0;
		roll(random, number);
	}
	
	void roll(Random random, int number) {
		number = random.nextInt(6)+1;
		
		System.out.println(number);
	}
	
	*/
	//globalni pro tuto classu , vidi mezi metodama
	Random random;
	int number =0;
	
	DiceRoller(){
		random = new Random();
		
		roll(random, number);
	}
	
	void roll(Random random, int number) {
		number = random.nextInt(6)+1;
		
		System.out.println(number);
	}
	
	
}
