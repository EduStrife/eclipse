
public class ClaseStringMetodos {

	public static void main(String[] args) {
		
		String nombre="Eduardo";
		
		System.out.println("Mi nombre es "+nombre);
		
		System.out.println("Mi nombre tiene "+nombre.length()+ " letras");
		
		System.out.println("La primera letra de tu nombre es "+nombre.charAt(0));
		
		int ultimaLetra;
		
		ultimaLetra=nombre.length();
		
		System.out.println("La �ltima letra del nombre es "+nombre.charAt(ultimaLetra-1));
		
		String frase="Hoy es un estupendo d�a para aprender a programar en Java";
		
		String fraseResultado=frase.substring(2, 10);//esto se puede concatenar, por ejemplo:
		//String fraseResultado=frase.substring(2, 10) + " esto lo estoy anyadiendo a lo extraido...";
		//tambi�n podr�amos rizar el rizo:
		//String fraseResultado=frase.substring(2, 10) + " esto lo estoy anyadiendo a lo extraido..."+ frase.substring(5, 20);
		
		System.out.println("El resultado es "+fraseResultado);
		
		String alumno1, alumno2, alumno3;
		alumno1="David";
		alumno2="David";
		alumno3="david";
		
		System.out.println(alumno1.equals(alumno2));//Esto es true. este m�todo es case sensitive.
		System.out.println(alumno1.equalsIgnoreCase(alumno3));//Esto tb dara true, porque no es case sensitive
		
	}

}
