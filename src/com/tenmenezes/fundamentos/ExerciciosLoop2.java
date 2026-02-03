package com.tenmenezes.fundamentos;

import java.util.Scanner;

public class ExerciciosLoop2 {

    static void main(String[] args) {

        /*
         * 1)
         * Altere o programa anterior para mostrar no final a soma dos números.
         */

//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("\nDigite um número: ");
//        int n1 = scan.nextInt();
//
//        System.out.print("Digite outro número: ");
//        int n2 = scan.nextInt();
//
//        System.out.println(" ");
//
//        int aux = n1;
//
//        if (n1 > n2) {
//            n1 = n2;
//
//            n2 = aux;
//        }
//
//        int soma = 0;
//
//        for (int i = (n1 + 1); i <= (n2 - 1); i++) {
//
//            System.out.print(i + " | ");
//            soma += i;
//
//        }
//        System.out.println("\nSoma: " + soma);

        /*
         * 2)
         * Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número
         * inteiro entre 1 a 10. O usuário deve informar de qual número ele deseja ver a tabuada.
         * A saída deve ser conforme o exemplo abaixo:
             - Tabuada de 5:
             - 5 X 1 = 5
             - ...
             - 5 X 10 = 50
         */

//        Scanner scan = new Scanner(System.in);
//        System.out.println("*************************");
//        System.out.println(" |       TABUADA       |");
//        System.out.println("*************************");
//
//        System.out.print("\nDigite o número que seja ver a tabuada completa (1 a 10): ");
//        int num = scan.nextInt();
//
//        if (num > 10 || num < 1) {
//
//            System.out.println("\nErro: Número inválido digitado, digite um número entre 1 a 10.");
//
//        } else {
//
//            System.out.println("Tabuada de " + num + ": ");
//
//            for(int i = 1; i <= 10; i++) {
//                System.out.println(num + " X " + i + " = " + (num * i));
//            }
//
//        }

        /*
         * 3)
         * Faça um programa que peça dois números, base e expoente,
         * calcule e mostre o primeiro número elevado ao segundo número.
         * Não utilize a função de potência da linguagem.
         */

//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Digite o valor da Base: ");
//        int num = scan.nextInt();
//
//        System.out.print("Digite o valor do expoente: ");
//        int exp = scan.nextInt();
//
//        int result = 1;
//
//        for(int i = 1; i <= exp; i++) {
//            result = result * num;
//        }
//
//        System.out.println("\n" + num + "^" + exp + " = " + result);

        /*
         * 4)
         * Faça um programa que peça 10 números inteiros, calcule e mostre
         * a quantidade de números pares e a quantidade de números ímpares.
         */

//        Scanner scan = new Scanner(System.in);
//
//        int par = 0;
//        int impar = 0;
//
//        for(int i = 1; i <= 10; i++) {
//
//            System.out.print("Digite um número (" + i + "): ");
//            int num = scan.nextInt();
//
//            if(num % 2 == 0) {
//                par++;
//            } else if (num % 2 == 1) {
//                impar++;
//            } else {
//                System.out.println("Erro: Valor inválido.");
//                break;
//            }
//
//        }
//
//        System.out.println("\nQuantidade de números Pares..: " + par);
//        System.out.println("Quantidade de números Ímpares: " + impar);

        /*
         * 5)
         * A série de Fibonacci é formada pela sequência 1, 1, 2, 3, 5, 8, 13, 21, 34, 55...
         * Faça um programa capaz de gerar a série até o n-ésimo termo.
         */

//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Digite um número inteiro: ");
//        int n = scan.nextInt();
//
//        int a = 1;
//        int b = 1;
//
//        System.out.print("Sequência de Fibonacci: ");
//
//        System.out.print(a + " " + b + " ");
//
//        for(int i = 3; i <= n; i++) {
//            int proximo = a + b;
//            System.out.print(proximo + " ");
//            a = b;
//            b = proximo;
//        }

        /*
         * 6)
         * A série de Fibonacci é formada pela sequência 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55...
         * Faça um programa que gere a série até que o valor seja maior que 500.
         */

//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Digite um número inteiro: ");
//        int n = scan.nextInt();
//
//        int a = 1;
//        int b = 1;
//
//        System.out.print("Sequência de Fibonacci: ");
//
//        System.out.print(a + " " + b + " ");
//
//        for(int i = 3; i <= n; i++) {
//            int proximo = a + b;
//
//            if(proximo < 500) {
//                System.out.print(proximo + " ");
//                a = b;
//                b = proximo;
//            }
//        }

        /*
         * 7)
         * Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
         * Ex.: 5! = 5.4.3.2.1 = 120.
         */

//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("\nDigite um número: ");
//        int fat = scan.nextInt();
//
//        int result = fat;
//
//        System.out.print("\n" + fat + "! = ");
//
//        for(int i = (fat - 1); i >= 1; i--) {
//
//            fat = fat * i;
//
//            System.out.print(result + ".");
//            result--;
//        }
//
//        System.out.print("1");
//        System.out.println(" = " + fat);

        /*
         * 8)
         * Faça um programa que, dado um conjunto de N números, determine o menor valor,
         * o maior valor e a soma dos valores.
         */

//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Quantos números deseja digitar? ");
//        int n = scan.nextInt();
//
//        if (n <= 0) {
//
//            System.out.println("\nErro: Valor inválido digitado.");
//
//        } else {
//
//            System.out.print("\nDigite um número (" + 1 + "): ");
//            double primeiro = scan.nextDouble();
//
//            double maior = primeiro;
//            double menor = primeiro;
//            double soma  = primeiro;
//
//            for(int i = 2; i <= n; i++) {
//
//                System.out.print("Digite um número (" + i + "): ");
//                double num = scan.nextDouble();
//
//                if (num < menor) { menor = num; }
//                if (num > maior) { maior = num; }
//
//                soma += num;
//            }
//
//            System.out.println("\nMenor valor.....: " + menor);
//            System.out.println("Maior valor.....: " + maior);
//            System.out.println("Soma dos valores: " + soma);
//
//        }

        /*
         * 9)
         * Altere o programa anterior para que ele aceite apenas números entre 0 e 1000.
         */

//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Quantos números deseja digitar? ");
//        int n = scan.nextInt();
//
//        if (n <= 0) {
//
//            System.out.println("\nErro: Valor inválido digitado.");
//
//        } else {
//
//            System.out.print("\nDigite um número (" + 1 + "): ");
//            double primeiro = scan.nextDouble();
//
//            if (primeiro <= 0 && primeiro >= 1000) {
//
//                System.out.println("\nErro: O sistema suporta apenas números entre 0 e 1000.");
//                return;
//
//            } else {
//
//                double maior = primeiro;
//                double menor = primeiro;
//                double soma  = primeiro;
//
//                for(int i = 2; i <= n; i++) {
//
//                    System.out.print("Digite um número (" + i + "): ");
//                    double num = scan.nextDouble();
//
//                    if (num >= 0 && num <= 1000) {
//
//                        if (num < menor) { menor = num; }
//                        if (num > maior) { maior = num; }
//
//                        soma += num;
//
//                    } else {
//
//                        System.out.println("\nErro: O sistema suporta apenas números entre 0 e 1000.");
//                        return;
//
//                    }
//                }
//            }
//        }

        /*
         * 10)
         * Altere o programa de cálculo do fatorial, permitindo ao usuário calcular o fatorial
         * várias vezes e limitando o fatorial a números inteiros positivos e menores que 16.
         */

        Scanner scan = new Scanner(System.in);

        String resp = "S";

        while (resp.equals("S")) {

            System.out.print("\nDigite um número: ");
            int fat = scan.nextInt();

            if (fat >= 0 && fat < 16) {

                if (fat == 0) {

                    System.out.println("0! = 1");

                } else {

                    int result = fat;

                    System.out.print("\n" + fat + "! = ");

                    for(int c = (fat - 1); c >= 1; c--) {

                        fat *= c;

                        System.out.print(result + ".");
                        result--;
                    }

                    System.out.print("1");
                    System.out.println(" = " + fat);

                }

            } else {
                System.out.println("\nNúmero incorreto digitado.");
                continue;
            }

            System.out.print("\nDeseja realizar o cálculo de outro fatorial? (S/N): ");
            resp = scan.next();

            if (resp.equals("N")) {
                System.out.println("\nEncerrando programa...");
                break;
            }
        }
    }
}