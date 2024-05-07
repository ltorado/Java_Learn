import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			FileReader reader = new FileReader("art.txt");
			int data = reader.read(); // -1 neni nic, jinak rika pocet bytes , kouknout co presne vypisuje

			while(data != -1){
				System.out.print((char)data);
				data = reader.read();
			}
			reader.close();	

		} catch (FileNotFoundException e){
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
		}
	}

}
