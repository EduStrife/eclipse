import java.io.BufferedReader;
import java.io.InputStreamReader;

public class personaApp {

	public static void main(String[] args) {

		try{
			//(int dniNuevo, String nombre, int edad, char sexo, double peso, double altura)
			
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

			// Crear un objeto persona vac�o

			persona Juan = new persona();

			// Crear un objeto alumno con valores definidos

			persona Pedro = new persona(47569787, "Pedro", 20, 'H', 80.5, 1.8);
			
			//objeto con algunos valores ( nombre, edad y sexo, el resto por defecto)
			
			persona Alonso=new persona();
						
			Alonso.setNombre("Alonso");
			Alonso.setEdad(21);
			Alonso.setSexo('H');
			
			
			
			
			
			
			
			
			
			System.out.println(Pedro.mostrarInfo());
			
			System.out.println("El DNI es " + Pedro.getDni() + Pedro.generaLetra());

			System.out.println(Juan.getEdad());
			System.out.println(Pedro.getEdad());

			Juan.setNombre("Jose");

			System.out.println(Juan.getNombre());

			// Modificar el primer alumno con valores pedidos por teclado 

			System.out.println("Nombre?");
			Juan.setNombre(buffer.readLine());

			System.out.println("DNI?");
			Juan.setDni(Integer.parseInt(buffer.readLine()));

			System.out.println("Edad?");
			Juan.setEdad(Integer.parseInt(buffer.readLine()));

			System.out.println("Nota?");
			Juan.setNota(Double.parseDouble(buffer.readLine()));

			System.out.println("Los nuevos datos son "+ Juan.getDni() + " " + Juan.getEdad() + " " + Juan.getNombre() + " " + Juan.getNota());

			// - Pedir DNI sin letra
			// - Comprobar DNI antes de a�adirlo

			// Mostrar toda la informaci�n del alumno 1 con el m�todo de mostrarInfo

			// Mostrar toda la informaci�n del alumno 2 con el m�todo de mostrarInfo

		}
		catch (Exception e){
			System.out.println("Error " + e);
		}
	}
}