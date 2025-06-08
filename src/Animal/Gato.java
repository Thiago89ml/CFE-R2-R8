package Animal;

public class Gato extends Animal {
    private String color;

    public Gato(String nombre,int edad,String especie,String color){
        super(nombre,edad,especie);
        this.color = color;

    }

    @Override
    public String toString() {
        return super.toString() + color;
    }
}


