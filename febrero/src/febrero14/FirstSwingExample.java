package febrero14;

import javax.swing.*;
//panel con click
public class FirstSwingExample {
public static void main(String[] args) {
	JFrame f=new JFrame();
	JButton b=new JButton("Pulsa si eres marica");
	//los 2 primerso x y, ancho y alto
	b.setBounds(130,100,200, 40);
	
	f.add(b);
	f.setSize(400,500);
	f.setLayout(null);
	f.setVisible(true);
	
}
}
