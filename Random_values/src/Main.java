import java.util.Random;
public class Main {

	public static void main(String[] args) {

		Random random = new Random();
		
		int x = random.nextInt(6)+1; //random od 0-5 (+1 jen ukazka) , kdyz nedam nic bude to z celej int
		
		double y = random.nextDouble(); //random od 0-1
		
		boolean z = random.nextBoolean();
		System.out.println(z);

	}

}
