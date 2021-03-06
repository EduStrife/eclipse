package ejemplos.alb;



public class Arma {
    private int danyo;
    private int distancia;
    private TipoArma tipo;

    public Arma() {
        this(1, 0 , TipoArma.SARTEN);
    }

    public Arma(int danyo, int distancia) {
        this(danyo, distancia, TipoArma.SARTEN);
    }

    public Arma(int dano, int distancia, TipoArma tipo) {
        this.danyo = dano;
        this.distancia = distancia;
        this.tipo = tipo;
    }

    public void armarse(){
        System.out.println(
                "¡¡¡Avanzad sin temor a la oscuridad!!!" +
                "¡¡¡Luchad, luchad jinetes de Theoden!!!" +
                "¡¡¡Caeran las lanzas, se quebrarán los escudos. Aun restará la espada!!!" +
                "¡¡¡Rojo será el día, hasta el nacer del sol!!!"
        );
    }

    //setters && getters
    public void setDanyo(int danyo) {
        this.danyo = danyo;
    }
    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }
    public void setTipo(TipoArma tipo) {
        this.tipo = tipo;
    }
    public int getDanyo() {
        return danyo;
    }
    public int getDistancia() {
        return distancia;
    }
    public TipoArma getTipo() {
        return tipo;
    }
}
