package tema2;

public class Ejercicio6 {

        public static void main(String[] args) {
            System.out.println(tablaMultiplicar2());

        }
        public static int tablaMultiplicar2(){
            for (int i = 1; i <= 10; i++) {
                System.out.println("Tabla del " + i + ":");
                for (int j = 1; j <= 10; j++) {
                    System.out.println(i + " x " + j + " = " + (i * j));
                }
                System.out.println();
            }
            return 0;
        }
    }









