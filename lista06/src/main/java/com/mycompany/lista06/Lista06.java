/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.lista06;

import java.util.Scanner;

/**
 *
 * @author Mateus Araujo de Paula
 */
public class Lista06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(".::Exercicio 1::.");
        double[] vetor1 = new double[10];
        int qtdNegativos = 0;
        double somaPositivos = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Numero " + (i + 1) + ":");
            vetor1[i] = sc.nextDouble();
            if (vetor1[i] > 0) {
                somaPositivos = somaPositivos + vetor1[i];
            } else {
                qtdNegativos++;
            }
        }
        System.out.println("\n Quantidade de numeros negativos:\n" + qtdNegativos);
        System.out.println(" Soma dos numeros positivos:\n" + somaPositivos);

        System.out.println("\n.::Exercicio 2::.");
        int vetor2[] = new int[5];
        int maiorValor = 0, menorValor = 0, mediaValores = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Valor " + (i + 1) + ":");
            vetor2[i] = sc.nextInt();
            mediaValores = mediaValores + vetor2[i];
            if (i == 0) {
                maiorValor = vetor2[i];
                menorValor = vetor2[i];
            } else if (vetor2[i] > maiorValor) {
                maiorValor = vetor2[i];
            } else if (vetor2[i] < menorValor) {
                menorValor = vetor2[i];
            }
        }
        System.out.println("Todos os valores: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(" " + vetor2[i]);
        }
        System.out.println("\n Maior: " + maiorValor);
        System.out.println(" Menor: " + menorValor);
        System.out.println(" Media: " + (mediaValores / 5));

        System.out.println("\n.::Exercicio 3::.");
        int[] vetor3 = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Valor " + (i + 1) + ":");
            vetor3[i] = sc.nextInt();
        }
        boolean igual = false;
        System.out.println("\nValores iguais:\n");
        for (int i = 0; i < 10; i++) {
            for (int j = (i + 1); j < 10; j++) {
                if (vetor3[i] == vetor3[j]) {
                    for (int k = (i - 1); k >= 0; k--) {
                        if (vetor3[i] == vetor3[k]) {
                            igual = true;
                        }
                    }
                    if (igual == false) {
                        System.out.println(" " + vetor3[i]);
                    }
                    igual = false;
                    break;
                }
            }
        }

        System.out.println("\n.::Exercicio 4::.\n");
        int[] vetor4 = new int[20];
        boolean repetido = false;
        for (int i = 0; i < 20; i++) {
            System.out.println("Valor " + (i + 1) + ":");
            vetor4[i] = sc.nextInt();
        }
        for (int i = 0; i < 20; i++) {
            for (int j = (i + 1); j < 20; j++) {
                if (vetor4[i] == vetor4[j]) {
                    repetido = true;
                }
            }
            if (repetido == false) {
                System.out.println(" " + vetor4[i]);
            }
            repetido = false;
        }

        System.out.println(".::Exercicio 5::.\n");
        double[] vetor5 = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Numero " + (i + 1) + ":");
            vetor5[i] = sc.nextDouble();
        }
        System.out.println("Valor do codigo:");
        int codigo = sc.nextInt();
        switch (codigo) {
            case 0:
                System.out.println("Finalizado.");
                break;
            case 1:
                System.out.print(" {" + vetor4[0]);
                for (int i = 1; i < 5; i++) {
                    System.out.print(", " + vetor4[i]);
                }
                System.out.print("}");
                break;
            case 2:
                System.out.println(" {" + vetor4[4]);
                for (int i = 4; i >= 0; i--) {
                    System.out.print(", " + vetor4[i]);
                }
                System.out.print("}");
                break;
            default:
                System.out.println("Codigo invalido.");
                break;
        }

        System.out.println("\n.::Exercicio 6::.");
        int[] vetor6 = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Numero " + (i + 1) + ":");
            vetor6[i] = sc.nextInt();
        }
        System.out.println("Numero x:");
        int numeroX = sc.nextInt();
        int multiplosDX = 0;
        System.out.println("Multiplos de " + numeroX + ":");
        for (int i = 0; i < 10; i++) {
            if (vetor6[i] % numeroX == 0) {
                multiplosDX++;
                System.out.print(" " + vetor6[i]);
            }
        }
        System.out.println("\nTotal de multiplos de " + numeroX + ":\n" + multiplosDX);
    }
}
