
import java.util.Random;
import java.util.Scanner;

public class Videojuego2 {
    static Random random = new Random();
    static public int vidamilitar = 200;
    static public int vidamedico = 200;
    static public int vidamutante = 300;
    static public int ataquemilitar = random.nextInt(50);
    static public int ataquemedico = random.nextInt(40);
    static public int ataquemutante = random.nextInt(40);
    static public int ataqueadicionalmilitar = random.nextInt(20);
    static int ataqueadicionalmedico = random.nextInt(15);
    static public int ataquemutanteadicional = random.nextInt(25);
    static public int velocidadmilitar = random.nextInt(100);
    static int velocidadmedico = random.nextInt(70);
    static public int velocidadmutante = random.nextInt(100);
    static public int defensamilitar = random.nextInt(100);
    static public int defensamedico = random.nextInt(100);
    static public int defensamutante = random.nextInt(100);
    static public String healthbarmutante;
   static public  String healthbarmilitar;


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
        System.out.println("Escoge una opcion de personaje, 1 (agilidad=80 fuerza=90 velocidad=100 inteligencia=60) o 2 (agilidad=70 fuerza=70 velocidad=100 inteligencia=100)");
        System.out.println(playerSelection());
    }


    public static String playerSelection() {
        Scanner in = new Scanner(System.in);

        String opcion = in.nextLine();
        if (opcion.equals("1")) {
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

            System.out.println("Te presento a tu enemigo, Monster Mutant" +
                    "         __.,,------.._\n" +
                    "      ,'\"   _      _   \"`.\n" +
                    "     /.__, ._  -=- _\"`    Y\n" +
                    "    (.____.-.`      \"\"`   j\n" +
                    "     VvvvvvV`.Y,.    _.,-'       ,     ,     ,\n" +
                    "        Y    ||,   '\"\\         ,/    ,/    ./\n" +
                    "        |   ,'  ,     `-..,'_,'/___,'/   ,'/   ,\n" +
                    "   ..  ,;,,',-'\"\\,'  ,  .     '     ' \"\"' '--,/    .. ..\n" +
                    " ,'. `.`---'     `, /  , Y -=-    ,'   ,   ,. .`-..||_|| ..\n" +
                    "ff\\\\`. `._        /f ,'j j , ,' ,   , f ,  \\=\\ Y   || ||`||_..\n" +
                    "l` \\` `.`.\"`-..,-' j  /./ /, , / , / /l \\   \\=\\l   || `' || ||...\n" +
                    " `  `   `-._ `-.,-/ ,' /`\"/-/-/-/-\"'''\"`.`.  `'.\\--`'--..`'_`' || ,\n" +
                    "            \"`-_,',  ,'  f    ,   /      `._    ``._     ,  `-.`'//         ,\n" +
                    "          ,-\"'' _.,-'    l_,-'_,,'          \"`-._ . \"`. /|     `.'\\ ,       |\n" +
                    "        ,',.,-'\"          \\=) ,`-.         ,    `-'._`.V |       \\ // .. . /j\n" +
                    "        |f\\\\               `._ )-.\"`.     /|         `.| |        `.`-||-\\\\/\n" +
                    "        l` \\`                 \"`._   \"`--' j          j' j          `-`---'\n" +
                    "         `  `                     \"`,-  ,'/       ,-'\"  /\n" +
                    "                                 ,'\",__,-'       /,, ,-'\n" +
                    "                                 Vvv'            VVv'");


            System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////////" +
                    "///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////" +
                    "//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

            System.out.println("                                                                                                             \n" +
                    " ▄█▀▀▀█▄███▀▀██▀▀███     ██     ▀███▀▀▀██▄ ███▀▀██▀▀███   ▀███▀▀▀███████▀ ▄▄█▀▀▀█▄█▀████▀  ▀████▀▀██▀▀██▀▀███\n" +
                    "▄██    ▀█▀   ██   ▀█    ▄██▄      ██   ▀██▄█▀   ██   ▀█     ██    ▀█ ██ ▄██▀     ▀█  ██      ██  █▀   ██   ▀█\n" +
                    "▀███▄        ██        ▄█▀██▄     ██   ▄██      ██          ██   █   ██ ██▀       ▀  ██      ██       ██     \n" +
                    "  ▀█████▄    ██       ▄█  ▀██     ███████       ██          ██▀▀██   ██ ██           ██████████       ██     \n" +
                    "▄     ▀██    ██       ████████    ██  ██▄       ██          ██   █   ██ ██▄    ▀████ ██      ██       ██     \n" +
                    "██     ██    ██      █▀      ██   ██   ▀██▄     ██          ██       ██ ▀██▄     ██  ██      ██       ██     \n" +
                    "█▀█████▀   ▄████▄  ▄███▄   ▄████▄████▄ ▄███▄  ▄████▄      ▄████▄   ▄████▄ ▀▀███████▄████▄  ▄████▄▄  ▄████▄   \n" +
                    "                                                                                                             \n" +
                    "                                                                                                             \n");


        } else if (opcion.equals("2")) {

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


            System.out.println("Te presento a tu enemigo, Monster Mutant" +

                    "         __.,,------.._\n" +
                    "      ,'\"   _      _   \"`.\n" +
                    /////////////////////////////////////////////////////////////// "     /.__, ._  -=- _\"`    Y\n" +
                    /////////////////////////////////////////////////////////////// "    (.____.-.`      \"\"`   j\n" +
                    "     VvvvvvV`.Y,.    _.,-'       ,     ,     ,\n" +
                    "        Y    ||,   '\"\\         ,/    ,/    ./\n" +
                    "        |   ,'  ,     `-..,'_,'/___,'/   ,'/   ,\n" +
                    "   ..  ,;,,',-'\"\\,'  ,  .     '     ' \"\"' '--,/    .. ..\n" +
                    " ,'. `.`---'     `, /  , Y -=-    ,'   ,   ,. .`-..||_|| ..\n" +
                    "ff\\\\`. `._        /f ,'j j , ,' ,   , f ,  \\=\\ Y   || ||`||_..\n" +
                    "l` \\` `.`.\"`-..,-' j  /./ /, , / , / /l \\   \\=\\l   || `' || ||...\n" +
                    " `  `   `-._ `-.,-/ ,' /`\"/-/-/-/-\"'''\"`.`.  `'.\\--`'--..`'_`' || ,\n" +
                    "            \"`-_,',  ,'  f    ,   /      `._    ``._     ,  `-.`'//         ,\n" +
                    "          ,-\"'' _.,-'    l_,-'_,,'          \"`-._ . \"`. /|     `.'\\ ,       |\n" +
                    "        ,',.,-'\"          \\=) ,`-.         ,    `-'._`.V |       \\ // .. . /j\n" +
                    "        |f\\\\               `._ )-.\"`.     /|         `.| |        `.`-||-\\\\/\n" +
                    "        l` \\`                 \"`._   \"`--' j          j' j          `-`---'\n" +
                    "         `  `                     \"`,-  ,'/       ,-'\"  /\n" +
                    "                                 ,'\",__,-'       /,, ,-'\n" +
                    "                                 Vvv'            VVv'");


            System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////////" +
                    "///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////" +
                    "//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");


            System.out.println("                                                                                                             \n" +
                    " ▄█▀▀▀█▄███▀▀██▀▀███     ██     ▀███▀▀▀██▄ ███▀▀██▀▀███   ▀███▀▀▀███████▀ ▄▄█▀▀▀█▄█▀████▀  ▀████▀▀██▀▀██▀▀███\n" +
                    "▄██    ▀█▀   ██   ▀█    ▄██▄      ██   ▀██▄█▀   ██   ▀█     ██    ▀█ ██ ▄██▀     ▀█  ██      ██  █▀   ██   ▀█\n" +
                    "▀███▄        ██        ▄█▀██▄     ██   ▄██      ██          ██   █   ██ ██▀       ▀  ██      ██       ██     \n" +
                    "  ▀█████▄    ██       ▄█  ▀██     ███████       ██          ██▀▀██   ██ ██           ██████████       ██     \n" +
                    "▄     ▀██    ██       ████████    ██  ██▄       ██          ██   █   ██ ██▄    ▀████ ██      ██       ██     \n" +
                    "██     ██    ██      █▀      ██   ██   ▀██▄     ██          ██       ██ ▀██▄     ██  ██      ██       ██     \n" +
                    "█▀█████▀   ▄████▄  ▄███▄   ▄████▄████▄ ▄███▄  ▄████▄      ▄████▄   ▄████▄ ▀▀███████▄████▄  ▄████▄▄  ▄████▄   \n" +
                    "                                                                                                             \n" +
                    "                                                                                                             \n");


        }


        return opcion;
    }

    public static String startFigt(){
        Scanner in=new Scanner(System.in);
        String opcion=in.nextLine();
        if (opcion.equals("1")){
            System.out.println("Vida de Mike " + vidamilitar);
            System.out.println("Vida mutante " + vidamutante);
            System.out.println("///////////////////////////////////////////////////////////////");
            if (velocidadmilitar > velocidadmutante) {
                System.out.println("Turno de Mike");
                System.out.println("Daño de ataque:");
                System.out.println(ataquemilitar);
                if (defensamutante > 33) {
                    System.out.println("Defensa  del mutante nula");
                    System.out.println(" Vida restante del mutante:");
                    System.out.println(Math.max(vidamutante -= ataquemilitar, 0));
                    healthbarmutante ="-".repeat(Math.max(0,vidamutante));
                    System.out.println("Barra de vida del mutante:" + healthbarmutante);
                    System.out.println("Daño adicional inflingido:");
                    System.out.println(ataqueadicionalmilitar);
                    System.out.println(" Vida restante del mutante:");
                    System.out.println(Math.max(vidamutante -= ataqueadicionalmilitar, 0));
                    healthbarmutante ="-".repeat(Math.max(0,vidamutante));
                    System.out.println("Barra de vida del mutante: " + healthbarmutante);
                    System.out.println("///////////////////////////////////////////////////////////////");
        } } else if (defensamutante <= 33) {
                System.out.println("Defensa  del mutante ejecutada");
                System.out.println(" Vida restante del mutante:");
                System.out.println(Math.max(0,vidamutante));
                healthbarmutante ="-".repeat(Math.max(0,vidamutante));
                System.out.println("Barra de vida del mutante: " + healthbarmutante);
                System.out.println("Daño adicional inflingido:");
                System.out.println(ataqueadicionalmilitar );
                System.out.println(" Vida restante del mutante:");
                System.out.println(Math.max(vidamutante -= ataqueadicionalmilitar, 0));
                healthbarmutante ="-".repeat(Math.max(0,vidamutante));
                System.out.println("Barra de vida del mutante: " + healthbarmutante);
                System.out.println("///////////////////////////////////////////////////////////////");
            }


        } else if (velocidadmutante > velocidadmilitar) {



            System.out.println("Turno del Mutante");
            if (defensamilitar > 33) {
                System.out.println("Daño de ataque:");
                System.out.println(ataquemutante);
                System.out.println("Defensa del militar nula ");
                System.out.println(" Vida restante del militar:");
                System.out.println(Math.max(vidamilitar -= ataquemutante, 0));
                healthbarmilitar ="-".repeat(Math.max(0,vidamilitar));
                System.out.println("Barra de vida del militar: " + healthbarmilitar);
                System.out.println("Daño adicional inflingido:");
                System.out.println(ataquemutanteadicional);
                System.out.println(" Vida restante del militar:");
                System.out.println(Math.max(vidamilitar-=ataquemutanteadicional, 0));
                healthbarmilitar ="-".repeat(Math.max(0,vidamilitar));
                System.out.println("Barra de vida del militar: " + healthbarmilitar);
                System.out.println("///////////////////////////////////////////////////////////////");
            } else if (defensamilitar <= 33) {
                System.out.println("Daño de ataque:");
                System.out.println(ataquemutante);
                System.out.println("Defensa del militar ejecutada ");
                System.out.println(" Vida restante del militar:");
                System.out.println(Math.max(vidamilitar, 0));
                healthbarmilitar ="-".repeat(Math.max(0,vidamilitar));
                System.out.println("Barra de vida del militar: " + healthbarmilitar);
                System.out.println("Daño adicional inflingido:");
                System.out.println(ataquemutanteadicional);
                System.out.println(" Vida restante del militar:");
                System.out.println(Math.max(vidamilitar-=ataquemutanteadicional, 0));
                healthbarmilitar ="-".repeat(Math.max(0,vidamilitar));
                System.out.println("Barra de vida del militar: " + healthbarmilitar);
                System.out.println("///////////////////////////////////////////////////////////////");
            }







        }


}