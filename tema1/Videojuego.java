
import java.util.Random;
import java.util.Scanner;

public class Videojuego {


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


        }
        Random random = new Random();


        if (opcion.equals("1")) {
            String healthbarmutante;
            String healthbarmilitar;
            int vidamilitar = 200;
            int vidamutante = 300;

            while (vidamilitar > 0 && vidamutante > 0) {

                int ataquemilitar = random.nextInt(50);
                int ataqueadicional = random.nextInt(20);
                int velocidadmilitar = random.nextInt(100);
                int velocidadmutante = random.nextInt(100);
                int defensamutante = random.nextInt(100);
                int defensamilitar = random.nextInt(100);
                int ataquemutante = random.nextInt(40);
                int ataquemutanteadicional = random.nextInt(25);
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
                        System.out.println(ataqueadicional);
                        System.out.println(" Vida restante del mutante:");
                        System.out.println(Math.max(vidamutante -= ataqueadicional, 0));
                        healthbarmutante ="-".repeat(Math.max(0,vidamutante));
                        System.out.println("Barra de vida del mutante: " + healthbarmutante);
                System.out.println("///////////////////////////////////////////////////////////////");
                    } else if (defensamutante <= 33) {
                        System.out.println("Defensa  del mutante ejecutada");
                        System.out.println(" Vida restante del mutante:");
                        System.out.println(Math.max(0,vidamutante));
                        healthbarmutante ="-".repeat(Math.max(0,vidamutante));
                        System.out.println("Barra de vida del mutante: " + healthbarmutante);
                        System.out.println("Daño adicional inflingido:");
                        System.out.println(ataqueadicional);
                        System.out.println(" Vida restante del mutante:");
                        System.out.println(Math.max(vidamutante -= ataqueadicional, 0));
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

                    System.out.println("     .---'::'        `---.\n" +
                            "                            (::::::'              )\n" +
                            "                            |`-----._______.-----'|\n" +
                            "                            |              :::::::|\n" +
                            "                           .|               ::::::!-.\n" +
                            "                           \\|               :::::/|/\n" +
                            "                            |               ::::::|\n" +
                            "                            | Special Flonk Award:|\n" +
                            "                            |    for SOLDIER  ::::|\n" +
                            "                            |               ::::::|\n" +
                            "                            |              .::::::|\n" +
                            "                            J              :::::::F\n" +
                            "                             \\            :::::::/\n" +
                            "                              `.        .:::::::'\n" +
                            "                                `-._  .::::::-'\n" +
                            "____________________________________|  \"\"\"|\"_________________________________________\n" +
                            "                                    |  :::|\n" +
                            "                                    F   ::J\n" +
                            "                                   /     ::\\                                        \n" +
                            "                              __.-'      :::`-.__\n" +
                            "                             (_           ::::::_)");
                    break;

                } else if (vidamilitar <= 0) {
                    System.out.println("                                                                                                                                                          \n" +
                            "▀████▄     ▄███▀███▀   ▀███▀██▀▀██▀▀███     ██     ▀███▄   ▀███▀██▀▀██▀▀███   ▀████▀     █     ▀███▀████▀███▄   ▀███▀███▄   ▀███▀███▀▀▀███▀███▀▀▀██▄      \n" +
                            "  ████    ████  ██       █ █▀   ██   ▀█    ▄██▄      ███▄    █ █▀   ██   ▀█     ▀██     ▄██     ▄█   ██   ███▄    █   ███▄    █   ██    ▀█  ██   ▀██▄     \n" +
                            "  █ ██   ▄█ ██  ██       █      ██        ▄█▀██▄     █ ███   █      ██           ██▄   ▄███▄   ▄█    ██   █ ███   █   █ ███   █   ██   █    ██   ▄██      \n" +
                            "  █  ██  █▀ ██  ██       █      ██       ▄█  ▀██     █  ▀██▄ █      ██            ██▄  █▀ ██▄  █▀    ██   █  ▀██▄ █   █  ▀██▄ █   ██████    ███████       \n" +
                            "  █  ██▄█▀  ██  ██       █      ██       ████████    █   ▀██▄█      ██            ▀██ █▀  ▀██ █▀     ██   █   ▀██▄█   █   ▀██▄█   ██   █  ▄ ██  ██▄       \n" +
                            "  █  ▀██▀   ██  ██▄     ▄█      ██      █▀      ██   █     ███      ██             ▄██▄    ▄██▄      ██   █     ███   █     ███   ██     ▄█ ██   ▀██▄     \n" +
                            "▄███▄ ▀▀  ▄████▄ ▀██████▀▀    ▄████▄  ▄███▄   ▄████▄███▄    ██    ▄████▄            ██      ██     ▄████▄███▄    ██ ▄███▄    ██ ▄██████████████▄ ▄███▄    \n" +
                            "                                                                                                                                                          \n" +
                            "                                                                                                                                                          \n");


                    System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////////" +
                            "///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////" +
                            "//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");



                    System.out.println("     .---'::'        `---.\n" +
                            "                            (::::::'              )\n" +
                            "                            |`-----._______.-----'|\n" +
                            "                            |              :::::::|\n" +
                            "                           .|               ::::::!-.\n" +
                            "                           \\|               :::::/|/\n" +
                            "                            |               ::::::|\n" +
                            "                            | Special Flonk Award:|\n" +
                            "                            |    for MUTANT   ::::|\n" +
                            "                            |               ::::::|\n" +
                            "                            |              .::::::|\n" +
                            "                            J              :::::::F\n" +
                            "                             \\            :::::::/\n" +
                            "                              `.        .:::::::'\n" +
                            "                                `-._  .::::::-'\n" +
                            "____________________________________|  \"\"\"|\"_________________________________________\n" +
                            "                                    |  :::|\n" +
                            "                                    F   ::J\n" +
                            "                                   /     ::\\                                        \n" +
                            "                              __.-'      :::`-.__\n" +
                            "                             (_           ::::::_)");

                    break;

                }
            }


        }
        if (opcion.equals("2")) {
            int vidaingeniero = 200;
            int vidamutante = 300;
            String healthbaringeniero;
            String healthbarmutante;
            while (vidaingeniero > 0 && vidamutante > 0) {
                int ataqueingeniero = random.nextInt(40);
                int ataqueadicional = random.nextInt(15);
                int velocidadingeniero = random.nextInt(70);
                int velocidadmutante = random.nextInt(100);
                int defensamutante = random.nextInt(100);
                int defensaingeniero = random.nextInt(100);
                System.out.println("Vida de Logan " + vidaingeniero);
                System.out.println("Vida mutante " + vidamutante);
                System.out.println("///////////////////////////////////////////////////////////////");
                if (velocidadingeniero > velocidadmutante) {
                    System.out.println("Turno de Logan");
                    System.out.println("Daño de ataque:");
                    System.out.println(ataqueingeniero);
                    if (defensamutante > 33) {
                        System.out.println("Defensa  del mutante nula");
                        System.out.println(" Vida restante del mutante:");
                        System.out.println(Math.max(vidamutante -= ataqueingeniero, 0));
                        healthbarmutante ="-".repeat(Math.max(0,vidamutante));
                        System.out.println("Barra de vida del mutante" + healthbarmutante);
                        System.out.println("Daño adicional inflingido:");
                        System.out.println(ataqueadicional);
                        System.out.println(" Vida restante del mutante:");
                        healthbarmutante ="-".repeat(Math.max(0,vidamutante));
                        System.out.println(Math.max(vidamutante -= ataqueadicional, 0));
                        System.out.println("Barra de vida del mutante" + healthbarmutante);
                        System.out.println("///////////////////////////////////////////////////////////////");
                    } else if (defensamutante <= 33) {
                        System.out.println("Defensa  del mutante ejecutada");
                        System.out.println(" Vida restante del mutante:");
                        System.out.println(Math.max(vidamutante, 0));
                        healthbarmutante ="-".repeat(Math.max(0,vidamutante));
                        System.out.println("Barra de vida del mutante" + healthbarmutante);
                        System.out.println("Daño adicional inflingido:");
                        System.out.println(ataqueadicional);
                        System.out.println(" Vida restante del mutante:");
                        System.out.println(Math.max(vidamutante -= ataqueadicional, 0));
                        healthbarmutante ="-".repeat(Math.max(0,vidamutante));
                        System.out.println("Barra de vida del mutante" + healthbarmutante);
                        System.out.println("///////////////////////////////////////////////////////////////");
                    }


                } else if (velocidadmutante > velocidadingeniero) {


                    int ataquemutante = random.nextInt(40);
                    int ataquemutanteadicional = random.nextInt(25);


                    System.out.println("Turno del Mutante");
                    if (defensaingeniero > 33) {
                        System.out.println("Daño de ataque:");
                        System.out.println(ataquemutante);
                        System.out.println("Defensa de Logan nula ");
                        System.out.println(" Vida restante de Logan:");
                        System.out.println(Math.max(vidaingeniero -= ataquemutante, 0));
                        healthbaringeniero ="-".repeat(Math.max(0,vidaingeniero));
                        System.out.println("Barra de vida Logan: " + healthbaringeniero);
                        System.out.println("Daño adicional inflingido:");
                        System.out.println(ataquemutanteadicional);
                        System.out.println(" Vida restante de Logan:");
                        System.out.println(Math.max(ataquemutanteadicional -= vidaingeniero, 0));
                        healthbaringeniero ="-".repeat(Math.max(0,vidaingeniero));
                        System.out.println("Barra de vida de Logan: " + healthbaringeniero);
                        System.out.println("///////////////////////////////////////////////////////////////");
                    } else if (defensaingeniero <= 33) {
                        System.out.println("Daño de ataque:");
                        System.out.println(ataquemutante);
                        System.out.println("Defensa de Logan ejecutada ");
                        System.out.println(" Vida restante de Logan:");
                        System.out.println(Math.max(vidaingeniero, 0));
                        healthbaringeniero ="-".repeat(Math.max(0,vidaingeniero));
                        System.out.println("Barra de vida de Logan: " + healthbaringeniero);
                        System.out.println("Daño adicional inflingido:");
                        System.out.println(ataquemutanteadicional);
                        System.out.println(" Vida restante de logan:");
                        System.out.println(Math.max(ataquemutanteadicional -= vidaingeniero, 0));
                        healthbaringeniero ="-".repeat(Math.max(0,vidaingeniero));
                        System.out.println("Barra de vida de Logan: " + healthbaringeniero);
                        System.out.println("///////////////////////////////////////////////////////////////");
                    }
                }

                if (vidamutante <= 0) {
                    System.out.println("                                                                                                                                    \n" +
                            "▀████▀     ▄▄█▀▀██▄   ▄▄█▀▀▀█▄█      ██     ▀███▄   ▀███▀   ▀████▀     █     ▀███▀████▀███▄   ▀███▀███▄   ▀███▀███▀▀▀███▀███▀▀▀██▄  \n" +
                            "  ██     ▄██▀    ▀██▄██▀     ▀█     ▄██▄      ███▄    █       ▀██     ▄██     ▄█   ██   ███▄    █   ███▄    █   ██    ▀█  ██   ▀██▄ \n" +
                            "  ██     ██▀      ▀███▀       ▀    ▄█▀██▄     █ ███   █        ██▄   ▄███▄   ▄█    ██   █ ███   █   █ ███   █   ██   █    ██   ▄██  \n" +
                            "  ██     ██        ███            ▄█  ▀██     █  ▀██▄ █         ██▄  █▀ ██▄  █▀    ██   █  ▀██▄ █   █  ▀██▄ █   ██████    ███████   \n" +
                            "  ██     ▄█▄      ▄███▄    ▀████  ████████    █   ▀██▄█         ▀██ █▀  ▀██ █▀     ██   █   ▀██▄█   █   ▀██▄█   ██   █  ▄ ██  ██▄   \n" +
                            "  ██    ▄███▄    ▄██▀██▄     ██  █▀      ██   █     ███          ▄██▄    ▄██▄      ██   █     ███   █     ███   ██     ▄█ ██   ▀██▄ \n" +
                            "██████████ ▀▀████▀▀   ▀▀███████▄███▄   ▄████▄███▄    ██           ██      ██     ▄████▄███▄    ██ ▄███▄    ██ ▄██████████████▄ ▄███▄\n" +
                            "                                                                                                                                    \n" +
                            "                                                                                                                                    \n");

                    System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////////" +
                            "///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////" +
                            "//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

                    System.out.println("     .---'::'        `---.\n" +
                            "                            (::::::'              )\n" +
                            "                            |`-----._______.-----'|\n" +
                            "                            |              :::::::|\n" +
                            "                           .|               ::::::!-.\n" +
                            "                           \\|               :::::/|/\n" +
                            "                            |               ::::::|\n" +
                            "                            | Special Flonk Award:|\n" +
                            "                            |    for Scientist   ::::|\n" +
                            "                            |               ::::::|\n" +
                            "                            |              .::::::|\n" +
                            "                            J              :::::::F\n" +
                            "                             \\            :::::::/\n" +
                            "                              `.        .:::::::'\n" +
                            "                                `-._  .::::::-'\n" +
                            "____________________________________|  \"\"\"|\"_________________________________________\n" +
                            "                                    |  :::|\n" +
                            "                                    F   ::J\n" +
                            "                                   /     ::\\                                        \n" +
                            "                              __.-'      :::`-.__\n" +
                            "                             (_           ::::::_)");
                    break;

                } else if (vidaingeniero <= 0) {
                    System.out.println("                                                                                                                                                          \n" +
                            "▀████▄     ▄███▀███▀   ▀███▀██▀▀██▀▀███     ██     ▀███▄   ▀███▀██▀▀██▀▀███   ▀████▀     █     ▀███▀████▀███▄   ▀███▀███▄   ▀███▀███▀▀▀███▀███▀▀▀██▄      \n" +
                            "  ████    ████  ██       █ █▀   ██   ▀█    ▄██▄      ███▄    █ █▀   ██   ▀█     ▀██     ▄██     ▄█   ██   ███▄    █   ███▄    █   ██    ▀█  ██   ▀██▄     \n" +
                            "  █ ██   ▄█ ██  ██       █      ██        ▄█▀██▄     █ ███   █      ██           ██▄   ▄███▄   ▄█    ██   █ ███   █   █ ███   █   ██   █    ██   ▄██      \n" +
                            "  █  ██  █▀ ██  ██       █      ██       ▄█  ▀██     █  ▀██▄ █      ██            ██▄  █▀ ██▄  █▀    ██   █  ▀██▄ █   █  ▀██▄ █   ██████    ███████       \n" +
                            "  █  ██▄█▀  ██  ██       █      ██       ████████    █   ▀██▄█      ██            ▀██ █▀  ▀██ █▀     ██   █   ▀██▄█   █   ▀██▄█   ██   █  ▄ ██  ██▄       \n" +
                            "  █  ▀██▀   ██  ██▄     ▄█      ██      █▀      ██   █     ███      ██             ▄██▄    ▄██▄      ██   █     ███   █     ███   ██     ▄█ ██   ▀██▄     \n" +
                            "▄███▄ ▀▀  ▄████▄ ▀██████▀▀    ▄████▄  ▄███▄   ▄████▄███▄    ██    ▄████▄            ██      ██     ▄████▄███▄    ██ ▄███▄    ██ ▄██████████████▄ ▄███▄    \n" +
                            "                                                                                                                                                          \n" +
                            "                                                                                                                                                          \n");

                    System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////////" +
                            "///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////" +
                            "//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");


                    System.out.println("     .---'::'        `---.\n" +
                            "                            (::::::'              )\n" +
                            "                            |`-----._______.-----'|\n" +
                            "                            |              :::::::|\n" +
                            "                           .|               ::::::!-.\n" +
                            "                           \\|               :::::/|/\n" +
                            "                            |               ::::::|\n" +
                            "                            | Special Flonk Award:|\n" +
                            "                            |    for MUTANT   ::::|\n" +
                            "                            |               ::::::|\n" +
                            "                            |              .::::::|\n" +
                            "                            J              :::::::F\n" +
                            "                             \\            :::::::/\n" +
                            "                              `.        .:::::::'\n" +
                            "                                `-._  .::::::-'\n" +
                            "____________________________________|  \"\"\"|\"_________________________________________\n" +
                            "                                    |  :::|\n" +
                            "                                    F   ::J\n" +
                            "                                   /     ::\\                                        \n" +
                            "                              __.-'      :::`-.__\n" +
                            "                             (_           ::::::_)");
                    break;


                }
            }
        }
    }
}


