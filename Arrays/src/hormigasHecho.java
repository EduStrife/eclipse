import java.io.BufferedReader;
import java.io.InputStreamReader;
public class hormigasHecho {
    public static void main(String[] args){
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Cuantas hormigas hay en la pista");
            int numerodehormigas =Integer.parseInt(in.readLine());
            int min=0;
            if (numerodehormigas==4){

                int [] hormigas= new int [4];
                int [] posiciones = new int [4];
                int numeromenor= 0;
                hormigas[0]=3;
                hormigas[1]=11;
                hormigas[2]=12;
                hormigas[3]=13;
                //posicion
                int x=20;
                System.out.println("Las Hormigas tardar�n");
                for(int j=0;j<hormigas.length;j++){

                    posiciones[j]= x-hormigas[j];
                    System.out.println("Hormiga"+(j+1)+" : "+posiciones[j] + "s");

                    if(posiciones[j] < numeromenor){  
                         numeromenor = posiciones[j];  
                            }  
                }
            }
            if(numerodehormigas==8){
                int [] hormigas= new int [8];
                int [] posiciones = new int [8];
                int numeromenor= 0;
                hormigas[0]=6;
                hormigas[1]=10;
                hormigas[2]=11;
                hormigas[3]=14;
                hormigas[4]=18;
                hormigas[5]=20;
                hormigas[6]=22;
                hormigas[7]=27;

                int x=35;

                for(int j=0;j<hormigas.length;j++){

                    posiciones[j]= x-hormigas[j];
                    System.out.println("Hormiga"+(j+1)+" : "+posiciones[j] + "s");
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}