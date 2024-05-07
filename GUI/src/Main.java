import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.ImageIcon;

public class Main {

	public static void main(String[] args) {
	/*
		JFrame frame = new JFrame(); // vytvor frame
		
		frame.setTitle("Jframe ttile") // set title
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // kdyz zavru pres krizek vypne se program, bez toho by se jen zavrelo , normalne HIDE_ON_CLOSE, DO_NOTHING_ON_CLOSE - je take moznost , nic se nestane
		frame.setSize(420,420); // set x-dimesion and y-dimension
		frame.setVisible(true); // make frame vissible
		frame.setResizable(false); // neumozni uzivateli menit velikost okna

		ImageIcon image = new ImageIcon("logo.png"); // create

		frame.setIconImage(image.getImage()); // change icon of frame

		//frame.getContentPane().setBackground(Color.green);

		//frame.getContentPane().setBackground(new Color(0,0,0)); // 0,0,0 - 255,255,255 - black / white , stale RGB

		frame.getContentPane().setBackground(new Color(0x123456)); // 000000-FFFFFF
	*/
		
		MyFrame myFrame = new MyFrame();
		
	}

}
