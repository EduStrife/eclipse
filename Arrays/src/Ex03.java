import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex03 {
	
public static void main(String[] args) {
		
		try{
			
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("Vamos a introducir 10 notas");
		    String num_str = ""; // declaramos el string para leer los datos dentro del bucle
		    int num = 0; // cada nota se guardar� aqu�
		    int[] numeros = new int[15]; // array notas
		    int total=0;
		    
		    for(int i=0; i<numeros.length; i++){
		    	System.out.println("Introduzca los datos de la posici�n " + (i+1)); // con esto hago que me muestre el n�mero del alumno, pero empezando desde el 1, aunque realmente el array se guarde en la posici�n empezando desde el 0
		    	num_str = buffer.readLine(); // con esto leemos los datos (el string)
		    	num = Integer.parseInt(num_str); // pasamos el string a integer
		        numeros[i]=num; //array notas[posicion]=nota que leemos del buffer.readline
		        total+=num;
		    }
			
		    for (int i=0; i<numeros.length; i++){
				System.out.println(numeros[i]);
			}
		    System.out.println("");
		    System.out.println("La suma de todos los n�meros es " + total);
		}
		
		catch (Exception e){
			System.out.println("Error al introducir los n�meros " + e);
		}
	}

}
