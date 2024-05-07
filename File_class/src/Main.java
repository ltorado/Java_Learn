import java.io.File;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//File file = new File("secret_message.txt"); // to je ulozeno v ramci projektu aby jej videl 
		File file = new File("C:\\Users\\Ladislav\\Desktop\\secret_message.txt"); // muzu psat \\ nebo /
		if(file.exists()){
			System.out.println("File exists");
			System.out.println(file.getPath()); // cesta v projektu 
			System.out.println(file.getAbsolutePath()); // cela systemova deska
			System.out.println(file.isFile()); // je to soubor ? true false pokud je soubor nebo slozka
			//file.delete(secret_message.txt); // maze soubor


		}
		else{
			System.out.println("File doesn't exists");
		}

	}

}
