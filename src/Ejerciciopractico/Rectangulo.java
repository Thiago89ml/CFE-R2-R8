package Ejerciciopractico;

public class Rectangulo extends Figura{
    private int lado;
    private int ancho;

    public Rectangulo (String nombre,int lado, int ancho){
        super(nombre);
        this.lado=lado;
        this.ancho=ancho;
    }

    @Override
    public void calcArea(){
        System.out.println("El area del rectangulo es:" + (this.lado*this.lado));
    }
}
