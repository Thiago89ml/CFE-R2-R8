package Ejemplo;

public class Docente extends Persona {

    private String especialidad;

    public Docente (String nombre, int ci, String especialidad) {
        super(nombre,ci);
        this.especialidad = especialidad;
    }
    @Override
    void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Especialidad: " + this.especialidad);
    }
}
