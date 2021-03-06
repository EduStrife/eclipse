import java.io.BufferedReader;
import java.io.InputStreamReader;

public class hormigasFinal {
	public static void main(String[] args) {

		try {

			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("�Cu�nto mide la pista?");
			int longitud = Integer.parseInt(buffer.readLine());
			while (longitud <= 0) {
				System.out.println("Error. Una pista no puede medir eso. �Cu�nto mide la pista");
				System.out.println("�Cu�nto mide la pista?");
				longitud = Integer.parseInt(buffer.readLine());
			}

			System.out.println("�Cu�ntas hormigas hay en la pista?");
			int numHormiga = Integer.parseInt(buffer.readLine());
			int[] posicionHormiga = new int[numHormiga];
			int[] minHormiga = new int[numHormiga];
			int[] maxHormiga = new int[numHormiga];
			for (int i = 0; i < numHormiga; i++) {
				System.out.println("Posici�n de la hormiga numero " + (i + 1) + ":");
				posicionHormiga[i] = Integer.parseInt(buffer.readLine());

				if (posicionHormiga[i] > longitud || posicionHormiga[i] < 1) {
					System.out.println("La hormiga tiene que estar en una posici�n entre 1 y el tama�o de la pista");
					posicionHormiga[i] = 0;
					i--;
				} else {
					if (longitud - posicionHormiga[i] < posicionHormiga[i] - 1) {
						minHormiga[i] = longitud - posicionHormiga[i];
						maxHormiga[i] = posicionHormiga[i] - 1;
					} else if (longitud - posicionHormiga[i] > posicionHormiga[i] - 1) {
						minHormiga[i] = posicionHormiga[i] - 1;
						maxHormiga[i] = longitud - posicionHormiga[i];
					}
				}
			}

			int max = 0;
			int min = 0;
			for (int i = 0; i < numHormiga; i++) {
				if (maxHormiga[i] > max) {
					max = maxHormiga[i];
				}
				if (minHormiga[i] > min) {
					min = minHormiga[i];
				}
			}
			System.out.println("M�nimo: " + min);
			System.out.println("M�ximo: " + max);
		} catch (Exception e) {
			System.out.println("Error" + e);
		}
	}
}