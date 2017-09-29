import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ZombiesApp {
    public static void main(String[] args) {

        //Zombie 1 con constructor por defecto
        Zombies zombie1 = new Zombies();
        String Informacion = zombie1.mostrarInformacion();
        System.out.println(Informacion);

       try{
           //Zombie 2
           //ArrayList<Integer> personas_convertidas = new ArrayList<Integer>();
           BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
           System.out.println("Introduce tu nombre");
           String nombre = buff.readLine();
           int nivel;
           do {
               System.out.println("introduce tu nivel");
               nivel = Integer.parseInt(buff.readLine());
           }while (nivel > 10 || nivel < 0);
           
           int anyosZombie;
           do {
               System.out.println("Introduce los a�os que llevas como zombie");
               anyosZombie = Integer.parseInt(buff.readLine());
               
           }while (anyosZombie > 5 || nivel < 0);

           int contador = 0;
           boolean exit = false;
           System.out.println("*anyora introduciras las personas convertidas por cada anyo, recuerda que solo puedes introducir segun los anyos que has vivido, no hagas trampa que te veo!*");
           System.out.println("*Recuerda que siempre puedes exit escribiendo la palabra 'exit'*");
           while(exit == false){
               if (contador < 5){
                   System.out.println("introduce el número de personas que has convertido el anyo : " + (contador+1));
                   String cadenaNumero = buff.readLine();
                   if(cadenaNumero.toLowerCase().equals("exit"))
                       exit = true;
                   else {
                       int numero = Integer.parseInt(cadenaNumero);
                       personas_convertidas.add(numero);
                   }
               }else {
                   exit = true;
               }
               contador++;
           }
           Zombies zombie2 = new Zombies( nombre, nivel , personas_convertidas);
           System.out.println("***Mí Información***");
           System.out.println("Mi nombre: " + zombie2.getNombre());
           if(zombie2.getAnyosZombie() == 0)
               System.out.println("Lo siento aun eres un humano");
           else {
               System.out.println("Mi mejor anyo: " + zombie2.mejorAnyo());
               System.out.println("Máximo de conversiones en un anyo " + zombie2.maxConveriones());
               System.out.println("Media de conversiones por anyo " + zombie2.mediaConversiones());
               System.out.println("Total de conversiones a lo largo de mi vida " + zombie2.totalConversiones());
               System.out.println("¿He convertido alguna vez? " + zombie2.haConvertido());
               System.out.println("¿Soy un jefe? " + zombie2.esJefe());
           }
       }catch (Exception e){

       }






    }
}
