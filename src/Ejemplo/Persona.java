package Ejemplo;

public class Persona {

    private String nombre;
    private int ci;

    public Persona(String nombre, int ci){
        this.nombre= nombre;
        this.ci= ci;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", ci=" + ci +
                '}';
    }

    void mostrarInfo(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println(("Ci:" ) + this.ci);
    }
}
