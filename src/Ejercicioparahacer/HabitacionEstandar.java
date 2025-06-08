package Ejercicioparahacer;

public class HabitacionEstandar extends Habitacion {
    ;

    public HabitacionEstandar(int numero, String tipo, double precioBase) {
        super(numero, tipo, precioBase);


    }


    @Override
    public double CalcularPrecioFinal( int dias ) {
        return dias * (getprecioBase());
    }


}