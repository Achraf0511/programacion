
import java.util.Arrays;
import java.util.Scanner;

public class MyArray {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese la longitud de un vector ");
        int longitud = in.nextInt();

        int[] miArray = new int[longitud];

        System.out.println("Ingrese los elementos de un vector");
        for (int i = 0; i < miArray.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            miArray[i] = in.nextInt();
        }

        System.out.println("El vector creado es");
        for (int num : miArray) {
            System.out.print(num + " ");

        }
        int cont=0;
        while (cont ==0) {
            System.out.println("¿Que deseas hacer ahora?");
            showMenu();
            String opcion = in.nextLine();
            switch (opcion) {

                case "a":
                    System.out.println(maxArray(miArray));
                    break;
                case "b":
                    System.out.println(minArray(miArray));
                    break;
                case "c":
                    System.out.println(mediaArray(miArray));
                    break;

                case "d":
                    System.out.println("Introduce un valor para saber si existe");
                    System.out.print(existElement(miArray));
                    break;

                case "e":
                    System.out.println("El vector de la operación será [1]:[2]:[3]:[4]:[5]");
                    System.out.println("El resultado de la suma es:");
                    System.out.println(sumaVectores(miArray));
                    break;

                case "f":
                   System.out.println(Arrays.toString(invertirArray(miArray)));
                   break;

                case "g":
                    System.out.println(capicuaArray(miArray));
                    break;

                case "h":
                    cont++;




            }

            }
        }


    public static void showMenu() {
        System.out.println("a) Saber cual es el maximo valor del vector");
        System.out.println("b) Saber cual es el minimo valor del vector");
        System.out.println("c) Saber cual es la media del vector");
        System.out.println("d) Saber si un elemento existe en el vector");
        System.out.println("e) Saber el resultado de la suma de los vectores");
        System.out.println("f) Invertir el vector");
        System.out.println("g) Saber si un vector es capicua");
        System.out.println("h)Salir");


    }


    public static int maxArray(int[]miArray) {
        int valormax=miArray[0];
        for(int i=1;i<miArray.length;i++){
            if(miArray[i]>valormax){
                valormax=miArray[i];
            }
        }
         return valormax;

    }

    public static int minArray(int[]miArray) {
        int valormax=miArray[0];
        for(int i=1;i<miArray.length;i++){
            if(miArray[i]<valormax){
                valormax=miArray[i];
            }
        }
        return valormax;

    }


    public static double mediaArray(int[]miArray) {
        double sumatorio=0;
        double media=0;
        for (int i=0; i<miArray.length; i++){
            sumatorio +=miArray[i];
            media=sumatorio/ miArray.length;

        }
        return media;

    }

    public static boolean existElement(int []miArray) {
        Scanner in = new Scanner(System.in);
        boolean existe = false;
        int a = in.nextInt();
        for (int i = 0; i < miArray.length; i++) {
            if (a == miArray[i]) {
                existe = true;
            }

        }
        return existe;
    }

    public static int sumaVectores(int[]miArray) {
        Scanner in = new Scanner(System.in);
        int[]tuArray={1,2,3,4,5};
        int sumatorio1=0;
        int sumatorio2=0;
        int total=0;
        for (int i=0; i<miArray.length; i++){
            sumatorio1 +=miArray[i];
        }for(int a=0; a<tuArray.length;a++){
            sumatorio2 +=tuArray[a];

        }
        total=sumatorio1+sumatorio2;
        return total;



    }

    public static int restaVectores(int[]miArray) {
        Scanner in = new Scanner(System.in);
        int[]tuArray={1,2,3,4,5};
        int sumatorio1=0;
        int sumatorio2=0;
        int total=0;
        for (int i=0; i<miArray.length; i++){
            sumatorio1 +=miArray[i];
        }for(int a=0; a<tuArray.length;a++){
            sumatorio2 +=tuArray[a];

        }
        total=sumatorio1+sumatorio2;
        return total;



    }

    public static int[] invertirArray(int[]miArray) {
        int[] invertarray = new int[miArray.length];
        int cont = miArray.length - 1;
        for (int v : miArray) {
            invertarray[cont] = v;
            cont--;

        }


        return invertarray;
    }

    public static void procedinvertirArray(int[] miArray) {
        System.arraycopy(invertirArray(miArray), 0, miArray, 0, miArray.length);
    }

    public static boolean capicuaArray(int[]miArray) {
        boolean capicua = false;
        int longitud = miArray.length;
        for (int i = 0; i < longitud / 2; i++) {
            if (miArray[i] == miArray[longitud - i - 1]) capicua = true;


        }


        return capicua;
    }
}





