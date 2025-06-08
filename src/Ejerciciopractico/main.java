package Ejerciciopractico;

public class main {
    public static void main(String args[]) {
        Cuadrado c1 = new Cuadrado("Cuadrado",15);
        Rectangulo r1= new Rectangulo("Rectangulo",10,5);

        r1.calcArea();
        c1.calcArea();
    }
}
