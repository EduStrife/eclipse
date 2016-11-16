import java.io.*;

public class ex14prueba {
	
	public static void main (String[] args) {
 
		try{
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce un mes");
			String mesStr = buffer.readLine();
			int mes = Integer.parseInt(mesStr); 
			System.out.println("Introduce un año");
			String anyStr = buffer.readLine();
			int any = Integer.parseInt(anyStr);
			
			if (mes == 4 || mes == 6 || mes == 9 || mes == 11) System.out.println("Mes de 30 dias");
			else if (mes!=2) System.out.println("Mes de 31 dias");
			else if (mes==2 && (any%4 == 0 && (any%100 != 0 || any%400 == 0))) System.out.println("Mes de 29 dias");
			else System.out.println("Mes de 28 dias");
		}
		
		catch (Exception e) {
			System.out.println("Introduce un numero");
		}
	}
}