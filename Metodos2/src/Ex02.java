/*Realizar un programa con un m�todo, al que se le pase como par�metro un n�mero N, y muestre
por pantalla N veces, el mensaje: �Este mensaje se mostrar� N veces�.*/

public class Ex02 {
	static void mensaje(int repeticiones){
		for(int i=0; i<repeticiones;i++){
			System.out.println("Este mensaje se mostrar� " + repeticiones + " veces");
		}
	}
	
	public static void main (String[] args) {
		 
		int n=5;
		mensaje(n);
	}
}