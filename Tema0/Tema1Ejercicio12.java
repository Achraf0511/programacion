import java.util.Scanner;

public class Tema1Ejercicio12 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
System.out.println("Escribe tres valores numéricos");
int a= in.nextInt();
int b= in.nextInt();
int c= in.nextInt();
System.out.println("Ordenando los números de mayor a menor");
if (a>b && b>c) {System.out.println(a);System.out.println(b);System.out.println(c);}
else if (a>b && b<c){System.out.println(a);System.out.println(c);System.out.println(b);}
else if (c>a && a>b){System.out.println(c);System.out.println(a);System.out.println(b);}
else if (c>a && a<b){System.out.println(c);System.out.println(b);System.out.println(a);}
else if (b>a && a>c){System.out.println(b);System.out.println(a);System.out.println(c);}
else if (b>a && a<c){System.out.println(b);System.out.println(c);System.out.println(a);}
    }

}