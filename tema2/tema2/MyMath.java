package tema2;

public class MyMath {
    public static double squarePerimeter(double lado) {
        double perimetrocuadrado = 0;
        if (lado >= 0) {
            perimetrocuadrado = 4 * lado;
        }

        return perimetrocuadrado;


    }

    public static double squareArea(double lado) {

        double areacuadrado = 0;
        if (lado >= 0) {
            areacuadrado = lado * lado;

        }
        return areacuadrado;
    }

    public static double rectanglePerimeter(double base, double altura) {
        double perimetrorectangulo = 0;
        if (base >= 0 & altura >= 0) {
            perimetrorectangulo = 2 * base + 2 * altura;


        }
        return perimetrorectangulo;
    }

    public static double rectangleArea(double base, double altura) {
        double arearectangulo = 0;
        if (base >= 0 & altura >= 0) {
            arearectangulo = base * altura;


        }
        return arearectangulo;
    }

    public static double circlePerimeter(int radio) {
        double perimetrocirculo = 0;
        if (radio >= 0) {
            perimetrocirculo = Math.PI * (2 * radio);
        }
        return perimetrocirculo;

    }

    public static double circleArea(int radio) {
        double areacirculo = 0;
        if (radio >= 0) {
            areacirculo = Math.PI * radio * radio;
        }
        return areacirculo;
    }

    public static boolean isPrime(int numero) {

        if (numero < 2) return false;
        if (numero == 2 || numero == 3) return true;
        if (numero % 2 == 0 || numero % 3 == 0) return false;

        int sqrt = (int) Math.sqrt(numero) + 1;
        for (int i = 5; i <= sqrt; i += 6) {
            if (numero % i == 0 || numero % (i + 2) == 0) {
                return false;
            }
        }

        return true;

    }


    public static boolean isNotPrime(int numero) {
        if (numero < 2) return true;
        if (numero == 2 || numero == 3) return false;
        if (numero % 2 == 0 || numero % 3 == 0) return true;

        int sqrt = (int) Math.sqrt(numero) + 1;
        for (int i = 5; i <= sqrt; i += 6) {
            if (numero % i == 0 || numero % (i + 2) == 0) {
                return true;
            }
        }

        return true;


    }

    public static int figureCount(int numero) {

        int x = 0;
        while (numero != 0) {
            numero = numero / 10;
            x++;
        }
        return x;

    }

    public static boolean evenFigureCount(int numero) {
        boolean digitopar;
        int x = 0;
        while (numero != 0) {
            numero = numero / 10;
            x++;
            if (x % 2 == 0) {
                digitopar = true;
            } else {
                digitopar = false;
            }
            return digitopar;

        }


    }
}
