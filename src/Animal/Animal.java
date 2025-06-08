package Animal;

public class Animal {
    private String nombre;
    private int edad;
    String especie;

    public Animal(String nombre,int edad,String especie){
        this.nombre = nombre;
        this.edad = edad;
        this.especie=especie;


    }
    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", especie='" + especie + '\'' +
                '}';

    }
}
