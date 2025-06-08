package Animal;

public class Perro extends Animal{
    private String raza;

    public Perro (String nombre,int edad, String especie,String raza){
        super(nombre,edad,especie);
        this.raza = raza;
    }

    @Override
    public String toString() {
        return super.toString() + raza;
    }
}


