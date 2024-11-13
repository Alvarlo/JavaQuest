import java.util.Scanner;

public class JavaQuestAlvaro {
    public static void main(String[] args) {

        //Apartado 1: Creación de personajes (2 puntos)
        //Solicita al usuario que elija un personaje para jugar entre tres opciones: Guerrero, Mago y Arquero.
        //Cada personaje tiene diferentes estadísticas, como puntos de vida, puntos de ataque y puntos de defensa.
        //Almacena estas estadísticas en variables.


        String text1 = "Bienvenido a JavaQuest"
                + "\nSelecciona tu clase"
                + "\n "
                + "\n- Guerrero"
                + "\n- Mago"
                + "\n- Arquero" +
                "\n";

       /*
        int i;
        for (i = 0; i < text1.length(); i++) {
            System.out.printf("%c", text1.charAt(i));
            try {
                Thread.sleep(90);//pause between characters
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
        */
        System.out.println(text1);
        Scanner scl = new Scanner(System.in);

        String seleccionClase = scl.nextLine();

        int vida = 0, ataque = 0, defensa = 0;


        if (seleccionClase.equalsIgnoreCase("Guerrero")) {
            System.out.println("Has seleccionado Guerrero, tus estadísticas son: ");
            vida = (int) (Math.random() * 31 + 200);
            ataque = (int) (Math.random() * 16 + 10);
            defensa = (int) (Math.random() * 21 + 50);
        } else if (seleccionClase.equalsIgnoreCase("Mago")) {
            System.out.println("Has seleccionado Mago, tus estadísticas son: ");
            vida = (int) (Math.random() * 31 + 60);
            ataque = (int) (Math.random() * 16 + 30);
            defensa = (int) (Math.random() * 11 + 5);
        } else if (seleccionClase.equalsIgnoreCase("Arquero")) {
            System.out.println("Has seleccionado Arquero, tus estadísticas son: ");
            vida = (int) (Math.random() * 31 + 60);
            ataque = (int) (Math.random() * 16 + 20);
            defensa = (int) (Math.random() * 16 + 15);
        }
        /* switch (seleccionClase){
            case "Guerrero":
                System.out.println("Has seleccionado Guerrero");
                vida = (int) (Math.random()*31+60);
                ataque = (int) (Math.random()*16+20);
                defensa = (int) (Math.random()*21+50);
                break;
            case "Mago":
                System.out.println("Has seleccionado Guerrero");
                vida = (int) (Math.random()*31+60);
                ataque = (int) (Math.random()*16+20);
                defensa = (int) (Math.random()*21+50);
                break;
            case "Arquero":
                System.out.println("Has seleccionado Guerrero");
                vida = (int) (Math.random()*31+60);
                ataque = (int) (Math.random()*16+20);
                defensa = (int) (Math.random()*21+50);
                break;
                }

         */

        System.out.println("Tu Vida es de " + vida);
        System.out.println("Tu ataque es de " + ataque);
        System.out.println("Tu defensa es de " + defensa);

        System.out.println("**********************************");
        /*
        Apartado 2: Creación del enemigo (0.5 puntos)
        Genera aleatoriamente un enemigo para el jugador con estadísticas similares a las del personaje elegido.
        Esto incluye puntos de vida, puntos de ataque y puntos de defensa del enemigo.
        Utiliza números aleatorios para generar estas estadísticas.
        */
        int vidaE = 0, ataqueE = 0, defensaE = 0;

        int idEnemigo = (int) (Math.random() * 3);

        String nombreE = "";
        switch (idEnemigo) {
            case 0:
                //Goblin
                vidaE = (int) (Math.random() * 21 + 100);
                ataqueE = (int) (Math.random() * 11 + 10);
                defensaE = (int) (Math.random() * 6 + 1);
                nombreE = "Goblin";
                break;
            case 1:
                //Bandido
                vidaE = (int) (Math.random() * 21 + 105);
                ataqueE = (int) (Math.random() * 11 + 15);
                defensaE = (int) (Math.random() * 6 + 5);
                nombreE = "Bandido";
                break;
            case 2:
                //Slime
                vidaE = (int) (Math.random() * 21 + 100);
                ataqueE = (int) (Math.random() * 11 + 5);
                defensaE = (int) (Math.random() * 6 + 5);
                nombreE = "Slime";
                break;
            /*case 3:
                //kraken
                vidaE = (int) (Math.random()*21+50);
                ataqueE = (int) (Math.random()*21+5);
                defensaE = (int) (Math.random()*16+15);
                nombreE = "Slime";*/
        }

        // double PorcentajevidaE = (double) (vidaE * 15) /100; // esto es para el patrón de ataque cuando tiene menos de un 15% de vida

        System.out.println("¡Cuidado! Ha aparecido un enemigo");
        System.out.println("**********************************");
        System.out.println("Ten cuidado puede ser una pelea difícil");
        System.out.println("**********************************");
        System.out.println("Te enfrentas a un " + nombreE);
        System.out.println("Su vida es de " + vidaE);
        System.out.println("Su ataque es de " + ataqueE);
        System.out.println("Su defensa es de " + defensaE);
        System.out.println("**********************************");

        /*
        Apartado 3: Implementación de la batalla (4 puntos)
        Inicia la batalla por turnos entre el jugador y el enemigo.
        En cada turno, el jugador puede elegir entre atacar o defenderse.
        Implementa un sistema de ataque y defensa que tome en cuenta las estadísticas de los personajes y enemigos.
        Actualiza los puntos de vida de cada uno después de cada turno.
        */

        String atacar = "atacar", defender = "defender", eleccion = "";
        int turno = 1;
        int contadorEnrage = 1;

        int vidaDefensa = vida;
        boolean flagPrimo;
        int ataqueEspEnemigo = ataqueE * 2;

        int enrage = (int) (vidaE*0.15);
        int curacionE = (int) (vidaE*0.10);
        int enrageAtoDef = 0;


        while (vida > 0 && vidaE > 0) {


            flagPrimo = true;
            if (turno != 1) {

                for (int j = 2; j < turno; j++) {
                    if (turno % j == 0) {
                        flagPrimo = false;
                    }
                }
            } else flagPrimo = false;


            System.out.println("Turno " + turno);
            System.out.println("**********************************");
            System.out.println("Qué quieres hacer: ");
            System.out.print("- 1. Atacar");
            System.out.println("     - 2. Defender");
            System.out.println("**********************************");
            eleccion = scl.nextLine();

            if ((contadorEnrage== 1) && (vidaE>enrage) && flagPrimo == false && turno % 2 == 0) {

                //el enemigo bloquea
                System.out.println("No te quitan vida, ya que el enemigo está denfendiéndose");

                if (eleccion.equalsIgnoreCase(atacar) || (eleccion.equals("1"))) {
                    vidaE -= (ataque - (defensaE));

                    System.out.println("Has atacado, el enemigo tiene " + vidaE + " puntos de vida restantes");
                } else if (eleccion.equalsIgnoreCase(defender) || (eleccion.equals("2"))) {
                    vidaDefensa = vida + (defensa);
                    System.out.println("Los dos os defendéis, os quedais mirando a shiro");
                } else {
                    System.out.println("Pierdes el turno");
                    System.out.println("Tu vida actual es  " + (vida - ataqueE));
                    vida -= ataqueE;
                    continue;
                }
                /*
                System.out.println("**********************************");
                System.out.println(seleccionClase);
                for (int x = 0; x < vida / 10; x++) {
                    System.out.print("|");
                }
                System.out.println(vida);
                System.out.println(nombreE);
                for (int x = 0; x < vidaE / 10; x++) {
                    System.out.print("|");
                }
                System.out.println(vidaE);
                System.out.println("**********************************");

                 */

            }else if ((contadorEnrage== 1) && (vidaE>enrage) && flagPrimo==true) {
                // el enemigo ataca
                if (eleccion.equalsIgnoreCase(atacar) || (eleccion.equals("1"))) {
                    System.out.println("Tu vida actual es  " + (vida - ataqueE));
                    vida -= ataqueE;

                    vidaE -= ataque ;
                    System.out.println("Has atacado, el enemigo tiene " + vidaE + " puntos de vida restantes");

                }else if (eleccion.equalsIgnoreCase(defender) || (eleccion.equals("2"))){
                    vidaDefensa = vida + (defensa);
                    System.out.println("Te defiendes, aumentando tu vida a " + vidaDefensa + " durante este turno");
                    if ((vidaDefensa - ataqueE) > vida) {
                        System.out.println("Has bloqueado todo el ataque, tu vida actual no varía");
                        //System.out.println("Has bloqueado todo el ataque, tu vida actual es  " + vida);
                    } else {
                        //System.out.println("El enemigo te ha atacado");
                        System.out.println("El enemigo te ha atacado, tu vida actual es  " + (vidaDefensa - ataqueE));
                        vida = (vidaDefensa - ataqueE);
                    }

                }else {

                    System.out.println("Pierdes el turno");
                    System.out.println("Tu vida actual es  " + (vida - ataqueE));
                    vida -= ataqueE;
                    continue;

                }
            }else if ((contadorEnrage== 1) && (vidaE>enrage) && flagPrimo == false && turno % 2 == 1) {
            //ataque especial enemigo
                if (eleccion.equalsIgnoreCase(atacar) || (eleccion.equals("1"))) {
                    vidaE -= ataque ;
                    System.out.println("Has atacado, el enemigo tiene " + vidaE + " puntos de vida restantes");
                    System.out.println("El enemigo usa su HabEsp, tu vida actual es  " + (vida - ataqueEspEnemigo));
                    vida -= ataqueEspEnemigo;
                }else if (eleccion.equalsIgnoreCase(defender) || (eleccion.equals("2"))){
                    vidaDefensa = vida + (defensa);
                    System.out.println("Te defiendes, aumentando tu vida a " + vidaDefensa + " durante este turno");
                    if ((vidaDefensa - ataqueEspEnemigo) > vida) {
                        System.out.println("El enemigo usa su HabEsp,pero has bloqueado todo el ataque, tu vida actual no varía");
                        //System.out.println("Has bloqueado todo el ataque, tu vida actual es  " + vida);
                    } else {
                        //System.out.println("El enemigo te ha atacado");
                        System.out.println("El enemigo usa su HabEsp, tu vida actual es  " + (vidaDefensa - ataqueEspEnemigo));
                        vida = (vidaDefensa - ataqueEspEnemigo);
                    }
                }else {

                    System.out.println("Pierdes el turno");
                    System.out.println("Tu vida actual es  " + (vida - ataqueE));
                    vida -= ataqueE;
                    continue;

                }

            }else if (vidaE < enrage || contadorEnrage >=2){
                System.out.println("El enemigo está en Enrage");
                // ENRAGE: Patrón:

                switch (contadorEnrage) {
                    case 1: // 1: Curarse
                        vidaE += curacionE;
                        System.out.println("El enemigo se cura " + curacionE + " ptos de vida, hasta un total de " + vidaE);
                        if (eleccion.equalsIgnoreCase(atacar) || (eleccion.equals("1"))) {

                            vidaE -= ataque;
                            System.out.println("Has atacado, el enemigo tiene " + vidaE + " puntos de vida restantes");

                        } else if (eleccion.equalsIgnoreCase(defender) || (eleccion.equals("2"))) {
                            vidaDefensa = vida + (defensa);
                            System.out.println("Te defiendes, aumentando tu vida a " + vidaDefensa + " durante este turno");
                        }

                        break;
                    case 2: // 2: Defensa / Ataque (50%)
                        enrageAtoDef = (int) (Math.random()*2);


                        if (eleccion.equalsIgnoreCase(atacar) || (eleccion.equals("1"))) {
                            if (enrageAtoDef == 0){ //enemigo ataca
                                vidaE -= ataque;
                                System.out.println("Has atacado, el enemigo tiene " + vidaE + " puntos de vida restantes");

                                vida -= ataqueE;
                                System.out.println("El enemigo te ataca, tu vida actual es  " + (vida - ataqueE));
                            }else if (enrageAtoDef == 1){
                                vidaE -= (ataque - (defensaE));
                                System.out.println("El enemigo se defiende");
                                System.out.println("Has atacado, el enemigo tiene " + vidaE + " puntos de vida restantes");
                            }

                        } else if (eleccion.equalsIgnoreCase(defender) || (eleccion.equals("2"))) {
                            vidaDefensa = vida + (defensa);
                            System.out.println("Te defiendes, aumentando tu vida a " + vidaDefensa + " durante este turno");
                            if (enrageAtoDef == 0){ //enemigo defiende

                                if ((vidaDefensa - ataqueE) > vida) {
                                    System.out.println("El enemigo ataca, pero has bloqueado todo el ataque, tu vida actual no varía");
                                    //System.out.println("Has bloqueado todo el ataque, tu vida actual es  " + vida);
                                } else {
                                    //System.out.println("El enemigo te ha atacado");
                                    System.out.println("El enemigo usa su HabEsp, tu vida actual es  " + (vidaDefensa - ataqueE));
                                    vida = (vidaDefensa - ataqueE);
                                }
                            }else if (enrageAtoDef == 1){
                                System.out.println("El enemigo se defiende y tu tambien, muy bien cracks");
                            }
                        }
                        break;
                    case 3: // 3: Hab Especial
                        if (eleccion.equalsIgnoreCase(atacar) || (eleccion.equals("1"))) {
                            vidaE -= ataque ;
                            System.out.println("Has atacado, el enemigo tiene " + vidaE + " puntos de vida restantes");

                            System.out.println("El enemigo usa su HabEsp, tu vida actual es  " + (vida - ataqueEspEnemigo));
                            vida -= ataqueEspEnemigo;
                            contadorEnrage = 0;

                        }else if (eleccion.equalsIgnoreCase(defender) || (eleccion.equals("2"))){
                            vidaDefensa = vida + (defensa);
                            System.out.println("Te defiendes, aumentando tu vida a " + vidaDefensa + " durante este turno");
                            if ((vidaDefensa - ataqueEspEnemigo) > vida) {
                                System.out.println("El enemigo usa su HabEsp,pero has bloqueado todo el ataque, tu vida actual no varía");
                                //System.out.println("Has bloqueado todo el ataque, tu vida actual es  " + vida);
                                contadorEnrage = 0;
                            } else {
                                //System.out.println("El enemigo te ha atacado");
                                System.out.println("El enemigo usa su HabEsp, tu vida actual es  " + (vidaDefensa - ataqueEspEnemigo));
                                vida = (vidaDefensa - ataqueEspEnemigo);
                                contadorEnrage = 0;
                            }

                        }
                        System.out.println("El enemigo finaliza su fase de Enrage");
                        break;

                }

                contadorEnrage++;
            }

            /*
            if (eleccion.equalsIgnoreCase(atacar)){
                System.out.println("Tu vida actual es  " + (vida-ataqueE));
                vida -= ataqueE;
            }else {
                if ((vidaDefensa-ataqueE)>vida){
                    System.out.println("Has bloqueado todo el ataque, tu vida actual es  " + vida);
                }else {
                    System.out.println("Tu vida actual es  " + (vidaDefensa-ataqueE));
                    vida -= (vidaDefensa-ataqueE);
                }
            }

             */


        //System.out.println("La vida del enemigo es " + vidaE);
        System.out.println("Termina el turno:");
        turno++;
    }

        if (vidaE < 0){
            System.out.println("Has ganado!! Has obtenido un pin del fari con musiquita");
        }else {
            System.out.println("Vaya.... has perdido, hasta luego! ");
        }



        /*
        Apartado 5: Interfaz de usuario (0.5 puntos)
        Apartado 6: Generación de sprites (0.5 puntos)
        Apartado 7: Enemigo inteligente (1 punto)
                    Fase 1 (mientras tenga más de un 15% de vida)
                    Fase 2 (mientras tenga menos de un 15% de vida)
         */

    }
}
