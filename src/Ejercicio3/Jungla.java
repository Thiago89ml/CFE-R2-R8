package Ejercicio3;

public class Jungla extends Campeon{
    private int controlMapa;

    public Jungla (String nombre, String rol,int ataque,int defensa,int velocidad,int controlMapa){
        super(nombre,rol,ataque,defensa,velocidad);
        this.controlMapa = controlMapa;
    }

    @Override
    public int ataqueEspecial(int ataque, int defensa) {
        return super.ataqueEspecial(ataque, defensa) + (controlMapa / 5);
    }

    @Override
    public String toString() {
        return super.toString() + controlMapa;
    }
}
