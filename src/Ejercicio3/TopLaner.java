package Ejercicio3;

public class TopLaner  extends Campeon{
    private int resistencia;

    public TopLaner(String nombre,String rol,int ataque,int defensa,int velocidad,int resistencia){
        super(nombre,rol,ataque,defensa,velocidad);
        this.resistencia = resistencia;
    }
    @Override
    public void recibirdanio(int danio) {
        int danioFinal = danio -(resistencia /10);
        if (danioFinal < 0) danioFinal =0;
        super.recibirdanio(danioFinal);
}



}