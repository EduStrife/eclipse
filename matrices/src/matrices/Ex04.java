package matrices;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex04 {
	public static void main(String[] args) {
		try {
/*Escriure un programa en Java que cre� un array bidimensional de 5 files i 5 columnes. La
posici� contindr� un car�cter �+� o b� un car�cter �-�, depenent del signe de la difer�ncia entre
el nombre de la fila i el nombre de la columna (signe de fila � columna)*/
			
			//BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			char [][] numeros = new char[5][5];
			int resultado=0;
			
			for (int i = 0; i < numeros.length; i++) { //creo bucle para meter datos.
				
				for (int j = 0; j < numeros[i].length; j++) {
					resultado=i-j;
					if (resultado<0) numeros[i][j]='-';
					if (resultado>=0) numeros[i][j]='+';
				  
				} 
				  
				System.out.println ("");
				
			}
			
			for (int i = 0; i < numeros.length; i++) { //creo bucle para mostrar los datos
				
				for (int j = 0; j < numeros[i].length; j++) {
				
					System.out.print (numeros[i][j]);
				  
				} 
				  
				System.out.println ("");
				
			} 
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
