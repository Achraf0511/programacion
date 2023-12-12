import java.util.Arrays;
import java.util.Scanner;

public class MyMatrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz1 = new int[3][3];
        matriz1[0][0] = 1;
        matriz1[0][1] = 2;
        matriz1[0][2] = 3;
        matriz1[1][0] = 4;
        matriz1[1][1] = 5;
        matriz1[1][2] = 6;
        matriz1[2][0] = 7;
        matriz1[2][1] = 8;
        matriz1[2][2] = 9;

        int[][] matriz2 = new int[3][3];
        matriz2[0][0] = 1;
        matriz2[0][1] = 2;
        matriz2[0][2] = 3;
        matriz2[1][0] = 4;
        matriz2[1][1] = 5;
        matriz2[1][2] = 6;
        matriz2[2][0] = 7;
        matriz2[2][1] = 8;
        matriz2[2][2] = 9;

        System.out.println("Nuestra matriz es:");
        imprimirMatriz(matriz1);
        System.out.println("El valor máximo de nuestra matriz es:");
        System.out.println(maxMatriz(matriz1));
        System.out.println("El valor mínimo de nuestra matriz es:");
        System.out.println(minMatriz(matriz1));
        System.out.println("La media de nuestra matriz es:");
        System.out.println(mediaMatriz(matriz1));
        System.out.println("Introduce un valor para ver si existe en nuestra matriz");
        System.out.println(existeMatriz(matriz1));
        System.out.println("La suma de nuestra matriz con otra matriz equivalente es:");
        System.out.println(Arrays.deepToString(sumaMatriz(matriz1, matriz2)));
        System.out.println("La resta de nuetsra matriz con otra matriz equivalente es:");
        System.out.println(Arrays.deepToString(restaMatriz(matriz1, matriz2)));
        System.out.println("¿Nuestra matriz es la matriz unidad? ");
        System.out.println(matrizUnidad(matriz1));


    }

    public static void imprimirMatriz(int[][] matriz1) {
        System.out.println(Arrays.deepToString(matriz1));


    }

    public static int maxMatriz(int[][] matriz1) {
        int valormax = matriz1[2][2];
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                if (matriz1[i][j] > valormax) {
                    valormax = matriz1[i][j];
                }


            }


        }
        return valormax;

    }

    public static int minMatriz(int[][] matriz1) {
        int valormin = matriz1[2][2];
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                if (matriz1[i][j] < valormin) {
                    valormin = matriz1[i][j];
                }


            }


        }
        return valormin;

    }

    public static double mediaMatriz(int[][] matriz1) {
        double media = 0;
        double sumatorio = 0;
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                sumatorio += matriz1[i][j];

                media = sumatorio / 9;
            }


        }
        return media;

    }

    public static boolean existeMatriz(int[][] matriz1) {
        Scanner in = new Scanner(System.in);
        boolean existeMatriz = false;
        int a=in.nextInt();
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                if (a == matriz1[i][j]) {
                    existeMatriz = true;
                }
            }


        }
        return existeMatriz;

    }



    public static int[][] sumaMatriz(int[][] matriz1, int[][] matriz2) {
        int[][] matriz3 = new int[3][3];
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return matriz3;

    }

    public static int[][] restaMatriz(int[][] matriz1, int[][] matriz2) {
        int[][] matriz3 = new int[3][3];
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz3[i][j] = matriz1[i][j] - matriz2[i][j];
            }
        }
        return matriz3;
    }
    public static boolean matrizUnidad(int[][]matriz1){
        boolean comprobacion=false;
        int[][]matrizUnidad= new int [3][3];
        matrizUnidad[0][0] = 1;
        matrizUnidad[0][1] = 0;
        matrizUnidad[0][2] = 0;
        matrizUnidad[1][0] = 0;
        matrizUnidad[1][1] = 1;
        matrizUnidad[1][2] = 0;
        matrizUnidad[2][0] = 0;
        matrizUnidad[2][1] = 0;
        matrizUnidad[2][2] = 1;
        if(matriz1==matrizUnidad){
            comprobacion=true;
        }
        return comprobacion;
    }

}

