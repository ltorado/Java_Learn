
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] cars = {"Camaro", "tesla", "Corvette"}; // vzdy muze byt jen jeden typ , nemuzu michat s int
		
		cars[0]= "Mustange";
		
		System.out.println(cars[0]);
		
		String[] pets = new String[3]; //budeme pridavat 3 mazlicky
		
		pets[0] = "dog";
		pets[1] = "cat";
		pets[2] = "bird";
		
		for(int i=0; i < pets.length ;i++){
			
			System.out.println(pets[i]);
			
		
		}

	}

}
