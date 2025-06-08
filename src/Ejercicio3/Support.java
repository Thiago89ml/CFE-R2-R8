package Ejercicio3;

public class Support extends Campeon {
    private int curacion;

    public Support(String nombre, String rol, int ataque, int defensa, int velocidad, int curacion) {
        super(nombre, "Support", ataque, defensa, velocidad);
        this.curacion = curacion;
    }

    @Override
    public int ataqueEspecial(int ataque, int defensa) {
        int resultado = super.ataqueEspecial(ataque, defensa);
        int curacionaplicada = curacion / 10;

        int nuevaSalud = getSalud()+ curacionaplicada;
        if (nuevaSalud > 100) {
            nuevaSalud = 100;
        }
        setSalud(nuevaSalud);

        System.out.println(getSalud() + "Ha usado su ataque esepcial y se ha curado: "+ curacionaplicada + ".Su vida actual es de: " + getSalud());
        return resultado;
    }
}
