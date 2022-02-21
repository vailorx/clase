package febrero14;
import javax.swing.*;
import java.awt.event.*;
public class ventana extends JFrame implements ActionListener{
JButton boton1;
JButton boton2;
JButton boton3;
JLabel l1;
JTextField T1;
public ventana(){
  setLayout(null);
  setBounds(0,0,450,350);
  setTitle("Ejemplo 1: Botón");
  setDefaultCloseOperation(EXIT_ON_CLOSE);
  l1 = new JLabel("jesusxd");
  l1.setBounds(10,20,300,30);
  add(l1);
  T1 = new JTextField();
  T1.setBounds(50,60,300,30);
  add(T1);
  boton1=new JButton("chuklamela");
  boton1.setBounds(300,250,100,30);
  add(boton1);
  boton1.addActionListener(this);
  boton2=new JButton("chuklamelax2");
  boton2.setBounds(30,250,110,30);
  add(boton2);
  boton2.addActionListener(this);
  boton3=new JButton("danie");
  boton3.setBounds(150,30,100,30);
  add(boton3);
  boton3.addActionListener(this);
  setVisible(true);
}
public void actionPerformed(ActionEvent e) {
	if (e.getSource() == boton1) {
		System.exit(0);
	} //puede usar else
	if (e.getSource() == boton2) {
		System.out.println("como te gusta guarra");
	}
	if (e.getSource() == boton3) {
		DetectOS obj1 = new DetectOS();
		obj1.main(null);
	}
}

public static void main(String[] args) {
  new ventana();
}
}