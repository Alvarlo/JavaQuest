import java.util.Scanner;

public class AsciiPruebas {
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
            System.out.println("Has seleccionado Guerrero" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡀⠀⢀⣐⠁⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⡗⣺⠖⠋⢸⠀⣸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢔⣉⣭⣼⣄⡯⡀⠀⡌⢀⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⢠⢇⣟⠜⢀⡌⠀⣀⡤⠀⠀⠀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⣼⢸⠁⡠⠊⠀⡾⢻⠀⠀⠀⠀⠫⡢⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⢀⡇⠈⠊⠀⠀⠀⠈⠢⣡⠖⢉⣸⣹⣴⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡜⢸⠁⠀⠀⠀⠀⠀⠀⠀⢸⣉⡔⠒⢂⣼⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣷⡞⠀⠀⠀⠀⠀⠀⠀⠀⢀⣽⡐⣔⠾⣏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣻⣻⡟⡀⠀⠀⠀⠀⡠⢀⢶⠟⡯⣿⡢⡈⣌⣵⣴⡶⠃⠴⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⡽⢤⢊⡷⢢⢤⡞⡝⣾⠏⠸⣳⣻⣷⣾⡷⣿⠚⠒⢊⣉⣩⣖⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢼⣉⡷⠀⠙⠴⡡⢣⠃⣸⡷⣆⢀⣱⡛⠉⣼⣰⡌⠭⠤⠤⠀⠒⣲⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠀⠀⠀⠀⠉⠉⠀⠉⠀⢉⠹⣀⢉⣹⣿⣶⠰⠶⠈⡏⢹⡁⣀⣎⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⡄⢋⣀⡿⣿⣿⢀⠩⢽⠀⠀⠈⣀⢆⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⡛⣏⠀⢹⡿⢐⡒⠀⠒⠊⡝⠉⠉⣧⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡔⠁⣀⢟⡎⠛⠓⣿⢋⡶⠒⠒⠒⠀⠀⢸⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠎⢀⡛⠖⠸⡅⠀⠀⠘⣗⡫⣄⢄⠐⡒⢲⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠎⢈⠝⠋⠀⢀⡱⠄⠀⠀⠘⣮⠐⢩⣿⣻⣃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢎⡐⠓⢂⡇⠔⠁⠀⠈⠒⠂⠉⠈⠫⣁⠠⠴⠞⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠁⠙⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣤⣤⣤⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢑⣀⣀⣀⣎⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠂⢍⡍⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢡⠀⠈⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣞⠰⣸⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢨⠀⠀⢃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠄⠀⠄⠀⠀⠀⠀⠀⠀⠀⠀⠴⢭⣤⠴⠾⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⠋⡉⠉⠐⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠉⠛⠋⠉⠉   \n" +
                    "\n" +

                    "" +


                    "Tus estadísticas son: ");
            vida = (int) (Math.random() * 31 + 160);
            ataque = (int) (Math.random() * 16 + 10);
            defensa = (int) (Math.random() * 21 + 20);
        } else if (seleccionClase.equalsIgnoreCase("Mago")) {
            System.out.println("Has seleccionado Mago" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣴⣺⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡔⢛⣽⣿⡿⠻⣷⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠄⠀⠀⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠓⢶⣄⡤⠄⠤⠤⡮⣜⣶⣾⣿⡿⠃⠀⠀⠀⠹⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⢰⠀⠀⠀⠀⢠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⢻⣷⣾⣶⣿⣽⣿⣿⠓⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⢀⢬⡧⠇⠀⠦⠀⠀⠀⠀⢀⠀⠀⠀⠆⠀⠀⠀⠀⠀⢀⡴⠁⠀⠀⠀⢀⠘⠀⢀⠀⠀⠀⠀⠀⠀⠨⣺⠿⣽⣿⣿⣿⣿⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⢸⡯⡄⠀⠀⡀⠁⠀⠀⢀⠔⢋⠀⣀⠒⡃⡀⠀⣀⡤⣽⡛⠀⠀⢀⡴⢎⣀⠟⠁⠀⠀⠀⠀⣠⡲⠻⠙⣷⣸⣷⢞⣷⣬⣉⠛⠛⠲⠤⠤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠙⠺⢶⡈⠐⠤⠀⠀⠀⠀⠁⢌⠜⣁⢄⡺⣝⢊⠉⠀⡐⠑⠛⠋⠀⠈⠀⠀⠁⢀⣠⡔⣾⣿⠈⢱⡓⣡⣿⣟⣾⣿⣿⣿⣷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⢫⠓⠀⠀⠀⠄⠣⣶⣿⣽⣚⣩⣤⣬⣉⣠⣬⣄⣠⣤⣤⣶⣿⣿⣯⣽⣆⠘⣦⣹⡃⠠⢀⣿⢟⣾⣿⣾⣿⢯⣾⣿⣷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⢀⠈⠄⡰⢗⠄⠀⠀⡀⠀⠠⠀⠀⠈⠀⠀⢀⠀⠀⠀⠀⠀⠀⠉⠙⠋⣹⣿⣿⣿⡆⣿⣼⣧⠀⡽⠛⣫⣿⣿⣿⣿⣾⣿⣿⣯⢧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠈⠒⠂⠀⠉⠁⠀⠀⠡⠀⠀⠌⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⢿⣷⡥⣏⣿⡼⡼⢣⣳⣿⣿⣿⣿⣛⠷⣴⡿⣿⣿⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠖⠀⠰⠀⢠⠐⠂⠀⠚⠂⠤⠀⠀⠀⠀⠀⠀⢻⣿⣽⣾⣿⡞⣿⡧⣇⣿⣿⣿⣽⣾⣾⣿⣷⢷⣳⣿⣿⣿⣵⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣿⣿⡇⣿⣿⣿⣏⣿⣿⣿⣿⣿⣿⣿⣾⡾⣿⣏⣿⣿⣿⣿⡿⣿⣷⣆⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠄⠀⠘⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⣿⣷⢻⣾⠟⠋⣿⡟⣿⡿⣿⣿⣿⣿⣷⣻⡿⣿⣿⣿⣿⣷⣍⠛⣮⢯⡻⢷⣶⣶⡶⢶⣆⣴⣾⣦⡀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⡿⠁⠀⢸⢱⢷⣸⣿⣿⢿⣿⣻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⣝⡝⠿⣖⣬⣽⣿⣿⣿⣿⣿⣻⣷⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⡞⡜⣿⣾⡼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣷⣸⢽⣿⣿⣏⠉⠙⠺⢿⣿⣷⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⡿⣇⡇⢿⣿⣷⢣⡻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢷⣽⡻⠿⣿⣿⡿⠀⠀⠀⠀⠈⠻⡆\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣟⣿⢻⡜⣸⣿⣿⣾⣷⣌⢿⣿⣿⣯⠻⣿⣻⠟⣿⣿⣿⣿⣽⡏⠉⠳⢿⡁⠀⠀⠀⠀⠀⠀⠈\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣟⣧⣿⣯⢒⣿⡿⣿⣽⣿⣯⢿⣿⣿⣷⣜⢿⣿⣾⣿⣺⠿⣿⠷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⣿⢽⣿⣧⢞⢿⣾⣻⣿⣿⣿⣽⡿⣿⣿⣿⣮⣷⡾⣿⡿⣭⣿⢶⣤⣀⡀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⢼⣿⣿⣿⣟⣧⢻⣿⣻⣿⣿⣿⣿⣧⡟⣿⣿⣿⣿⣧⡟⣣⣿⣿⣘⣿⠿⠃⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣦⡿⣾⣿⣿⣿⣿⣼⣿⣟⣿⣞⡻⢿⣿⣷⣾⣦⣟⣿⣿⡿⠿⠟⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠄⠀⢀⣠⣶⣶⣶⣶⣿⣿⣿⣟⣚⣛⣛⣻⠿⣭⣿⣯⣽⣿⣶⣽⣿⣿⣿⣿⣿⣷⣶⠶⠒⣒⠂⠀⠂⠄⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠒⠒⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠀⠨⠟⠛⠛⠛⠛⠋⠉⠉⠉⠛⠉⠉⠁⠀⠀⠀⠀⠈⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "\n" +

                    "Tus estadísticas son: ");
            vida = (int) (Math.random() * 31 + 110);
            ataque = (int) (Math.random() * 26 + 20);
            defensa = (int) (Math.random() * 11 + 5);
        } else if (seleccionClase.equalsIgnoreCase("Arquero")) {
            System.out.println("Has seleccionado Arquero" +
                    "" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢈⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣤⠎⠠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⢀⣠⣴⣶⡶⠿⠿⠛⠛⠉⠀⠀⠀⢂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠙⠶⢤⣿⡿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⣰⣶⣮⡁⠠⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⣘⡻⢿⣿⣦⣄⡉⠢⢄⡀⠀⠀⠀⠀⠀⠀⠀⢠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⢰⣿⡇⠀⠙⠻⣿⣿⣷⣦⡈⠑⠤⣀⠀⠀⠀⣠⣴⣶⣦⣄⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⢿⣧⠀⠀⠀⠀⠉⠻⣿⣿⣿⣷⣦⣍⠲⢄⣿⣿⣿⣿⣿⡆⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠈⢿⣧⠀⠀⠀⠀⠀⠈⠻⢟⢿⣿⣿⣇⣿⣷⣮⡙⣿⠟⠁⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠻⣧⡀⠀⠀⠀⠀⠀⠀⠘⣿⣿⣿⣿⣿⣿⣿⢰⣶⣭⡳⣄⡀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠹⣧⠀⠀⠀⠀⠀⠀⠀⣬⣿⣿⣿⣿⣿⡟⣼⣿⣿⣿⣶⣿⣵⣶⣄⠀\n" +
                    "⠀⠀⠀⠀⠀⣿⠀⠀⡀⠠⠀⠀⠁⢿⣿⣿⣿⣿⠏⣼⣿⣟⠿⠿⣿⣿⣿⣿⣿⣇\n" +
                    "⠀⠀⠀⠀⡠⠗⠂⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⢸⣿⡿⠋⠀⠀⠀⠈⠉⠉⠉⠉\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣸⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⡏⠻⣿⣷⣟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⡿⣿⣄⠈⠙⠻⢷⣄⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠳⡈⠙⠛⠦⢄⠀⠉⠳⣄⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⠀⠀⠀⠀⠀⠀⠀⠈⢂⠀⠀⠀⠀⠀" +
                    "" +
                    "Tus estadísticas son: ");
            vida = (int) (Math.random() * 31 + 130);
            ataque = (int) (Math.random() * 16 + 20);
            defensa = (int) (Math.random() * 16 + 15);
        }

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
                defensaE = (int) (Math.random() * 6 + 15);
                nombreE = "Goblin";
                System.out.println("" +
                        "\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣤⡄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⠟⠁⠈⠈⠀⢦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⢤⣾⢋⣀⠀⣀⡀⢀⣍⣿⣶⣦⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠐⠛⢋⣿⣯⣻⣿⡿⡢⡿⣿⣿⣳⡿⠛⠉⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⡴⠞⡋⠻⣿⡱⣿⣛⣧⣿⣿⡿⡿⡙⠛⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⣘⣶⠀⠈⠺⣿⣿⣿⡿⣿⣿⣷⣷⣷⡄⢄⣈⣽⣆⡀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠀⣰⣿⣿⣶⣶⣶⣟⣿⣿⣿⠟⢿⣿⠿⡷⢿⣿⣿⣿⣿⣿⣦⡀⠀⠀⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⢀⡴⣕⣿⣿⠏⢻⣿⡿⣛⡿⣫⡯⠿⢾⣿⣿⠟⠀⠀⠙⠛⣿⣿⠛⣂⠀⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⣾⢲⠿⡟⠁⠀⢸⣿⣽⢼⣼⠷⠬⣭⣾⣟⣯⠀⠀⠀⠀⠀⠘⣯⡳⡨⣆⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⢰⢣⢆⡿⠁⠀⠀⢸⣿⡿⣾⡿⠿⣿⣾⣾⡟⣿⡀⠀⠀⠀⠀⠀⠈⠳⡑⡝⡄⠀⠀⠀\n" +
                        "⠀⠀⠀⣇⣃⠞⠀⠀⠀⠀⠀⣿⣾⣞⣯⣿⢜⣲⣿⣿⢳⡇⠀⠀⠀⠀⠀⠀⠀⠈⢷⡼⠄⠀⠀\n" +
                        "⠀⠀⡜⡼⠂⠀⠀⠀⠀⠀⠀⠘⣿⡭⠍⢹⠋⠁⣩⡿⢾⣷⡀⠀⠀⠀⠀⠀⠀⠀⢀⠝⠚⠆⠀\n" +
                        "⠀⣼⡚⢣⠀⠀⠀⠀⠀⠀⢀⣠⣿⣿⣿⠩⢉⠍⠋⣭⣿⣿⣷⡀⠀⠀⠀⠀⠀⣐⡉⡀⡸⢴⠀\n" +
                        "⠀⣧⢧⣢⡿⣱⡆⠀⠀⡠⠋⠈⠻⣿⣿⣷⣿⣥⣾⣿⢿⣟⡿⣷⡀⠀⠀⠀⠷⠖⠉⢹⢃⠹⡀\n" +
                        "⠀⡏⡹⡎⠀⠀⠀⢀⡼⠡⠀⠀⣈⢘⣿⣿⣿⣿⣿⡟⣿⡋⠀⠘⠷⡀⠀⠀⠀⠀⠀⠈⡿⡖⡖\n" +
                        "⢀⢡⣿⠁⠀⠀⠀⣼⠁⣀⢎⡴⠑⠉⠐⡿⣆⣿⣿⣿⡋⠻⣕⠀⠘⡷⠀⠀⠀⠀⠣⠪⣾⢗⠝\n" +
                        "⠸⢜⣝⣤⠋⠀⠘⣭⣷⠥⠎⠀⠀⠀⠀⢯⣽⣿⣿⡗⣇⠀⠈⢢⣄⡛⣷⡀⠀⠀⠚⠛⠒⠂⠀\n" +
                        "⠀⠀⠑⠚⠊⠀⠀⡿⠗⠫⡆⠀⠀⠀⠀⣽⣽⣿⣗⣻⣽⡆⠀⠀⠛⣾⣿⣿⣢⠀⠀⠀⠀⠀⠀");
                break;
            case 1:
                //Bandido
                vidaE = (int) (Math.random() * 21 + 105);
                ataqueE = (int) (Math.random() * 11 + 15);
                defensaE = (int) (Math.random() * 6 + 15);
                nombreE = "Bandido";
                System.out.println("" +
                        "\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢢⠀⠀⠀⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠸⣇⠀⠀⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⣯⢟⡩⠟⠉⠻⢶⣄⠀⠀⠀⠀⢻⢇⠀⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⢏⣤⠤⠂⢀⣄⣽⣽⡀⠀⠀⠘⣮⡆⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣾⡿⢛⣀⠤⣢⣾⣿⣿⣿⡇⠀⠀⠀⠸⣿⡀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣶⣿⣿⡿⣷⣾⣿⠇⠀⠀⠀⣀⣿⡟⣦⣤⡄\n" +
                        "⠀⠀⠀⠀⠀⠀⢀⣠⣶⣿⣿⣿⣿⣷⣍⣿⣿⣿⣷⣿⣿⡄⠀⠀⠀⣿⣿⣟⣩⣿⣷\n" +
                        "⠀⠀⠀⠀⢀⣾⣋⡘⠻⢿⣿⣯⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣄⠀⠀⠀⣿⣿⣽⣾⣿\n" +
                        "⠀⠀⠀⣠⣾⣛⠑⠺⣿⣾⣿⣿⣿⣹⠟⣿⣿⣿⠾⢿⣟⣿⢻⣷⣦⣾⡽⠛⢿⣬⢿\n" +
                        "⠀⣴⣯⡞⣻⣙⣻⣶⣿⣿⣿⣿⣟⣚⠯⠝⠛⢿⣋⣩⣴⣾⣿⣿⣟⣯⢗⠤⠎⠡⢿\n" +
                        "⢼⢿⣏⣯⡿⣿⡙⣿⢹⢉⠖⢉⣉⣡⠴⠗⡟⡏⢩⢹⣯⣹⣿⣿⣿⣿⣿⣷⣶⡶⠞\n" +
                        "⠀⡿⣿⣴⢿⢻⣤⣽⣼⢷⣾⣿⢿⣳⣈⣤⣼⣷⣤⣤⣿⣆⣿⡟⠛⠿⠿⣿⡿⠁⠀\n" +
                        "⠀⠙⠿⠙⠞⠛⠻⠋⠀⠀⢿⣿⣿⣿⣿⣿⣿⣿⡿⡋⣻⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⣿⣿⡴⣿⡯⢷⣿⣿⣿⣷⠄⠀⠀⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣭⣍⡓⠛⢫⣼⣿⡿⣄⠀⠀⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣻⣿⠯⣈⡉⣿⡏⢿⠿⣿⣿⣿⣧⣟⣷⡀⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣾⣤⣴⣽⡷⣺⣶⣎⣯⡽⣿⣿⣿⣿⣦⡀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣟⣿⣿⣿⣻⡌⢵⣿⣯⣹⣿⣿⣿⣿⣿⣿⡿⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠛⣿⣿⣿⣿⣿⣿⡏⠉⢻⠏⠘⠉⣿⣿⣿⣟⣿⣷⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⣿⣿⣿⣿⣿⠛⠁⠀⠀⠀⠀⢸⣿⣿⡿⠟⢉⣿⠇⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⢨⣿⣿⣾⣟⣿⡇⠀⠀⠀⠀⠀⠀⠈⠙⠻⣷⣿⣿⣿⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⢠⡿⢿⣿⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⣿⣿⡏⣳⣄⠀\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠛⠿⠿⠿⠗⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠛⠛⠛⠃");
                break;
            case 2:
                //Slime
                vidaE = (int) (Math.random() * 21 + 100);
                ataqueE = (int) (Math.random() * 11 + 5);
                defensaE = (int) (Math.random() * 6 + 25);
                nombreE = "Slime";
                System.out.println("⠀⠀⠀⢀⠀⠀⡀⠠⠀⠀⠀⢀⠀⠀⡀⠠⠀⠀⠀⢀⠀⠀⡀⠠⠀⠀⠀⢀⠀⠀⡀⠠⠀⠀⠀⢀⠀⠀⡀⠠⠀⠀⠀⢀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⢤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣶⡄⡀⠀⠀⣠⢶⢶⡀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⢀⣤⢤⣄⠀⠀⠀⣯⣋⢈⡷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠊⠡⢷⠂⠀⢧⣊⣠⠇⠀⣠⣤⡀⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⢰⡟⡨⠀⠙⣧⠀⡀⠀⠉⠉⠀⠀⠀⣀⣀⣤⣤⣤⣤⣤⣤⣀⣀⠈⠀⠀⠀⢩⢽⠶⠶⢿⡚⠁⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠈⢷⡀⣀⡾⠃⣯⣹⠆⠀⣀⡴⠖⢛⠉⠅⠀⠀⠀⠀⠀⠀⠈⠍⠙⠳⢶⣤⠼⠿⠤⠤⢿⣇⠀⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⢀⡭⡍⠁⠀⠀⠀⣠⠞⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠁⠨⡑⢦⡀⠀⠈⠛⣧⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⢀⣈⡛⠁⠀⠀⢠⡾⣡⠞⠁⠠⢀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⣄⠀⠀⣼⠀⠀⠀⠀\n" +
                        "⠀⠀⣴⢻⠀⢻⡆⠀⣰⠏⠄⠂⠀⡀⠐⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢊⢳⡜⡟⢠⡞⣳⠀\n" +
                        "⠀⠀⠸⠷⠤⠞⠁⢰⡏⠌⠀⠂⠐⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣶⣶⡄⠀⠀⠀⠀⠀⠀⠀⠀⠡⢻⣧⡤⢿⣅⠀\n" +
                        "⠀⠀⣠⠴⢤⡀⠀⡿⠐⠂⠀⠀⣠⣶⣄⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠘⢡⠳⡁⠺⢹⠀\n" +
                        "⠀⠀⢧⣀⣠⠇⢸⡇⠁⠐⠈⢰⣿⣿⣿⡄⠀⠀⠀⡀⠀⣀⣤⠙⢀⣀⠌⠀⠀⠀⠀⠀⠀⠀⠀⠀⢁⡔⡹⣔⡾⠀\n" +
                        "⠀⠀⠀⠁⣀⡤⣾⠰⠀⠀⠀⠈⠂⠉⠐⢰⡶⠶⠚⠉⠉⠉⢸⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡠⠈⢈⢷⡀\n" +
                        "⠀⠀⠀⢸⡟⠁⡿⠀⠀⠀⠀⠀⠀⠀⠀⠘⣧⠀⠀⠀⠀⠀⣸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⠀⠀⠊⣇\n" +
                        "⠀⠀⠀⠘⣏⡼⡁⠴⠀⠀⠀⠀⠀⠀⠀⠀⠈⠓⠦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⠈⠀⠀⡈⡿\n" +
                        "⠀⠀⣀⡴⠟⠁⠀⠀⢥⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⠠⣐⡼⠃\n" +
                        "⢀⡾⡫⡠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢨⣶⠛⠉⠀⠀\n" +
                        "⠸⣇⡄⠈⠁⠀⢀⡀⠀⠀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⠀⠠⠀⠀⠀⠀⠀⡘⣿⠀⠀⠀⠀\n" +
                        "⠀⠈⠉⠙⠛⣩⡿⠿⣽⣿⣷⠴⣦⡀⠀⢀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡨⠖⠉⠉⢘⢦⡀⠁⠀⢈⣴⠃⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⢼⣉⡀⠄⠉⢋⣻⣧⣮⠳⣆⠈⠊⠀⠀⠀⠀⠀⢀⠀⣠⠾⢯⣖⣀⣐⣤⠟⠙⠓⠚⠋⠁⠀⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⢺⣯⣤⣠⡤⠤⠶⠾⠈⠉⠙⠷⣥⣒⣀⣀⣀⣬⠶⠛⠁⠀⠀⠈⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠈⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                break;
            /*case 3:
                //kraken
                vidaE = (int) (Math.random()*21+50);
                ataqueE = (int) (Math.random()*21+5);
                defensaE = (int) (Math.random()*16+15);
                nombreE = "Slime";*/
        }


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
        int turno = 1, contadorEnrage = 1, enrageAtoDef = 0, vidaDefensa = vida, ataqueEspEnemigo = ataqueE * 3;
        int vidaDefensaE = vidaE;

        int enrage = (int) (vidaE*0.15);
        int curacionE = (int) (vidaE*0.10);

        boolean flagPrimo;

        while (vida > 0 && vidaE > 0) {

            // Verifica si es o no primo el turno
            flagPrimo = true;
            if (turno != 1) {

                for (int j = 2; j < turno; j++) {
                    if (turno % j == 0) {
                        flagPrimo = false;
                    }
                }
            } else flagPrimo = false;

            //Decisión ataque / defensa
            System.out.println("Turno " + turno);
            System.out.println("**************************************************************************************");
            System.out.println("*                                   Qué quieres hacer:                               *");
            System.out.print("*                       - 1. Atacar                     ");
            System.out.println("     - 2. Defender                    *");
            System.out.println("**************************************************************************************");
            eleccion = scl.nextLine();

            //If defensa enemigo

            if ((contadorEnrage== 1) && (vidaE>enrage) && !flagPrimo && turno % 2 == 0) {


                if (eleccion.equalsIgnoreCase(atacar) || (eleccion.equals("1"))) {
                    vidaDefensaE = (vidaE + defensaE);
                    System.out.println("El enemigo se defiende, aumentando su vida a " + vidaDefensaE + " durante este turno");
                    if ((vidaDefensaE - ataque) > vidaE){
                        System.out.println("El enemigo ha bloqueado todo el ataque");
                    }else {
                        System.out.println("Rompes la defensa de tu enemigo, atacándole");
                        vidaE = (vidaDefensaE - ataque);
                    }
                } else if (eleccion.equalsIgnoreCase(defender) || (eleccion.equals("2"))) {
                    vidaDefensa = vida + (defensa);
                    System.out.println("Los dos os defendéis, os quedais mirando a shiro");
                } else {
                    System.out.println("Pierdes el turno");
                }

                // If ataque enemigo
            }else if ((contadorEnrage== 1) && (vidaE>enrage) && flagPrimo) {

                if (eleccion.equalsIgnoreCase(atacar) || (eleccion.equals("1"))) {
                    vida -= ataqueE;
                    vidaE -= ataque ;

                }else if (eleccion.equalsIgnoreCase(defender) || (eleccion.equals("2"))){
                    vidaDefensa = vida + (defensa);
                    System.out.println("Te defiendes, aumentando tu vida a " + vidaDefensa + " durante este turno");
                    if ((vidaDefensa - ataqueE) > vida) {
                        System.out.println("Has bloqueado todo el ataque, tu vida actual no varía");
                    }else {
                        System.out.println("El enemigo te ha atacado");
                        vida = (vidaDefensa - ataqueE);
                    }
                }else{
                    System.out.println("Pierdes el turno");
                    vida -= ataqueE;
                }
                //Ataque especial enemigo
            }else if ((contadorEnrage== 1) && (vidaE>enrage) && !flagPrimo && turno % 2 == 1) {

                if (eleccion.equalsIgnoreCase(atacar) || (eleccion.equals("1"))) {
                    vidaE -= ataque ;
                    System.out.println("El enemigo usa su Habilidad Especial");
                    vida -= ataqueEspEnemigo;
                }else if (eleccion.equalsIgnoreCase(defender) || (eleccion.equals("2"))){
                    vidaDefensa = vida + (defensa);
                    System.out.println("Te defiendes, aumentando tu vida a " + vidaDefensa + " durante este turno");
                    if ((vidaDefensa - ataqueEspEnemigo) > vida) {
                        System.out.println("El enemigo usa su Habilidad Especial, pero has bloqueado todo el ataque");
                    } else {
                        System.out.println("El enemigo usa su Habilidad Especial");
                        vida = (vidaDefensa - ataqueEspEnemigo);
                    }
                }else {
                    System.out.println("Pierdes el turno");
                    vida -= ataqueEspEnemigo;
                }

                //Enrage
            }else if (vidaE < enrage || contadorEnrage >=2){
                System.out.println("El enemigo está en estado de Enrage");
                //sout enrage

                switch (contadorEnrage) {
                    case 1: // 1: Curarse
                        vidaE += curacionE;
                        System.out.println("El enemigo se cura " + curacionE + " puntos de vida");
                        if (eleccion.equalsIgnoreCase(atacar) || (eleccion.equals("1"))) {

                            vidaE -= ataque;
                            System.out.println("Has atacado");

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
                                vida -= ataqueE;
                                System.out.println("El enemigo te ataca");
                            }else if (enrageAtoDef == 1){ //enemigo se defiende
                                vidaDefensaE = (vidaE + defensaE);
                                System.out.println("El enemigo se defiende, aumentando su vida a " + vidaDefensaE + " durante este turno");
                                if ((vidaDefensaE - ataque) > vidaE){
                                    System.out.println("El enemigo ha bloqueado todo el ataque");
                                }else {
                                    System.out.println("Rompes la defensa de tu enemigo, atacándole");
                                    vidaE = (vidaDefensaE - ataque);
                                }
                            }

                        } else if (eleccion.equalsIgnoreCase(defender) || (eleccion.equals("2"))) {
                            vidaDefensa = vida + (defensa);
                            System.out.println("Te defiendes, aumentando tu vida a " + vidaDefensa + " durante este turno");
                            if (enrageAtoDef == 0){ //enemigo ataca

                                if ((vidaDefensa - ataqueE) > vida) {
                                    System.out.println("El enemigo ataca, has bloqueado todo el ataque");

                                } else {
                                    System.out.println("El enemigo te ha atacado");
                                    vida = (vidaDefensa - ataqueE);
                                }
                            }else if (enrageAtoDef == 1){
                                System.out.println("El enemigo se defiende y tu tambien, muy bien cracks");
                            }
                        }
                        break;
                    case 3: // 3: Habilidad Especial Enemigo
                        if (eleccion.equalsIgnoreCase(atacar) || (eleccion.equals("1"))) {
                            vidaE -= ataque ;

                            System.out.println("El enemigo usa su Habilidad Especial");
                            vida -= ataqueEspEnemigo;
                            contadorEnrage = 0;

                        }else if (eleccion.equalsIgnoreCase(defender) || (eleccion.equals("2"))){
                            vidaDefensa = vida + (defensa);
                            System.out.println("Te defiendes, aumentando tu vida a " + vidaDefensa + " durante este turno");
                            if ((vidaDefensa - ataqueEspEnemigo) > vida) {
                                System.out.println("El enemigo usa su HabEsp, has bloqueado todo el ataque");
                                contadorEnrage = 0;
                            } else {
                                System.out.println("El enemigo usa su Habilidad Especial");
                                vida = (vidaDefensa - ataqueEspEnemigo);
                                contadorEnrage = 0;
                            }

                        }
                        System.out.println("El enemigo finaliza su fase de Enrage");
                        break;
                }
                contadorEnrage++;
            }

            System.out.println("**********************************");
            System.out.println(seleccionClase);
            for (int x = 0; x < vida / 2; x++) {
                System.out.print("♡");
            }
            System.out.println(" "+vida);
            System.out.println(nombreE);
            for (int x = 0; x < vidaE / 2; x++) {
                System.out.print("♡");
            }
            System.out.println(" "+vidaE);
            System.out.println("**********************************");



            System.out.println("Termina el turno:");
            turno++;
        }

        if (vidaE <= 0){
            System.out.println("Has ganado!! Has obtenido un palo");
        }else if (vida <= 0){
            System.out.println("Vaya.... has perdido, hasta luego! ");
        }else{
            System.out.println("Los dos palmáis");
        }



        /*
        Apartado 5: Interfaz de usuario (0.5 puntos)
        Apartado 6: Generación de sprites (0.5 puntos)

         */

    }
}
