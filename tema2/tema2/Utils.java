package tema2;

public class Utils {


    public static double miles2kilometers(double quilometros) {
        double millas = 0;
        if (millas >= 0) {

            millas = 1.60934 * quilometros;
        }
        return millas;


    }

    public static double getTaxes(double precio, double porcentaje) {
        double calculoporcentage = (precio * porcentaje) / 100;
        return Math.round(calculoporcentage * 100) / 100.0;


    }

    public static double getNetPrice(double precio, double impuesto) {
        double calculoimpuesto = (precio * impuesto) / 100;
        double precioneto = calculoimpuesto + precio;
        return Math.round(precioneto * 100) / 100.0;
    }

    public static int getCoins(double precio) {
        int centimos = (int) Math.round(precio * 100);
        int monedas = 0;
        while (centimos != 0) {
            if (centimos - 200 >= 0) {
                centimos -= 200;
                monedas += 10000000;
            } else if (centimos - 100 >= 0) {
                centimos -= 100;
                monedas += 1000000;
            } else if (centimos - 50 >= 0) {
                centimos -= 50;
                monedas += 100000;
            } else if (centimos - 20 >= 0) {
                centimos -= 20;
                monedas += 10000;

            } else if (centimos - 10 >= 0) {
                centimos -= 10;
                monedas += 1000;
            } else if (centimos - 5 >= 0) {
                centimos -= 5;
                monedas += 100;
            } else if (centimos - 2 >= 0) {
                centimos -= 2;
                monedas += 10;
            } else {
                centimos -= 1;
                monedas += 1;
            }
        }
        return monedas;
    }


    public static char getNIF(int identificacion) {
        int letraidentificacion = identificacion % 23;
        switch (letraidentificacion) {
            case 0:
                identificacion = 'T';
                break;
            case 1:
                identificacion = 'R';
                break;

            case 2:
                identificacion = 'W';
                break;


            case 3:
                identificacion = 'A';
                break;

            case 4:
                identificacion = 'G';
                break;

            case 5:
                identificacion = 'M';
                break;

            case 6:
                identificacion = 'Y';
                break;

            case 7:
                identificacion = 'F';
                break;

            case 8:
                identificacion = 'P';
                break;

            case 9:
                identificacion = 'D';
                break;

            case 10:
                identificacion = 'X';
                break;

            case 11:
                identificacion = 'B';
                break;


            case 12:
                identificacion = 'N';
                break;

            case 13:
                identificacion = 'J';
                break;


            case 14:
                identificacion = 'Z';
                break;

            case 15:
                identificacion = 'S';
                break;

            case 16:
                identificacion = 'Q' ;

                break;


            case 17:
                identificacion = 'V';

                break;

            case 18:
                identificacion = 'H';

                break;


            case 19:
                identificacion = 'L';
                break;


            case 20:
                identificacion = 'C' ;
                break;

            case 21:
                identificacion = 'K' ;

                break;
            case 22:
                identificacion = 'E' ;
                break;



        }
        return (char) identificacion;



    }

    public static boolean isValidNIF( int identificacion, char letraidentificacion) {
        boolean identificacionvalida=false;

        if (Character.toUpperCase(letraidentificacion) == getNIF(identificacion)) {
            identificacionvalida=true;

        }
        return identificacionvalida;

    }
}

