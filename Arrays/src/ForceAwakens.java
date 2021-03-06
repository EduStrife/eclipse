import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Arrays; //necesaria importar para mostrar valores del array directamente

public class ForceAwakens {
	public static void main(String[] args) {
		try {

			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			
            int [] dresistencia = {4,3,2,4,4,3,2,4,4,3};
            int [] eresistencia = {3,3,10,9,9,8,7,8,9,8};
            int [] dimperio = {4,3,2,1,0,0,2,1,0,2};
            int [] eimperio = {8,7,6,7,8,9,8,10,9,7};
            int impacto=0;
            int energiamaxr=0;
            int energiamaxi=0;
            int supervivientesr=0;
            int supervivientesi=0;
            int masdefensar=0;
            int masdefensai=0;
            int soltoper=0;
            int soltopei=0;
            int ganar=0;
            int ganai=0;
            /*int [] dresistencia = new int [10];
            int [] eresistencia = new int [10];
            int [] dimperio = new int [10];
            int [] eimperio = new int [10];*/
            int opt=1;
            int empieza=0;
            //int aleatorio = (int) (Math.random()*10); sin uso, lo hago directamente
            
            while (opt!=4){
				System.out.println();
				System.out.println("Pulsa el n�mero correspondiente para seleccionar la opci�n:");
				System.out.println("===============================================================");
				System.out.println("1. ASIGNAR VALORES");
				System.out.println("2. INICIAR BATALLA");
				System.out.println("3. AN�LISIS DE LA BATLLA");
				System.out.println("4. SALIR");
				System.out.println();
				
				opt= Integer.parseInt(buffer.readLine());
				
				if(opt==4)System.out.println("QUE LA FUERZA TE ACOMPA�E");
				
				if(opt==1){
					for (int x=0;x<dresistencia.length;x++){
						dresistencia[x] = (int) (Math.random()*4);
						eresistencia[x] = (int) (Math.random()*10);
						dimperio[x] = (int) (Math.random()*4);
						eimperio[x] = (int) (Math.random()*10);
					}
					
					System.out.println("La defensa de la resistencia es: " + Arrays.toString(dresistencia)); //necesario importar la libreria
					System.out.println("La energ�a de la resistencia es: " + Arrays.toString(eresistencia));
					System.out.println("La defensa del imperio es: " + Arrays.toString(dimperio));
					System.out.println("La energ�a del imperio es: " + Arrays.toString(eimperio));					
					/*for(int i = 0;i<dresistencia.length;i++){ esto ser�a para mostrarlo
						 System.out.println(dresistencia[i]);
						}*/					
				}
				
				if(opt==2){
					empieza= (int) (Math.random()*2);
					if(empieza==0){ //ataca imperio
						System.out.println("El imperio (contra)ataca");
						for(int i = 0;i<dresistencia.length;i++){
							if (i==0 || i%2==0){//esto es para que turnar los ataques (numeros pares)
								if(eimperio[i]!=0 && eresistencia[i]!=0){ //con esto hago que si cualquiera de los dos tiene 0 energ�a(muerto) se salte el combate
									if(eimperio[i]>dresistencia[i]){
										impacto=eimperio[i]-dresistencia[i];
										eresistencia[i]-=impacto;
										if(eresistencia[i]<0) eresistencia[i]=0;
									}
								}
							}
							if (i%2!=0){//esto es para que turnar los ataques (numeros impares)
								if(eimperio[i]!=0 && eresistencia[i]!=0){ //con esto hago que si cualquiera de los dos tiene 0 energ�a(muerto) se salte el combate
									if(eresistencia[i]>dimperio[i]){
										impacto=eresistencia[i]-dimperio[i];
										eimperio[i]-=impacto;
										if(eimperio[i]<0) eimperio[i]=0;
									}
								}
							}
						}
					}
					if(empieza==1){ //ataca resistencia
						System.out.println("La resistencia ataca");
						for(int i = 0;i<dresistencia.length;i++){
							if (i%2!=0){ //esto es para que turnar los ataques (numeros impares)
								if(eimperio[i]!=0 && eresistencia[i]!=0){ //con esto hago que si cualquiera de los dos tiene 0 energ�a(muerto) se salte el combate
									if(eimperio[i]>dresistencia[i]){
										impacto=eimperio[i]-dresistencia[i];
										eresistencia[i]-=impacto;
										if(eresistencia[i]<0) eresistencia[i]=0;
									}
								}
							}
							if (i==0 || i%2==0){ //esto es para que turnar los ataques (numeros pares)
								if(eimperio[i]!=0 && eresistencia[i]!=0){ //con esto hago que si cualquiera de los dos tiene 0 energ�a(muerto) se salte el combate
									if(eresistencia[i]>dimperio[i]){
										impacto=eresistencia[i]-dimperio[i];
										eimperio[i]-=impacto;
										if(eimperio[i]<0) eimperio[i]=0;
									}
								}
							}
						}
					}
					System.out.println("La energ�a de la resistencia es: " + Arrays.toString(eresistencia));
					System.out.println("La energ�a del imperio es:       " + Arrays.toString(eimperio));
				}
				
				if(opt==3){
					energiamaxr=0; //esto podr�a ser energiamaxr=energiamaxi=supervivientesr=supervivientesi...=0
		            energiamaxi=0;
		            supervivientesr=0;
		            supervivientesi=0;
		            masdefensar=0;
		            masdefensai=0;
		            soltoper=0;
		            soltopei=0;
		            ganar=0;
		            ganai=0;
					for(int i = 0;i<dresistencia.length;i++){
						energiamaxr+=eresistencia[i];
						energiamaxi+=eimperio[i];
						if(eresistencia[i]>=7)soltoper++;
						if(eimperio[i]>=7)soltopei++;
					}
					System.out.println("La resistencia tiene una energ�a de " + energiamaxr);
					System.out.println("El imperio tiene una energ�a de " + energiamaxi);
					if(energiamaxr>energiamaxi){ganar++; System.out.println("La resistencia tiene m�s energ�a");}
					if(energiamaxi>energiamaxr){ganai++; System.out.println("El imperio tiene m�s energ�a");}
					if(energiamaxi==energiamaxr)System.out.println("Resistencia e Imperio tienen la misma energ�a");
					
					for(int i = 0;i<dresistencia.length;i++){ //este bucle no es necesario, se puede hacer en el de arriba
						if(eresistencia[i]>0)supervivientesr++;
						if(eimperio[i]>0)supervivientesi++;
					}
					System.out.println("La resistencia tiene " + supervivientesr + " supervivientes");
					System.out.println("El imperio tiene " + supervivientesi + " supervivientes");
					if(supervivientesr>supervivientesi){ganar++; System.out.println("La resistencia tiene m�s supervivientes");}
					if(supervivientesi>supervivientesr){ganai++; System.out.println("El imperio tiene m�s supervivientes con ");}
					if(supervivientesr==supervivientesi)System.out.println("Ambos tienen el mismo n�mero de supervivientes");
					
					for(int i = 0;i<dresistencia.length;i++){//igual que el anterior: este bucle no es necesario, se puede hacer en el de arriba
						masdefensar+=dresistencia[i];
						masdefensai+=dimperio[i];
					}
					System.out.println("La resistencia tiene " + masdefensar + " puntos de defensa");
					System.out.println("El imperio tiene " + masdefensai + " puntos de defensa");
					if(masdefensar>masdefensai){ganar++; System.out.println("La resistencia tiene m�s defensa");}
					if(masdefensai>masdefensar){ganai++; System.out.println("El imperio tiene m�s defensa con");}
					if(masdefensar==masdefensai)System.out.println("Ambos tienen el mismo n�mero de defensa");
					System.out.println("La resistencia tiene " + soltoper + " soldados a tope");
					System.out.println("El imperio tiene " + soltopei + " soldados a tope");
					if(soltoper>soltopei)ganar++;
					if(soltopei>soltoper)ganai++;
					System.out.println("La resistencia tiene " + ganar + " puntos");
					System.out.println("El imperio tiene " + ganai + " puntos");
					if(ganar>ganai)System.out.println("La fuerza prevalece!"); //gana la resistencia
					if(ganai>ganar)System.out.println("El lado oscuro fuerte es"); //gana el imperio
					if(ganai==ganar)System.out.println("Equilibrada la fuerza est�"); //empate
				}
            	
				if (opt>4 || opt<=0) {
					System.out.println("Opci�n incorrecta");
				}			
            }
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
