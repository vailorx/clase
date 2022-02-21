package febrero14;
import javax.swing.*;
import java.awt.event.*;
public class Jframecosas extends JFrame{
JButton boton1;

//constuctor
public Ejemplo1() {
  //layout absoluto
  setLayout(null);
  //tamaño de la ventana
  setBounds(0,0,450,350);
  //Titulo
  setTitle("Ejemplo 1: Botón");
  //cerrar proceso al cerrar la ventana
  setDefaultCloseOperation(EXIT_ON_CLOSE);
  //muesto Jframe(lo ultimo para que lo pinte todo correctamente
  setVisible(true);
}
public static void main(String[] args) {
  new Ejemplo1();
}
}