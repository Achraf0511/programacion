import java.util.Scanner;

public class Tema1Ejercicio22 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un número entero");
        int a = in.nextInt();
        int x=0;
        while(a !=0){
            a=a/10;
            x++;
        }
        System.out.println("El número de cifras que tienen es " + x);
    }
}