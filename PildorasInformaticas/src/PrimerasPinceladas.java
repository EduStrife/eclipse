
public class PrimerasPinceladas {

	/*Tipos primitivos/////////////
	 * -Enteros-->Int, Short(hasta 32,767), Long(necesita L despu�s del num., Byte(127)
	 * -Coma flotante--> Float(Sufijo F), Double
	 * -Char--> car�cteres Unicode 'A'...'z'
	 * -Boolean-->True o False
	 * 
	 * Variable es un espacio en la memoria del PC donde se almacenar� un valor que podr� cambiar durante la ejecuci�n del programa
	 * Declarar una variable es cuando le das nombre
	 * Iniciar una variable es cuando le das un valor (No se puede utilizar una variable no iniciada)
	 * 
	 * Constante es un espacio en la memoria del PC donde se almacenar� un valor que no podra cambiar durante la ejecuci�n del programa
	 * Se utilizan para guardar datos (temporales, recordemos que es RAM) que ser�n fijos, inmutables.
	 * Esto se hace poniendo la palabra "final" delante del nombre de la variable, por ejemplo:
	 * --> final double numPI=3.14159265358979323846;
	 * 
	 * Operadores
	 * -Aritm�ticos--> +suma, -resta, *multiplica, /divide
	 * -L�gicos, relaciones y booleanos--> <menor que, >mayor que, <>mayor O menor, !=distinto, ==igual que, && y l�gico (comparar tercer valor), || � l�gico
	 * -Incremento y decremento (no est�n en todos los lenguajes)--> ++incremento, --decremento, +=n� incremento (ej. +=3 incrementa 3), -=n� decremento
	 * -Concatenaci�n--> + une o concatena.
	 * 
	 * println imprime y salto de l�nea, con print podr�amos imprimir justo al lado
	 * 
	 * CLases en Java//////////
	 * Todo programa en Java debe estar compuesto almenos de una clase y pueden ser de dos tipos; Propias y Definidas
	 * -Propias son las que creamos nosotros. Lo que he hecho hasta ahora.
	 * -Predefinidas son clases que est�n ya constru�das dentro del lenguaje Java. Se nos suministran para que las podamos utilizar en nuestros programas si las necesitamos.
	 * 		ejemplos de estas clases son: String, Math, Array, Thread... Cada clase trae diferentes m�todos ya predefinidos. En la API de java vienen todos los metodos y las clases.
	 * 		Para recurrir a la API es tan f�cil c�mo  "api java" en google, y entramos en la documentaci�n de oracle.
	 * 
	 * Clase Math-----
	 * -math.sqrt(n):calcula la ra�z cuadrada de un n�mero
	 * -math.pow(base, exponente) calcula la potencia de un n�mero. Base y exponente son doubles.
	 * -math.round(decimal) redondeo de n�mero.
	 * -math.PI constante de clase con el n�mero PI (esto es una constante predefinida)
	 * 
	 * Clase String-------
	 * String no es un tipo primitivo, como en otros lenguajes, es una clase.
	 * Cuando almacenamos una cadena de caracteres, por ejemplo,
	 * String miNombre="Edu";
	 * donde miNombre es un objeto de la clase string. 
	 * ----Instancia o ejemplar es cuando, por ejemplo, leemos en alg�n libro que 
	 * 		tenemos que instanciar una clase se refiere a darle nombre. En este caso, hemos instanciado escribiendo miNombre.
	 * 		Es decir, darle un nombre a un objeto donde almacenaremos un valor. Ejemplarizar una clase es lo mismo
	 * -length():devuelve la longitud de una cadena de caracteres.
	 * -charAt(n): devuelve la posicion d eun caracter dentro de una cadena (empieza contar de 0)
	 * -substring(x,y): devuelve una subcadena dentro de la cadena, siendo x el caracter a partir del cual extrae e Y hasta el cual extraer (la �ltima posici�n, la de Y, no se extrae)
	 * -equals(cadena): para comparar cadena de caracteres en java. Devuelve true o false, es case sensitive
	 * -equalsIgnoreCase(cadena): lo mismo que arriba pero NO case sensitive
	 * 
	 * Las clases en java se organizan en paquetes, que vendr�an a ser como las carpetas en windows
	 *
	 * 
	 * Paquetes////////////////
	 * Surgieron para organizar las clases, evitar conflictos de nombres (no puede haber dos clases con el mismo nombre en el mismo paquete pero
	 * 	s� en otro paquete) y para controlar la visibilidad de las clases (*m�s adelante).
	 * 
	 * Java.lang se puede considerar el paquete principal o por defecto. Dentro de el est�n las clases system, math, string, thread... por ejemplo.
	 * Para utilizar clases de otros paquetes, como java.io, java.utils etc. tenemos que importarlo previamente.
	 * EJ: import.java.util.*; arriba de todo para poder utilizar la clase Scanner. El * indica que estamos importando TODAS las clases del paquete .java.util
	 * Si s�lo vas a usar la clase Scanner podr�as hacer import.java.util.Scanner;
	 * 
	 * Entrada y Salida de datos/////////////
	 * Para la entrada, podemos usar la clase Scaner: nextLine(), nextInt(), nextDouble()
	 * la Clase JoptionPane: JOptionPane, showInputDialog()
	 * 
	 * Los m�todos constructores tienen el mismo nombre que la clase a la que pertenecen.
	 * 
	 * Los m�todos de entrada de datos de Scanner no son est�ticfos, ergo necesitamos haber creado previamente un objeto clase Scanner.
	 * 
	 * //Para formatear los datos, por ejemplo los deciamles, lo podemos hacer as�
		double x=100000.0;
		
		System.out.printf("%1.2f", x/3); //con esto sacar�amos 2 decimales. Con "%1.4f" etc
	 *
	 *
	 * 
	 */
	
}















