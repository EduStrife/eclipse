import java.io.BufferedReader;
import java.io.InputStreamReader;

public class hormigas2 {
	public static void main(String[] args){
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        try{
        	
        	//math.max y math.min
        	//cuanto mide la pista y cuantas hormigas quieres colocar
        	//en que posicion quieres colocar las hormigas
            System.out.println("�Cu�ntas hormigas hay en la pista?");
            int numerodehormigas =Integer.parseInt(buffer.readLine());
            System.out.println("�Cu�nto mide la pista");
            int longpista= Integer.parseInt(buffer.readLine());
            

            //int [] hormigas= new int [numerodehormigas]; ya no lo utilizo, era para la otra forma de hacer el ejercicio
            int [] posiciones = new int [longpista];
            int hormigaarriba=0;
            int hormigaabajo=0;
            int menor=Integer.MAX_VALUE ;
            int max=0;
            int z=0;
                
                for(int i=0;i<numerodehormigas;i++){
                	System.out.println("�En qu� posici�n quieres hormigas?");
                	z= Integer.parseInt(buffer.readLine());
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
                
                /*for (int i= 0; i<n.length; i++){
				n[i]= Integer.parseInt(buffer.readLine()); // con esto recorremos el array entero metiendo datos
				if(n[i]==0){
					c++;
				}*/
                
                /*hormigas[0]=3;
                hormigas[1]=11;
                hormigas[2]=12;
                hormigas[3]=13;*/
                //Con esto guardo la posici�n
                //x=20; //tama�o de pista
              
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}