package Ejercicioparahacer;

public class main {
    public static void main (String args[]) {
        HabitacionEstandar h1 = new HabitacionEstandar(52,"Estandar",1200);
        HabitacionSuite h2 = new  HabitacionSuite(2,"Suite",2000);
        HabitacionSuitePresidencial h3 = new HabitacionSuitePresidencial(34,"SuitePresidencial",3000);

        h1.CalcularPrecioFinal(5);
        h2.CalcularPrecioFinal(5);
        h3.CalcularPrecioFinal(6);

        h1.mostrarDetalle();
        h2.mostrarDetalle();
        h3.mostrarDetalle();
    }
}
