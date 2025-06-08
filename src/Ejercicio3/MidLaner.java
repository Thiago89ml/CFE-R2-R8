package Ejercicio3;

public class MidLaner extends Campeon {
    private int poderMagico;

    public MidLaner(String nombre,String rol, int ataque ,int defensa, int velocidad,int poderMagico){
        super(nombre,rol,ataque,defensa,velocidad);
        this.poderMagico = poderMagico;
    }
    @Override
    public void recibirdanio(int danio) {
        int danioFinal = danio - (poderMagico / 8);
        if( danioFinal < 0);
        danioFinal = 0;
    }

    @Override
    public String toString() {
        return super.toString() + poderMagico;
    }
}

