import java.io.IOException;

public class Ex09 {
	
	    public static void main(String[] args) throws IOException {
	    	
	        char car1, car2;
	        
	        System.out.print("Introduzca primer car�cter: ");
	        
	        car1 = (char)System.in.read(); //lee un car�cter
	        System.in.read();  //saltar el intro que ha quedado en el buffer
	        
	        System.out.print("Introduzca segundo car�cter: ");
	        car2 = (char)System.in.read(); //lee el segundo car�cter

	        if(car1 == car2)
	           System.out.println("Son iguales");    
	        else
	           System.out.println("No son iguales");        
	    }
	} 