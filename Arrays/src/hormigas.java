import java.io.BufferedReader;
import java.io.InputStreamReader;

public class hormigas {
	public static void main(String[] args){
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        try{
        	
            int numerodehormigas =0;
            int longpista= 0;
            int [] posiciones = new int [longpista];
            int hormigaarriba=0;
            int hormigaabajo=0;
            int menor=Integer.MAX_VALUE ;
            int max=0;
            int z=0;
            
            System.out.println("�Cu�nto mide la pista");
            longpista= Integer.parseInt(buffer.readLine());
            while(longpista<=0){
            	 System.out.println("Error. Una pista no puede medir eso. �Cu�nto mide la pista");
                 longpista= Integer.parseInt(buffer.readLine());
            }
            
            System.out.println("�Cu�ntas hormigas hay en la pista?");
            numerodehormigas =Integer.parseInt(buffer.readLine());
            while(longpista<numerodehormigas){
            	System.out.println("Error. No puede haber m�s hormigas que posiciones en la pista. �Cu�ntas hormigas hay en la pista?");
                numerodehormigas =Integer.parseInt(buffer.readLine());
            }
            
                for(int i=0;i<numerodehormigas;i++){
                	System.out.println("�En qu� posici�n quieres hormigas?");
                	z= Integer.parseInt(buffer.readLine());
                	while(posiciones[z-1]==1){
                		System.out.println("Posici�n ya opcupada.�En qu� posici�n quieres hormigas?");
                    	z= Integer.parseInt(buffer.readLine());
                	}
                	posiciones[z-1]=1; // con esto recorremos el array entero metiendo datos
                }
                
                for (int i=0;i<longpista;i++){
                	if(posiciones[i]==1){
                		hormigaarriba= longpista - (i+1);
                		hormigaabajo= i+1; //esta variable se puede ahorrar, poniendo el i+1 abajo en lugar de "hormigaabajo" pero lo dejo de esta forma para entenderlo mejor en un futuro si he de revisar
                		if(hormigaarriba>max ||  hormigaabajo>max) max= Math.max(hormigaarriba, hormigaabajo);
                		if(hormigaarriba<menor ||  hormigaabajo<menor) menor= Math.min(hormigaarriba, hormigaabajo);
                	}
                }
                
                System.out.println("Las hormigas tardar�n un m�ximo de " + max + " segundos y un m�nimo de " + menor + " segundos");
                
        
        }catch(Exception e){
            System.out.println(e);
        }
    }
}