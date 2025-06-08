package Ejemplo;

public class main {
    public static void main (String args[]) {

        Persona user1 = new Persona ("Guillermo",123716378);
        user1.mostrarInfo();
        System.out.println("-------");
        Docente user2 = new Docente ("Juan",34284346,"Informatica");
        user2.mostrarInfo();
    }
}
