
public class ex07 {
	public static void main(String[] args){
		
		/*7. Declarar una matriu de 5x5 posicions. S�ha d�invertir la seva diagonal principal sense utilitzar
		una matriu auxiliar, i amb nom�s tres variables auxiliars. Ex07.java */

		int [][] matriz = new int[5][5];
	
		//matriz1 debe ser 50000
		matriz[0][0] = 1;
		matriz[0][1] = 0; 
		matriz[0][2] = 0;
		matriz[0][3] = 0;
		matriz[0][4] = 0;
		//matriz2 -- 04000
		matriz[1][0] = 0;
		matriz[1][1] = 2; 
		matriz[1][2] = 0;
		matriz[1][3] = 0;
		matriz[1][4] = 0;
		//matriz3 -- 00300
		matriz[2][0] = 0;
		matriz[2][1] = 0; 
		matriz[2][2] = 3;
		matriz[2][3] = 0;
		matriz[2][4] = 0;
		//matriz4 -- 00020
		matriz[3][0] = 0;
		matriz[3][1] = 0; 
		matriz[3][2] = 0;
		matriz[3][3] = 4;
		matriz[3][4] = 0;
		//matriz5 -- 00001
		matriz[4][0] = 0;
		matriz[4][1] = 0; 
		matriz[4][2] = 0;
		matriz[4][3] = 0;
		matriz[4][4] = 5;
		
		int aux=0;
		
		for(int i = 0, j= matriz.length-1 ; i<(matriz.length/2) ; i++, j--){
			aux = matriz[i][i];
			matriz[i][i]=matriz[j][j];
			matriz[j][j]=aux;
		}
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print (matriz[i][j]+"|");
			}  
			System.out.println ("");
		}
		
	}
}