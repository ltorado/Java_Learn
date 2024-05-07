import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		//vytvor okno
		String name = JOptionPane.showInputDialog("Enter yout name");
		//vypis okno
		JOptionPane.showMessageDialog(null, "Hello "+name);
		
		//ulozeni do int protoze tohle je string hodnota
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter yout age"));
		JOptionPane.showMessageDialog(null, "You are "+age+ "old");
		
		//Double
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter yout height"));
		JOptionPane.showMessageDialog(null, "You are "+height+ "cm");
				
		
	}

}
