package Ejercicio3;

public class ADC extends Campeon{
    private int rango;

    public ADC (String nombre,String rol,int ataque,int defensa,int velocidad, int rango){
        super(nombre,rol,ataque,defensa,velocidad);
        this.rango = rango;
    }

    public int atacar(int ataque,int velocidad){
        return super.atacar(ataque,velocidad) + (rango /4);
    }


    public String toString() {
        return super.toString() + rango;
    }
}

