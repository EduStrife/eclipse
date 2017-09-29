import java.util.Scanner;
import javax.swing.JOptionPane;

public class EntradaDatos {

	public static void main(String[] args) {
		
		//Scanner -----------------------------------------
		
	//Los m�todos de entrada de datos de Scanner no son est�ticfos, ergo necesitamos haber creado previamente un objeto clase Scanner.
		//Justo lo que hacemos aqu� debajo

		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce tu nombre:");
		
		//Y ahora ya podemos meter datos y almacenarlos.
		String nombreUser=entrada.nextLine(); //necesitamos llamar al objeto "entrada", creado anteriormente, antes de nextLine().
		
		System.out.println("Introduce tu edad:");
		
		int edad=entrada.nextInt();//volvemos a llamar a objeto entrada y pedimos un introducir un Int
		
		System.out.println("Hola "+nombreUser+ ", el a�o que viene tendr�s "+(edad+1)+" a�os");
		
		//JOptionPane--------------------------------------
		//Son est�ticos, ergo no tendremos que crear un objeto con la clase JOptionPane, es decir, 
		//no tendremos que instanciar la clase JOptionPane, si no que debemos utilizar el nombreDeLaClase.metodo
		
		String nombreUser2=JOptionPane.showInputDialog("Introduce tu nombre, por favor:");
		
		String edad2=JOptionPane.showInputDialog("Introduce tu edad:");//no podemos pedir un Int porque devuelve un String, ergo tendremos que pasarlo luego
		
		System.out.println("Hola "+ nombreUser2+", tienes "+edad2+" a�os.");
		
		//Ahora vamos a parsear la edad y transformarla a Int
		int edad2Parseada=Integer.parseInt(edad2);
		//Ahora ya tendremos edad2Parseada como Int y podremos operar con ese n�mero. ej:
		System.out.println("Hola "+ nombreUser2+", tendr�s "+(edad2Parseada+1)+" el pr�ximo a�o.");

		
		
		
		
		
		
		
	}

}