package Animal;

public class main {
    public static void main (String args []) {

        Animal animales[] = new Animal[3];

        animales[0]= new Perro ("Firulais",5,"Perro","Cocker");
        animales[1] = new Gato ("Wilson",8,"gato","marron");
        animales[2] = new Conejo ("Pacha",12,"Conejo",20.0);

        for (int i = 0; i < animales.length; i++){
            System.out.println(animales[i]);

        }
    }
}
