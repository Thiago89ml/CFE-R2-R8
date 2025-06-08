package Ejercicioparahacer;

public class HabitacionSuite extends Habitacion {

    public HabitacionSuite(int numero,String tipo, double precioBase){
        super  (numero,tipo,precioBase);
    }
    @Override
    public double CalcularPrecioFinal( int dias){
        return dias * (getprecioBase() * 1.2);
    }

}
