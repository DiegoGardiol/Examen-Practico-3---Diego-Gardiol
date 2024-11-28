package org.example;

import java.util.Random;
import java.util.Scanner;

public class examen3 {
    public void bingo(){

        Scanner entrada = new Scanner(System.in);
        System.out.println("***BIENVENIDO AL BINGO DEL CASINO CANTÁBRICO***");
        int[] numeros = new int[27];
        Random random = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(10, 40);
        }

        System.out.print("25 bolas extraídas hasta ahora: [ ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + ", ");
        }
        System.out.print("]\n");

        System.out.println("***Introduce los datos de tu cartón***");

        int matrize[][] = new int[3][3];
        for (int i = 0; i < matrize.length; i++) {
            System.out.println("fila " + i + ": ");
            for (int j = 0; j < matrize[i].length; j++) {

                if (i == j) {
                    matrize[i][j] = entrada.nextInt();
                } else {
                    matrize[i][j] = entrada.nextInt();
                }

            }
        }
        System.out.println("Datos del cartón introducido:");
        for (int[] filas : matrize) {
            for (int columnas : filas) {
                System.out.print(columnas + " ");
            }
            System.out.print("\n");
        }




    }
}
