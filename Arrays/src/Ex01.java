import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex01 {
	
	public static void main(String[] args) {
		
		try{
			
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("Vamos a introducir 10 notas");
		    int nota = 0; // cada nota se guardar� aqu�
		    int[] notas = new int[10]; // array notas
		    
		    for(int i=0; i<notas.length; i++){
		    	System.out.println("Introduzca las notas del alumno " + (i+1)); // con esto hago que me muestre el n�mero del alumno, pero empezando desde el 1, aunque realmente el array se guarde en la posici�n empezando desde el 0
		        nota = Integer.parseInt(buffer.readLine()); // esto es hacerlo directamente en una l�nea, pasando directamente a integer el buffer
		        notas[i]=nota; //array notas[posicion]=nota que leemos del buffer.readline
		    }
			
		    for (int i=0; i<notas.length; i++){
				System.out.println(notas[i]);
			}
		    
		    /*for (int i : notas) System.out.println(i); // esto equivale al for each php
		     * 
		     */
		}
		
		catch (Exception e){
			System.out.println("Error al introducir los n�meros " + e);
		}
	}

}
