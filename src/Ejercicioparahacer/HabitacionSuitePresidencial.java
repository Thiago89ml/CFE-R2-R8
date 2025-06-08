package Ejercicioparahacer;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class HabitacionSuitePresidencial extends Habitacion {

    public HabitacionSuitePresidencial(int numero, String tipo, double precioBase) {
        super(numero, tipo, precioBase);
    }

    @Override
    public double CalcularPrecioFinal(int dias) {
        if (dias < 5) {
            return dias * (getprecioBase() * 1.5 * 0.10);
        } else {
            return dias * (getprecioBase() * 1.5);
        }
    }
}










