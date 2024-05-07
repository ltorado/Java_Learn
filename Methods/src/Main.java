
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Bro";
		int age = 22;
		hello(name,age);

		int x = 3;
		int y = 4;

		//int z = add(x,y);
		System.out.println(add(x,y));

	}
	
	static void hello(String title, int age){ //void - nevraci nic, jen do displeje to ukaze co se deje 

		System.out.println(title);
		System.out.println(age);

	}
	
	static int add(int x, int y){	//navratova hodnota je int proto int, neukaze nic v obrazku
		
		//int z = x + z;
		//return z;
		return x + y;

	}


}
