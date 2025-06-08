package Ejercicio3;

public class Campeon {
    private String nombre;
    private String rol;
    private int ataque;
    private int defensa;
    private int velocidad;
    private int salud;


    public Campeon( String nombre, String rol,int ataque,int defensa,int velocidad){
        this.nombre = nombre;
        this.rol = rol;
        this.ataque = ataque;
        this.defensa = defensa;
        this.velocidad = velocidad;
        this.salud = 100;
    }
    public int getSalud(){
        return salud;
    }
    public void setSalud(int salud){
        this.salud = salud;
    }
    public String getnombre(){
        return nombre;
    }
    public int getDefensa(){
        return defensa;
    }
    public int getVelocidad(){
        return velocidad;
    }
    public int getAtaque(){
        return ataque;
    }
    public int atacar(int ataque,int velocidad){
        return (ataque + velocidad) /2;
    }
    public int ataqueEspecial(int ataque,int defensa){
        return (ataque + defensa) / 2;
    }

    @Override
    public String toString() {
        return "Campeon{" +
                "nombre='" + nombre + '\'' +
                ", rol='" + rol + '\'' +
                ", ataque=" + ataque +
                ", velocidad=" + velocidad +
                ", salud=" + salud +
                '}';
    }

    public void recibirdanio(int danio) {
        if (salud <= 0) {
            System.out.println("El campeon ya no tiene mas vida");
        } else {
            salud -= danio;
            if (salud < 0) {
                salud = 0;
            }
                System.out.println(nombre + "ha recibido " + danio + "de de daño, Salud restante es: " + salud);
            }
        }

        public String barraDeVida () {
            int total = 10; // Total de bloques de vida
            int bloques = (int) ((salud / 100.0) * total);
            String barra = "";

            for (int i = 0; i < bloques; i++) {
                barra += "█";
            }
            for (int i = bloques; i < total; i++) {
                barra += "-";
            }

            return barra;
        }
    }





