
public class Ex02 {

	public static void main (String[] args) {

		System.out.println("Edu"); // system... Muestra en pantalla lo que hemos puesto. con ln al final de print salta l�nea, sin �l todo junto.

		//Integer --> Int, operador 1 --> op1, resultado --> res. Siempre que declaremos una variable debe tener un valor inicial ---> op1 = 40 x ejemplo.

		int valor = 444444;
		int hora = valor / 3600;
		int min = (valor / 60) % 60;
		int sec = valor % 60;
		
		System.out.println(valor + " segundos son " + hora + " horas " + min + " minutos " + sec + " segundos.");
	}
}