
public class main {
    public static void main(String[] args) {
        //creamos el equipo de supervivientes
        /*
        ArrayList<Superviviente> Equipo = new ArrayList<Superviviente>();
        Equipo.add(new Superviviente(5,0,"Albert",SkillsPersonaje.FORTACHON));
        Equipo.add(new Superviviente(5,0,"Chen",SkillsPersonaje.RAPIDO));
        Equipo.add(new Superviviente(5,0,"juan",SkillsPersonaje.ESCURRIDIZO));
        Equipo.add(new Superviviente(5,0,"Alejandro",SkillsPersonaje.BUSCADOR));
        Equipo.add(new Superviviente(5,0,"Javi",SkillsPersonaje.AMBIDIESTRO));

        //Creamos 3 armas+

        Arma escopeta = new Arma(7, 2, TipoArma.ESCOPETA);
        Arma pistola = new Arma(3, 1, TipoArma.PISTOLA);
        Arma katana = new Arma(4, 0, TipoArma.KATANA);

        //otorgamos las armas

        Equipo.get(2).setArma(escopeta);
        Equipo.get(4).setArma(pistola);
        Equipo.get(3).setArma(katana);
        ArrayList<Zombie> zombies = new ArrayList<Zombie>();
        zombies.add(new Zombie(1 , 1,1, TipoZombie.CAMINANTE, "planta1", 5));

        for (Superviviente elemento : Equipo) {
            elemento.showInfoSuper();
            System.out.println();
        }
        for (Zombie elemento:zombies) {
            elemento.showInfoZombie();
            System.out.println();
        }
        */

        //Equipo de supervivientes
        Superviviente[] Equipo = new Superviviente[5];
        Equipo[0] = new Superviviente(3, 0, "Albert", SkillsPersonaje.FORTACHON);
        Equipo[1] = new Superviviente(3, 0, "Laura", SkillsPersonaje.RAPIDO);
        Equipo[2] = new Superviviente(3, 0, "juan", SkillsPersonaje.ESCURRIDIZO);
        Equipo[3] = new Superviviente(3, 0, "Alejandro", SkillsPersonaje.BUSCADOR);
        Equipo[4] = new Superviviente(3, 0, "Javi", SkillsPersonaje.AMBIDIESTRO);

        //Armas que se tienen
        //sarten constructor por defecto
        Arma pistola = new Arma(1, 2, TipoArma.PISTOLA);
        Arma escopeta = new Arma(1, 2, TipoArma.ESCOPETA);
        Arma katana = new Arma(2, 1, TipoArma.KATANA);
        Arma hacha = new Arma(2, 1, TipoArma.HACHA);

        Equipo[0].setArma(hacha);
        Equipo[1].setArma(escopeta);
        Equipo[2].setArma(katana);
        Equipo[4].setArma(pistola);

        int numeroZombiesPorPlanta = 8;
        System.out.println();
        System.out.println("               SUPERVIVIENTES TEAM                     ");
        System.out.println();
        for (Superviviente SupervivienteActual:Equipo) {
            SupervivienteActual.bonificacionSkill();
            SupervivienteActual.showInfoSuper2();
        }


        //planta 3  todo caminanetes

        System.out.println( "** Planta 3 **");
        System.out.println();
        Zombie[] planta1 = new Zombie[numeroZombiesPorPlanta];
        for (int i = 0; i < numeroZombiesPorPlanta; i++) {
            planta1[i] = new Zombie(1, 1, 1, TipoZombie.CAMINANTE, "planta1", 5);
        }
        boolean EquipoHaSobrevivido;
        EquipoHaSobrevivido =  batalla(Equipo, planta1);

        resultadoBatalla(Equipo, planta1);



        if(EquipoHaSobrevivido) {
            System.out.println("Enhorabuena habeis llegado a la segunda planta!!");

            //planta 2 todo 2 gordo 6 caminantes
            System.out.println();
            System.out.println();
            System.out.println("**Planta 2**");
        }else{
            System.out.println("                 *El equipo ha perecido en combate*");
        }

        Zombie[] planta2 = new Zombie[numeroZombiesPorPlanta];
        for (int i = 0; i < numeroZombiesPorPlanta; i++) {
            if (i % 4 == 0) {
                planta2[i] = new Zombie(1, 2, 2, TipoZombie.GORDO, "planta2", 5);
            } else {
                planta2[i] = new Zombie(1, 1, 1, TipoZombie.CAMINANTE, "planta2", 5);
            }
        }

        batalla(Equipo, planta2);
        resultadoBatalla(Equipo, planta2);

        System.out.println("Enhorabuena habeis llegado a la primera planta!!");

        //planta 1 todo 1 unknow 2 gordos 5 caminante
        System.out.println();
        System.out.println();
        System.out.println("**Planta 1**");
        Zombie[] planta3 = new Zombie[numeroZombiesPorPlanta];
        for (int i = 0; i < numeroZombiesPorPlanta; i++) {
            if (i % 4 == 0) {
                planta3[i] = new Zombie(1, 2, 2, TipoZombie.GORDO, "planta3", 5);
            } else {
                if (i == 7) {
                    planta3[i] = new Zombie(3, 2, 2, TipoZombie.WITCH, "planta3", 5);
                } else {
                    planta3[i] = new Zombie(1, 1, 1, TipoZombie.CAMINANTE, "planta3", 5);
                }
            }
        }
        batalla(Equipo, planta3);
        resultadoBatalla(Equipo, planta3);

        System.out.println("Enhorabuena habeis conseguido escapar!!");

    }
    public static boolean batalla(Superviviente[] Team, Zombie[] Horda){
        for (Superviviente  SupervivienteActual:Team) {
            SupervivienteActual.resetPuedoEscapar();
        } //reseteamos a los personajes escurridizos la opcion de poder escapar por cada planta

        int miss; // (0 o 1) si es 0 ha fallado.
        int objetivo; // del 0 al 7
        int contadorSuperMuertos = 0;
        int contadorZombieMuertos = 0;
        while (contadorSuperMuertos != Team.length && contadorZombieMuertos != Horda.length) { // si ninguno de los 2 bandos esta muerto-
            int index = 0; // posicion del superviviente actual
            for (Superviviente supervivienteActual : Team) { //recorremos el array de supervientes
                if (Team[index].getVidas() != 0) { //si el superviviente esta vivo
                    for (int i = 0; i < supervivienteActual.getArma().getAtaques(); i++) { //atacamos por cada ataque del que disponga el superviviente
                        if(contadorZombieMuertos != Horda.length) {
                            do {
                                objetivo = (int) (Math.random() * Horda.length); //seleccionamos un zombie objetivo aleatorio
                            } while (Horda[objetivo].getVida() == 0); //repetir mientras el zombie objetivo este muerto
                            miss = (int) (Math.random() * 2); //miramos la probabilidad de fallo
                            if (miss == 1) { // si no fallamos es decir, golpeamos
                                if (supervivienteActual.getArma().getDanyo() >= Horda[objetivo].getVida()) { // miramos si el daño del arma es igual o superior a la vida del zombie
                                    Horda[objetivo].setVida(0); //en caso de que sea correcto, matamos al zombie
                                    contadorZombieMuertos++; // sumamos 1 en el contador de zombies muertos
                                } else { // sino...
                                    //el zombie es demasiado poderoso para tu ataque
                                }
                            } else { // si fallamos
                                //fallo
                            }
                        }
                    }
                    index++; // sumamos 1 para ver la posicion del superviviente actual
                } else {
                    index++; // si el superviviente esta muerto, pasamos al siguiente
                }
            }
            index = 0; // reseteamos y ahora sera la posicion del zombie actual
            for (Zombie zombieActual : Horda) { //recorremos el array de zombies de la planta 1
                if (Horda[index].getVida() != 0) { // si el zombie esta vivo
                    if (contadorSuperMuertos != Team.length) {
                        do {
                            objetivo = (int) (Math.random() * Team.length); //seleccionamos un superviviente objetivo aleatorio
                        } while (Team[objetivo].getVidas() == 0);
                        miss = (int) (Math.random() * 2); //miramos la probabilidad de fallo
                        if (miss == 1) { // si no fallamos, es decir, golpeamos
                            if(Team[objetivo].getPuedoEscapar()){
                                Team[objetivo].setPuedoEscapar(false);
                            }else{
                                if (Team[objetivo].getVidas() <= zombieActual.getDano()) { // si la vida del superviviente es inferior o igual al daño del zombie
                                    Team[objetivo].setVidas(0); //sino le restamos la vida y palante
                                    contadorSuperMuertos++;
                                } else {
                                    Team[objetivo].setVidas(Team[objetivo].getVidas() - zombieActual.getDano()); //sino le restamos la vida y palante
                                }
                            }
                        }
                        index++;
                    } else {
                        index++;
                    }
                }
            }
        }
         if (contadorSuperMuertos == Team.length){
            return false; //el equipo ha muerto
        }else{
             return true; //el equipo ha sobrevivido
         }
    }
    public static void resultadoBatalla(Superviviente[] Team, Zombie[] Horda){
        System.out.println("-- Equipo --");
        System.out.println();
        for (Superviviente elemento : Team) {
            elemento.showInfoSuper();
            System.out.println();
        }
        System.out.println(" --Zombies --");
        System.out.println();
        for (Zombie elemento : Horda) {
            elemento.showInfoZombie();
            System.out.println();
        }
    }

}
