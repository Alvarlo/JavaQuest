import java.util.Scanner;

public class JavaQuest1 {
    public static void main(String[] args) {

        //Apartado 1: Creación de personajes (2 puntos)
        //Solicita al usuario que elija un personaje para jugar entre tres opciones: Guerrero, Mago y Arquero.
        //Cada personaje tiene diferentes estadísticas, como puntos de vida, puntos de ataque y puntos de defensa.
        //Almacena estas estadísticas en variables.


        System.out.println("Selecciona tu clase:");
        System.out.println("- Guerrero");
        System.out.println("- Mago");
        System.out.println("- Arquero");
        Scanner scl = new Scanner(System.in);
        String seleccionClase = scl.nextLine();

        int vida = 0, ataque = 0, defensa = 0;

        switch (seleccionClase){
            case "Guerrero":
                System.out.println("Has seleccionado Guerrero");
                vida = (int) (Math.random()*31+60);
                ataque = (int) (Math.random()*16+20);
                defensa = (int) (Math.random()*21+50);
                break;
            case "Mago":
                System.out.println("Has seleccionado Mago");
                vida = (int) (Math.random()*21+45);
                ataque = (int) (Math.random()*21+35);
                defensa = (int) (Math.random()*21+35);
                break;
            case "Arquero":
                System.out.println("Has seleccionado Arquero");
                vida = (int) (Math.random()*21+50);
                ataque = (int) (Math.random()*21+25);
                defensa = (int) (Math.random()*21+40);
                break;

        }
        System.out.println("Vida = " + vida);
        System.out.println("Ataque = " + ataque);
        System.out.println("Defensa = " + defensa);

        System.out.println("**********************************");
        /*
        Apartado 2: Creación del enemigo (0.5 puntos)
        Genera aleatoriamente un enemigo para el jugador con estadísticas similares a las del personaje elegido.
        Esto incluye puntos de vida, puntos de ataque y puntos de defensa del enemigo.
        Utiliza números aleatorios para generar estas estadísticas.
        */
        int vidaE = 0, ataqueE = 0, defensaE = 0;

        int idEnemigo = (int) (Math.random()*3);

        String nombreE ="";
        switch (idEnemigo){
            case 0:
                //Goblin
                vidaE = (int) (Math.random()*21+40);
                ataqueE = (int) (Math.random()*21+10);
                defensaE = (int) (Math.random()*21+20);
                nombreE = "Goblin";
                break;
            case 1:
               //Bandido
                vidaE = (int) (Math.random()*21+45);
                ataqueE = (int) (Math.random()*21+15);
                defensaE = (int) (Math.random()*21+15);
                nombreE = "Bandido";
                break;
            case 2:
               //Slime
                vidaE = (int) (Math.random()*21+50);
                ataqueE = (int) (Math.random()*21+5);
                defensaE = (int) (Math.random()*21+30);
                nombreE = "Slime";
                break;
        }
        System.out.println("Te enfrentas a : " + nombreE);
        System.out.println("VidaE = " + vidaE);
        System.out.println("AtaqueE = " + ataqueE);
        System.out.println("DefensaE = " + defensaE);


        /*
        Apartado 3: Implementación de la batalla (4 puntos)
        Apartado 4: Finalización de la batalla (0.5 puntos)
        Apartado 5: Interfaz de usuario (0.5 puntos)
        Apartado 6: Generación de sprites (0.5 puntos)
        Apartado 7: Enemigo inteligente (1 punto)
                    Fase 1 (mientras tenga más de un 15% de vida)
                    Fase 2 (mientras tenga menos de un 15% de vida)
         */

    }
}
