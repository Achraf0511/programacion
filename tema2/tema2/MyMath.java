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
        if (base > 0 & altura > 0) {
            perimetrorectangulo = 2 * base + 2 * altura;


        } else if (base == 0 || altura == 0) {
            perimetrorectangulo = 0;
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
        return isPrime(numero)==false;


    }

    public static int figureCount(int numero) {

        int figures = 0;
        if (numero == 0) {
            figures = 1;
        } else {
            while (numero != 0) {
                numero = numero / 10;
                figures++;
            }
        }

        return figures;

    }

    public static int evenFigureCount(int numero) {
        int figures = 0;
        if (numero == 0) {
            figures = 1;
        } else {
            while (numero != 0) {
                int candidato = numero % 10;
                if (candidato % 2 == 0) {
                    figures++;
                }
                numero = numero / 10;
            }
        }
        return figures;
    }


    public static int oddFigureCount(int numero) {
      return figureCount(numero)-evenFigureCount(numero);


    }

    public static int factorial(int numero) {
        int factorial = 1;
        if (numero == 0) {
            factorial = 1;
        } else if (numero < 0) {
            factorial = 0;
        } else {
            for (int a = 1; a <= numero; a++) {
                factorial = factorial * a;
            }



        }
        return factorial;


    }
    public static int factorialRecursive(int numero) {
        int factorial = 1;
        if (numero == 0) {
            factorial = 1;
        } else if (numero < 0) {
            factorial = 0;
        } else {
            for (int a = 1; a <= numero; a++) {
                factorial = factorial * a;
            }



        }
        return factorial;


    }
  public static int quadraticEcuationSolutions (int a, int b, int c){
        int result;
        int ecuacion = b*2-4*a*c;
        if(ecuacion>0)result=2;
        else if (ecuacion==0)result=1;
        else result=0;
        return result;
    }
public static int figuresSumatory (int numero){
        int n=numero;
        int sumatorio=0;
        n= Math.abs(n);
        while (n !=0){
            int cantidad =n%10;
            sumatorio += cantidad;
            n=n/10;
        }
    return sumatorio;

    }
}