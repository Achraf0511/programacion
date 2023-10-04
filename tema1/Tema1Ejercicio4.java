import java.util.Scanner;

public class Tema1Ejercicio4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce tres numeros enteros");
        int numero1 = in.nextInt();
        int numero2 = in.nextInt();
        int numero3 = in.nextInt();

        if (numero2 < numero1 && numero3 < numero1) {
            System.out.println("El primer numero es el mayor");
        }
        if(numero1 < numero2 && numero3 < numero2){
            System.out.println("El segundo numero es mayor");
        }
        if (numero2<numero3 && numero1<numero3 ){
            System.out.println("El tercer numero es mayor");
        }

    }
}







