import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NocheVieja2 {
	
public static void main(String[] args) {
		
		try{
			
			/*
			 * 
			 * String element = "el5";
				String s;
				int x = element.charAt(2)-'0';
			 */
			
			int hora = 0;
			String h1="";
			int h1hor=0;
			int h1min=0;
			String h2="";
			int h2hor=0;
			int h2min=0;
			String h3="";
			int h3hor=0;
			int h3min=0;
			String h4="";
			int h4hor=0;
			int h4min=0;
			int[] hora1 = new int[2]; // array hora1
			int[] hora2 = new int[2]; // array hora2
			int[] hora3 = new int[2]; // array hora3
			int[] hora4 = new int[2]; // array hora4
			 
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce 4 horas con el formato 00:00 -24 horas-");
			System.out.println("Introduce la primera hora");
			h1 = buffer.readLine();
			System.out.println("Introduce la segunda hora");
			h2 = buffer.readLine();
			System.out.println("Introduce la tercera hora");
			h3 = buffer.readLine();
			System.out.println("Introduce la cuarta hora");
			h4 = buffer.readLine();
			
			
			
			
			for(int i=0; i<numeros.length; i++){
				num = Integer.parseInt(buffer.readLine());
				numeros[i]=num;
			}
			
			for(int i : hora1) System.out.println(i); // recorrer array numeros
		}
		
		catch (Exception e){
			System.out.println("Error al introducir los n�meros " + e);
		}

	}
	
}
