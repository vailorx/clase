package tema6;

	import java.io.EOFException;
	import java.io.IOException;
	import java.io.RandomAccessFile;
	public class random {
	public static void main( String[] args) {
	//Declaramos un objeto de este flujo
	RandomAccessFile objetoRAF = null;
	//Lo creamos asociandole un fichero para leer escribir
	try {
	objetoRAF = new RandomAccessFile( "C://file1.txt", "rw" );
	//Escribimos un entero en posici�n 10
	objetoRAF.writeInt( 10 );
	//Colocaci�n el puntero en posici�n 0
	objetoRAF.seek( 0 );
	while( true ) {
	//Se lee un entero del fichero
	int n = objetoRAF.readInt();
	//Se muestra en pantalla
	System.out.println( n ); } }
	catch( EOFException ex ) {
	System.out.println( "Fin fichero" ); }
	catch( IOException ex ) {
	System.out.println( ex ); }
	}
	}

