import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.ImageIcon;

public class MyFrame extends JFrame{
	MyFrame(){
		
		this.setTitle("Jframe ttile"); // set title
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // kdyz zavru pres krizek vypne se program, bez toho by se jen zavrelo , normalne HIDE_ON_CLOSE, DO_NOTHING_ON_CLOSE - je take moznost , nic se nestane
		this.setSize(420,420); // set x-dimesion and y-dimension
		this.setVisible(true); // make frame vissible
		this.setResizable(false); // neumozni uzivateli menit velikost okna

		ImageIcon image = new ImageIcon("logo.png"); // create

		this.setIconImage(image.getImage()); // change icon of frame

		//frame.getContentPane().setBackground(Color.green);

		//frame.getContentPane().setBackground(new Color(0,0,0)); // 0,0,0 - 255,255,255 - black / white , stale RGB

		this.getContentPane().setBackground(new Color(0x123456)); // 000000-FFFFFF

		}
}
