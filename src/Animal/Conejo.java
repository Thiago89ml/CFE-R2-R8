package Animal;

public class Conejo extends Animal{
    private double peso;

    public Conejo (String nombre, int edad, String especie, double peso){
        super(nombre,edad,especie);
        this.peso = peso;
    }

    @Override
    public String toString() {
        return super.toString() + peso;
    }
}
