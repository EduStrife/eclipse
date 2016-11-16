import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pruebas {
	public static void main(String[] args) {

		try {

			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce tu NIF");
			String nifStr = buffer.readLine();
			// System.out.println("El tama�o de " + nifStr + " es de " +
			// nifStr.length() + " caracteres");

			// Y la expresi�n regular para aceptar DNI espa�oles es esta:

			// if

			// (\d{8})([-]?)([A-Z]{1})
			int cont = 0;

			for (int i = 0; i < 8; i++) {
				if (!Character.isDigit(nifStr.charAt(i)))
					;
				cont++;
			}

			while (cont > 0) {
				System.out.println("Introduce tu NIF");
				nifStr = buffer.readLine();

			}

			if (cont < 0) {

				while (nifStr.length() != 9 || !Character.isLetter(nifStr.charAt(8))) {
					System.out.println("Error. Introduce tu NIF");
					nifStr = buffer.readLine();
				}

			}
			/*
			 * while (!Character.isLetter(nifStr.charAt(8))) {
			 * 
			 * System.out.println("Introduce tu NIF"); nifStr =
			 * buffer.readLine();
			 * 
			 * }
			 */

			System.out.println("Correcto, la parte num�rica de tu NIF es: " + nifStr.substring(0, 8));

		} catch (Exception e) {
			System.out.println("Error al introducir los n�meros " + e);
		}
	}
} // i>=0 && <=9

/*
 * Usar el m�todo length() de java.lang.String para conocer el n�mero de
 * caracteres de una cadena de texto.
 * 
 * Usar el m�todo est�tico isLetter(char c) de java.lang.Character para
 * comprobar que un car�cter es una letra.
 * 
 * Usar el m�todo est�tico isDigit(char c) de java.lang.Character para comprobar
 * que un car�cter es un d�gito.
 * 
 * Usar el m�todo substring(int inicio, int fin) de java.lang.String para
 * obtener la parte num�rica del nif
 */