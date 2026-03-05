package Matrizes;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o tamanho da matriz?");
        int n = sc.nextInt();

        int[][] matriz = new int[n][n];

        System.out.printf("Quantidade de linhas da matriz = %d%n", matriz.length);


        //Percorre as linhas
        for (int i = 0; i < n; i++) {
            if (i == 0){
                System.out.printf("Quantidade de colunas da matriz = %d%n", matriz[i].length);
            }
            //Percorre as colunas
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        //Imprimir diagonal principal
        System.out.print("Diagonal principal: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j == i){
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }

        //Imprimir diagonal secundaria
        System.out.print("\nDiagonal secundária: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j == (matriz[i].length - 1 - i)){
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }

        int count = 0;
        //Imprimir números negativos da matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0){
                    count++;
                }
            }
        }

        System.out.printf("\nQuantidade de números negativos = %d%n", count);


        sc.close();

    }
}
