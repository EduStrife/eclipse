import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExMonos {
	public static void main (String[] args) {
		
		try{
						
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			
			String accStr="";
			int acc=1;
			double pesomediogorila = 0;
			double pesomediochimp = 0;
			double edadmediagorila = 0;
			double edadmediachimp = 0;
			double pesogorila = 0;
			String pesogorilaStr="";
			double pesogorilamax = Double.MIN_VALUE;
			double pesogorilamin = Double.MAX_VALUE;
			double pesochimp = 0;
			String pesochimpStr="";
			double pesochimpmax = Double.MIN_VALUE;
			double pesochimpmin = Double.MAX_VALUE;
			int edadgorila = 0;
			String edadgorilaStr="";
			int edadgorilamax = Integer.MIN_VALUE;
			int edadgorilamin = Integer.MAX_VALUE;
			int edadchimp = 0;
			String edadchimpStr="";
			int edadchimpmax = Integer.MIN_VALUE;
			int edadchimpmin = Integer.MAX_VALUE;
			String acc2Str ="";
			int acc2 = 0;
			String ingStr = "";
			int ing = 0;
			int contadorchimp=0;
			int contadorgorilas=0;
			
			while (acc!=0) {
			
			System.out.println();
			System.out.println("-----------MEN� PRINCIPAL--------------");
			System.out.println("[1] - REGISTRAR INGRESOS");
			System.out.println("[2] - ESTAD�STICAS");
			System.out.println("[3] - REINICIAR");
			System.out.println("[0] - SALIR");
			System.out.println("---------------------------------------");
			System.out.println();
			System.out.println("ELIJA OPCI�N:");
			accStr = buffer.readLine();
			acc = Integer.parseInt(accStr);

			if (acc==1) {
				
				System.out.println("INTRODUZCA CU�NTOS INGRESOS QUIERE REALIZAR:");
				ingStr = buffer.readLine();
				ing = Integer.parseInt(ingStr);
				
				for (int i=0; i<ing; i++) {
				System.out.println("ELIJA TIPO DE MONO. [1] CHIMPANC� - [2] GORILA");
				acc2Str = buffer.readLine();
				acc2 = Integer.parseInt(acc2Str);
				
				
				while (acc2!=1 && acc2!=2) {
					System.out.println("TIPO ERR�NEO. ELIJA TIPO DE MONO. [1] CHIMPANC� - [2] GORILA");
					acc2Str = buffer.readLine();
					acc2 = Integer.parseInt(acc2Str);
				}
				
				if (acc2==1) {
					System.out.println("Introduzca la edad del chimpanc�. Debe estar entre 0 y 50 a�os");
					edadchimpStr = buffer.readLine();
					edadchimp = Integer.parseInt(edadchimpStr);
					contadorchimp++;
					
					while (edadchimp<0 || edadchimp>50) {
						System.out.println("Edad err�nea. Introduzca la edad del chimpanc�. Debe estar entre 0 y 50 a�os");
						edadchimpStr = buffer.readLine();
						edadchimp = Integer.parseInt(edadchimpStr);
					}
					
					System.out.println("Introduzca el peso del chimpanc�. �OJO, no hay control de errores!");
					pesochimpStr = buffer.readLine();
					pesochimp = Double.parseDouble(pesochimpStr);
					
					pesomediochimp = pesomediochimp+pesochimp;					
					edadmediachimp = edadmediachimp+edadchimp;
					
					if (edadchimp>edadchimpmax) {						
						edadchimpmax=edadchimp;
					}
					
					if (edadchimp<edadchimpmin) {
						edadchimpmin=edadchimp;
					}
					
					if (pesochimp>pesochimpmax) {
						pesochimpmax=pesochimp;
					}
					
					if (pesochimp<pesochimpmin) {
						pesochimpmin=pesochimp;
					}					
					
				}
				
				if (acc2==2) {
					System.out.println("Introduzca la edad del gorila. Debe estar entre 0 y 40 a�os");
					edadgorilaStr = buffer.readLine();
					edadgorila = Integer.parseInt(edadgorilaStr);
					contadorgorilas++;
					
					while (edadgorila<0 || edadgorila>40) {
						System.out.println("Edad err�nea. Introduzca la edad del gorila. Debe estar entre 0 y 40 a�os");
						edadgorilaStr = buffer.readLine();
						edadgorila = Integer.parseInt(edadgorilaStr);
					}
					
					System.out.println("Introduzca el peso del gorila. �OJO, no hay control de errores!");
					pesogorilaStr = buffer.readLine();
					pesogorila = Double.parseDouble(pesogorilaStr);
					
					pesomediogorila = pesomediogorila+pesogorila;					
					edadmediagorila = edadmediagorila+edadgorila;
					
					if (edadgorila>edadgorilamax) {
						edadgorilamax=edadgorila;						
					}
					
					if (edadgorila<edadgorilamin) {
						edadgorilamin=edadgorila;
					}					
					
					if (pesogorila>pesogorilamax) {
						pesogorilamax=edadgorila;
					}
					
					if (pesogorila<pesogorilamin) {
						pesogorilamin=edadgorila;
					}
					
				}				
					
				}
				
			}
				
			if (acc==2 && ing>0) {
				
				if (contadorchimp>0){
				System.out.println("HAS REGISTRADO " + contadorchimp + " CHIMPANC�S");
				System.out.println("CHIMPANC� M�S VIEJO: " + edadchimpmax);
				System.out.println("CHIMPANCE M�S JOVEN: " + edadchimpmin);
				System.out.println("EDAD MEDIA CHIMPANC�S: " + edadmediachimp/contadorchimp);
				System.out.println("CHIMPANC� CON MAYOR PESO: " + pesochimpmax);
				System.out.println("CHIMPANC� CON MENOR PESO: " + pesochimpmin);
				System.out.println("PESO MEDIO CHIMPANC�S: " + pesomediochimp/contadorchimp);
				System.out.println("");
				}
				if (contadorgorilas>0){
				System.out.println("HAS REGISTRADO " + contadorgorilas + " GORILAS");
				System.out.println("GORILA M�S VIEJO: " + edadgorilamax);
				System.out.println("GORILA M�S JOVEN: " + edadgorilamin);
				System.out.println("EDAD MEDIA GORILAS: " + edadmediagorila/contadorgorilas);
				System.out.println("GORILA CON MAYOR PESO: " + pesogorilamax);
				System.out.println("GORILA CON MENOR PESO: " + pesogorilamin);
				System.out.println("PESO MEDIO GORILAS: " + pesomediogorila/contadorgorilas);
				System.out.println("");
				}
			}
			
			if (acc==2 && ing==0) System.out.println("No hay datos");
			
			if (acc==3) {
				accStr="";
				acc=1;
				pesomediogorila = 0;
				pesomediochimp = 0;
				edadmediagorila = 0;
				edadmediachimp = 0;
				pesogorila = 0;
				pesogorilaStr="";
				pesogorilamax = Double.MIN_VALUE;
				pesogorilamin = Double.MAX_VALUE;
				pesochimp = 0;
				pesochimpStr="";
				pesochimpmax = Double.MIN_VALUE;
				pesochimpmin = Double.MAX_VALUE;
				edadgorila = 0;
				edadgorilaStr="";
				edadgorilamax = Integer.MIN_VALUE;
				edadgorilamin = Integer.MAX_VALUE;
				edadchimp = 0;
				edadchimpStr="";
				edadchimpmax = Integer.MIN_VALUE;
				edadchimpmin = Integer.MAX_VALUE;
				acc2Str ="";
				acc2 = 0;
				ingStr = "";
				ing = 0;
				contadorchimp=0;
				contadorgorilas=0;
				
				System.out.println("Valores reiniciados");
			}
			
			if (acc==0) System.out.println("�Adi�s!");
				
			}			
			
}
		catch (Exception e){
			System.out.println("Error al introducir los n�meros " + e);
		}
		}
		}