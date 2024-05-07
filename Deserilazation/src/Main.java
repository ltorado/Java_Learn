import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		/*
		 * Zpracovani: Desirializace

	1 - deklarace objektu ale nevytvari instanci
		User user = null;
	2- object trida musi obsahovat implementaci Serializable interface
		public class User implements Serializable{}
	3 - add import java.io.Serializable;
	
	4 - FileInputStream fileIn = new FileInputStream("Userinfo.ser");

	5 - ObjectInputStream in = new ObjectInputStream(fileIn)

	6 - objectName = (Class) in.readObject();
		user = (User) in.readObject();
	7 Close
		in.close();
		fileIn.close();

		 */
		User user = null;
		FileInputStream fileIn = new FileInputStream("C:\\Users\\Ladislav\\eclipse-workspace\\Serialization\\Userinfo.ser");
		ObjectInputStream in = new ObjectInputStream(fileIn);
		user = (User) in.readObject();
		in.close();
		fileIn.close();
		
		System.out.println(user.name);
		user.seyHello();
		
		
		

	}

}
