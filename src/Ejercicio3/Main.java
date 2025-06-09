package Ejercicio3;
import java.util.Random;
public class Main {

    public static void main(String[] args) {

        Random rand = new Random();

        // 1. Crear arrays de 3 campeones para cada equipo
        Campeon[] equipo1 = new Campeon[3];
        Campeon[] equipo2 = new Campeon[3];

        // 2. Instanciar campeones y asignarlos manualmente a los arrays
        equipo1[0] = new TopLaner("Garen", "Top", 80, 70, 40, 30);
        equipo1[1] = new MidLaner("Ahri", "Mid", 70, 50, 60, 40);
        equipo1[2] = new ADC("Jinx", "ADC", 85, 40, 75, 35);

        equipo2[0] = new Jungla("Lee Sin", "Jungla", 75, 60, 65, 45);
        equipo2[1] = new Support("Thresh", "Support", 40, 80, 30, 50);
        equipo2[2] = new MidLaner("Lux", "Mid", 68, 55, 60, 38);

        // 3. Mostrar info inicial
        System.out.println("EQUIPO 1:");
        for (Campeon c : equipo1) System.out.println(c);
        System.out.println("EQUIPO 2:");
        for (Campeon c : equipo2) System.out.println(c);

        System.out.println("---LA BATALLA ESTA POR COMENZAR---");
        while (equipoSigueVivo(equipo1) && equipoSigueVivo(equipo2)){
            Campeon atacante1 = obtenerVivoAleatorio(equipo1, rand);
            Campeon defensor2 = obtenerVivoAleatorio(equipo2,rand);

            boolean usaEspecial = rand.nextBoolean();
            int danio1 = usaEspecial ?
                    atacante1.ataqueEspecial(atacante1.getAtaque(), atacante1.getDefensa()) :
                    atacante1.atacar(atacante1.getAtaque(), atacante1.getVelocidad());

            defensor2.recibirdanio(danio1);

            if (!equipoSigueVivo(equipo2)) break;

            Campeon atacante2= obtenerVivoAleatorio(equipo2, rand);
            Campeon defensor1= obtenerVivoAleatorio(equipo1, rand);

            usaEspecial = rand.nextBoolean();
            int danio2 = usaEspecial ? atacante2.ataqueEspecial(atacante2.getAtaque(), atacante2.getDefensa())
                    : atacante2.atacar(atacante2.getAtaque(), atacante2.getVelocidad());

            defensor1.recibirdanio(danio2);
        }
        if (equipoSigueVivo(equipo1)) {
            System.out.println("\n¡El EQUIPO 1 ha ganado!");
        } else {
            System.out.println("\n¡El EQUIPO 2 ha ganado!");

        }
    }

    public static boolean equipoSigueVivo(Campeon[] equipo) {
        for (int i = 0; i < equipo.length; i++) {
            if (equipo[i].getSalud() > 0) {
                return true;
            }
        }
        return false;
    }

    public static Campeon obtenerVivoAleatorio (Campeon[] equipo, Random rand) {
        Campeon elegido;
        do {
            elegido = equipo [rand.nextInt(equipo.length)];
        } while (elegido.getSalud() <= 0);
        return elegido;
    }
}
