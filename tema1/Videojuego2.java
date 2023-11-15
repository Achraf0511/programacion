

import java.util.Random;
import java.util.Scanner;

public class Videojuego2 {
    static Random random = new Random();
    static public int vidamilitar = 0;
    static public int vidamedico = 0;
    static public int vidamutante = 0;
    static public int ataquemilitar = 0;
    static public int ataquemedico = 0;
    static public int ataquemutante = 0;
    static public int ataqueadicionalmilitar = 0;
    static int ataqueadicionalmedico = 0;
    static public int ataquemutanteadicional = 0;
    static public int velocidadmilitar = 0;
    static int velocidadmedico = 0;
    static public int velocidadmutante = 0;
    static public int defensamilitar = 0;
    static public int defensamedico = 0;
    static public int defensamutante = 0;
    static public String healthbarmutante;
    static public String healthbarmilitar;

    static public String healthbarmedico;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Desde hace siglos humanos y mutantes conviven en esta tierra llevando a cabo una política de apacigüamiento y respeto mútuo entre las dos especies.");
        System.out.println("Tras la ciada del poder mundial en manos de unos ingenúos ,en la llamada Guerra de Sangre, los humanos nos vimos obligados a escondernos y vivir en la oscuridad ya que los mutantes subieron a la superfície para adueñarse de ella y no pudimos defendernos. ");
        System.out.println("La población mundial se vio reducida en un 75% y solo quedamos algunos supervivientes capaces de rehacer el orden mundial.");
        System.out.println("Pero debido a la escasez de alimentos y suministros la tarea no será fácil.");
        System.out.println("Disculpa no haberme presentado, me llamo Sully y bienvenido al grupo; siempre es un placer encontrar nuevos supervivientes.");
        System.out.println("Te doy la bienvenida a:");
        System.out.println("• ▌ ▄ ·. ▄• ▄▌▄▄▄▄▄ ▄▄▄·  ▐ ▄ ▄▄▄▄▄\n" +
                "·██ ▐███▪█▪██▌•██  ▐█ ▀█ •█▌▐█•██  \n" +
                "▐█ ▌▐▌▐█·█▌▐█▌ ▐█.▪▄█▀▀█ ▐█▐▐▌ ▐█.▪\n" +
                "██ ██▌▐█▌▐█▄█▌ ▐█▌·▐█▪ ▐▌██▐█▌ ▐█▌·\n" +
                "▀▀  █▪▀▀▀ ▀▀▀  ▀▀▀  ▀  ▀ ▀▀ █▪ ▀▀▀ \n");
        System.out.println("Escoge una opcion de personaje, 1 (agilidad=80 fuerza=90 velocidad=100 inteligencia=60) o 2 (agilidad=70 fuerza=70 velocidad=100 inteligencia=100) :");
        String opcion = in.nextLine();
        switch (opcion) {
            case "1":
                playerSlection1();
                startFight1();
                vidamilitar = 200;
                ataquemilitar = random.nextInt(50);
                ataqueadicionalmilitar = random.nextInt(20);
                defensamilitar = random.nextInt(30);
                velocidadmilitar = random.nextInt(200);
                vidamutante = 300;
                ataquemutante = 30;
                ataquemutanteadicional = random.nextInt(40);
                defensamutante = random.nextInt(30);
                velocidadmutante = random.nextInt(200);


            case "2":
                playerSelection2();
                vidamedico = 200;
                ataquemedico = random.nextInt(40);
                ataqueadicionalmedico = random.nextInt(20);
                defensamedico = random.nextInt(20);
                velocidadmedico = random.nextInt(200);
                vidamutante = 300;
                ataquemutante = 30;
                ataquemutanteadicional = random.nextInt(40);
                defensamutante = random.nextInt(30);
                velocidadmutante = random.nextInt(200);


        }


    }

    public static void playerSlection1() {

        System.out.println("Escogiste a Mike, exmilitar retirado fuerte y seguro de si mismo, un veterano en la guerra: agilidad=80 fuerza=90 velocidad=100 inteligencia=60" +
                "    \n" +
                "       |      |\n" +
                "      (| _  _ |)\n" +
                "       |` |  '|\n" +
                "       |  __  |\n" +
                " >>>___/\\_^__/\\___<<<\n" +
                "/               |||  \\");
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////////" +
                "///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////" +
                "//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

        System.out.println("Te presento a tu enemigo, Monster Mutant");


    }

    public static void playerSelection2() {
        System.out.println("Escogiste a Logan, exingeniero armamentístico un chico listo capaz de crear cualquier cosa: agilidad=70 fuerza=70 velocidad=100 inteligencia=100" +
                "    [___________]\n" +
                "                               {=========}\n" +
                "                             .-'         '-.\n" +
                "                            /               \\\n" +
                "                           /_________________\\\n" +
                "                           | _  _  _ __    _ |\n" +
                "                           ||_)|_)/ \\ /|\\ /  |\n" +
                "      ,.----.   ,.----.    ||  | \\\\_//_|~\\\\_ |\n" +
                "     //  \\   \\ //  \\   \\   |_________________|\n" +
                "jgs  \\\\   \\  / \\\\   \\  /   |                 |\n" +
                "      `'----'   `'----'    '-----------------'");
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////////" +
                "///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////" +
                "//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");


        System.out.println("Te presento a tu enemigo, Monster Mutant");


    }

    public static int startFight1() {


        while (vidamilitar > 0 && vidamutante > 0) {
            System.out.println("Vida de Mike " + vidamilitar);
            System.out.println("Vida mutante " + vidamutante);
            System.out.println("///////////////////////////////////////////////////////////////");
            while (vidamilitar > 0 & vidamutante > 0) {
                if (velocidadmilitar > velocidadmutante) {
                    System.out.println(dañomilitar());
                } else if (velocidadmutante > velocidadmilitar) {
                    System.out.println(dañomutante());


                }


            }

        }
        return 0;
    }

    public static int dañomilitar() {
        System.out.println("Turno de Mike");
        System.out.println("Daño de ataque:");
        System.out.println(ataquemilitar);
        if (defensamutante > 33) {
            System.out.println("Defensa  del mutante nula");
            System.out.println(" Vida restante del mutante:");
            System.out.println(Math.max(vidamutante -= ataquemilitar, 0));
            healthbarmutante = "-".repeat(Math.max(0, vidamutante));
            System.out.println("Barra de vida del mutante:" + healthbarmutante);
            System.out.println("Daño adicional inflingido:");
            System.out.println(ataqueadicionalmilitar);
            System.out.println(" Vida restante del mutante:");
            System.out.println(Math.max(vidamutante -= ataqueadicionalmilitar, 0));
            healthbarmutante = "-".repeat(Math.max(0, vidamutante));
            System.out.println("Barra de vida del mutante: " + healthbarmutante);
            System.out.println("///////////////////////////////////////////////////////////////");
        } else if (defensamutante <= 33) {
            System.out.println("Defensa  del mutante ejecutada");
            System.out.println(" Vida restante del mutante:");
            System.out.println(Math.max(0, vidamutante));
            healthbarmutante = "-".repeat(Math.max(0, vidamutante));
            System.out.println("Barra de vida del mutante: " + healthbarmutante);
            System.out.println("Daño adicional inflingido:");
            System.out.println(ataqueadicionalmilitar);
            System.out.println(" Vida restante del mutante:");
            System.out.println(Math.max(vidamutante -= ataqueadicionalmilitar, 0));
            healthbarmutante = "-".repeat(Math.max(0, vidamutante));
            System.out.println("Barra de vida del mutante: " + healthbarmutante);
            System.out.println("///////////////////////////////////////////////////////////////");


        }

        return 0;
    }

    public static int dañomutante() {

        System.out.println("Turno del Mutante");
        if (defensamilitar > 33) {
            System.out.println("Daño de ataque:");
            System.out.println(ataquemutante);
            System.out.println("Defensa del militar nula ");
            System.out.println(" Vida restante del militar:");
            System.out.println(Math.max(vidamilitar -= ataquemutante, 0));
            healthbarmilitar = "-".repeat(Math.max(0, vidamilitar));
            System.out.println("Barra de vida del militar: " + healthbarmilitar);
            System.out.println("Daño adicional inflingido:");
            System.out.println(ataquemutanteadicional);
            System.out.println(" Vida restante del militar:");
            System.out.println(Math.max(vidamilitar -= ataquemutanteadicional, 0));
            healthbarmilitar = "-".repeat(Math.max(0, vidamilitar));
            System.out.println("Barra de vida del militar: " + healthbarmilitar);
            System.out.println("///////////////////////////////////////////////////////////////");
        } else if (defensamilitar <= 33) {
            System.out.println("Daño de ataque:");
            System.out.println(ataquemutante);
            System.out.println("Defensa del militar ejecutada ");
            System.out.println(" Vida restante del militar:");
            System.out.println(Math.max(vidamilitar, 0));
            healthbarmilitar = "-".repeat(Math.max(0, vidamilitar));
            System.out.println("Barra de vida del militar: " + healthbarmilitar);
            System.out.println("Daño adicional inflingido:");
            System.out.println(ataquemutanteadicional);
            System.out.println(" Vida restante del militar:");
            System.out.println(Math.max(vidamilitar -= ataquemutanteadicional, 0));
            healthbarmilitar = "-".repeat(Math.max(0, vidamilitar));
            System.out.println("Barra de vida del militar: " + healthbarmilitar);
            System.out.println("///////////////////////////////////////////////////////////////");
        }


        return 0;
    }
    public static int endgame(){
        if (vidamutante <= 0) {
            System.out.println("                                                                                                                      \n" +
                    "▀████▄     ▄███▀████▀████▀ ▀███▀▀███▀▀▀███    ▀████▀     █     ▀███▀████▀███▄   ▀███▀███▄   ▀███▀███▀▀▀███▀███▀▀▀██▄  \n" +
                    "  ████    ████   ██   ██   ▄█▀    ██    ▀█      ▀██     ▄██     ▄█   ██   ███▄    █   ███▄    █   ██    ▀█  ██   ▀██▄ \n" +
                    "  █ ██   ▄█ ██   ██   ██ ▄█▀      ██   █         ██▄   ▄███▄   ▄█    ██   █ ███   █   █ ███   █   ██   █    ██   ▄██  \n" +
                    "  █  ██  █▀ ██   ██   █████▄      ██████          ██▄  █▀ ██▄  █▀    ██   █  ▀██▄ █   █  ▀██▄ █   ██████    ███████   \n" +
                    "  █  ██▄█▀  ██   ██   ██  ███     ██   █  ▄       ▀██ █▀  ▀██ █▀     ██   █   ▀██▄█   █   ▀██▄█   ██   █  ▄ ██  ██▄   \n" +
                    "  █  ▀██▀   ██   ██   ██   ▀██▄   ██     ▄█        ▄██▄    ▄██▄      ██   █     ███   █     ███   ██     ▄█ ██   ▀██▄ \n" +
                    "▄███▄ ▀▀  ▄████▄████▄████▄   ███▄██████████         ██      ██     ▄████▄███▄    ██ ▄███▄    ██ ▄██████████████▄ ▄███▄\n" +
                    "                                                                                                                      \n" +
                    "                                                                                                                      \n");

            System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////////" +
                    "///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////" +
                    "//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");


        }
}
