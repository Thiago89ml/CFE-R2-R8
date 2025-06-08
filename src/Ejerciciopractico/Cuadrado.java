package Ejerciciopractico;

public class Cuadrado extends Figura{
    private int lado;

    public Cuadrado(String nombre ,int lado){
        super(nombre);
        this.lado = lado;

    }

    @Override
    public void calcArea(){
        System.out.println("Area del cuadrado:" + (this.lado*this.lado));
    }
}
