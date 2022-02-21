package febrero14;
import javax.swing.*;
import java.awt.event.*;
public class ventana1 extends JFrame implements ActionListener{
JButton boton1;
JButton boton2;
JButton boton3;
public ventana1(){
  setLayout(null);
  setBounds(0,0,450,350);
  setTitle("Ejemplo 1: Botón");
  setDefaultCloseOperation(EXIT_ON_CLOSE);
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
		setTitle("jesus chukladora");
	} //puede usar else
	if (e.getSource() == boton2) {
		 setTitle("Jesus te hace curry");
	}
	if (e.getSource() == boton3) {
		 setTitle("jesus te juega er bichooo");
	}
}

public static void main(String[] args) {
  new ventana1();
}
}