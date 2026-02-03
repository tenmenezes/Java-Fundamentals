package com.tenmenezes.fundamentos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Exercicios com matriz\n");

        /*
         * 1
         * Gere uma matriz M 4x4 com valores inteiros aleatórios entre 0 e 9.
         *
         * Em seguida:
         * - imprima a matriz na tela;
         * - determine o maior valor armazenado na matriz;
         * - informe a posição (linha e coluna) onde esse maior valor se encontra.
         *
         */

//        int[][] matriz = new int[4][4];
//        Random rand = new Random();
//
//        int maior = 0;
//        int linha = 0;
//        int coluna = 0;
//
//        System.out.println("Matriz com os valores: \n");
//
//        for (int i = 0; i < matriz.length; i++) {
//            for (int j = 0; j < matriz[i].length; j++) {
//
//                matriz[i][j] = rand.nextInt(10);
//
//                System.out.print(matriz[i][j] + " ");
//
//                if (maior < matriz[i][j]) {
//                    maior = matriz[i][j];
//                    linha = i;
//                    coluna = j;
//                }
//            }
//            System.out.println();
//        }
//
//        System.out.println("\n\nMaior valor presente na matriz: ");
//        System.out.println("Linha.: " + linha);
//        System.out.println("Coluna: " + coluna);
//        System.out.println("Valor.: " + maior);

        /*
         * 2
         * Leia do teclado os valores para preencher uma matriz M 3x3 de números inteiros.
         *
         * Após o preenchimento:
         * - imprima a matriz;
         * - calcule e exiba a quantidade de números pares;
         * - calcule e exiba a quantidade de números ímpares.
         *
         */

//        Scanner scan = new Scanner(System.in);
//
//        int[][] matriz = new int[3][3];
//        int ehPar = 0;
//        int ehImpar = 0;
//
//        for (int i = 0; i < matriz.length; i++) {
//            for (int j = 0; j < matriz[i].length; j++) {
//                System.out.print("Digite o valor da posição [" + i + "][" + j + "]: ");
//                int valorDigitado = scan.nextInt();
//
//                matriz[i][j] = valorDigitado;
//            }
//            System.out.println();
//        }
//
//        System.out.println("\nValores salvos na matriz: ");
//
//        for (int i = 0; i < matriz.length; i++) {
//            for (int j = 0; j < matriz[i].length; j++) {
//
//                System.out.print(matriz[i][j] + " ");
//
//                if (matriz[i][j] % 2 == 0) {
//                    ehPar++;
//                } else {
//                    ehImpar++;
//                }
//
//            }
//            System.out.println();
//        }
//
//        System.out.println("\nQtd. Par..: " + ehPar);
//        System.out.println("Qtd. Ímpar: " + ehImpar);

        /*
         * 3
         * Gere uma matriz M 10x10 com valores inteiros aleatórios entre 0 e 9.
         *
         * Após isso, determine e exiba:
         * - o maior e o menor valor da linha 5;
         * - o maior e o menor valor da coluna 7.
         *
         * A matriz deve ser exibida antes dos cálculos.
         *
         */

//        Random rand = new Random();
//
//        int[][] matriz = new int[10][10];
//
//
//        int linha  = 5 - 1;
//        int coluna = 7 - 1;
//
//
//        System.out.println("Valores presentes na matriz: \n");
//
//        for (int i = 0; i < matriz.length; i++) {
//            System.out.print("[" + i + "]" + " ");
//            for (int j = 0; j < matriz[i].length; j++) {
//
//                matriz[i][j] = rand.nextInt(10);
//                System.out.print(matriz[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        int maiorDaLinha_5 = matriz[linha][0];
//        int menorDaLinha_5 = matriz[linha][0];
//
//        int maiorDaColuna_7 = matriz[0][coluna];
//        int menorDaColuna_7 = matriz[0][coluna];
//
//        for (int j = 0; j < matriz[linha].length; j++) {
//
//            if (maiorDaLinha_5 < matriz[linha][j]) {
//
//                maiorDaLinha_5 = matriz[linha][j];
//
//            }
//
//            if (menorDaLinha_5 > matriz[linha][j]) {
//
//                menorDaLinha_5 = matriz[linha][j];
//
//            }
//        }
//
//        for (int i = 0; i < matriz.length; i++) {
//
//            if (maiorDaColuna_7 < matriz[i][coluna]) {
//
//                maiorDaColuna_7 = matriz[i][coluna];
//
//            }
//
//            if (menorDaColuna_7 > matriz[i][coluna]) {
//
//                menorDaColuna_7 = matriz[i][coluna];
//
//            }
//        }
//
//        System.out.println("\nMaior valor da linha 5: " + maiorDaLinha_5);
//        System.out.println("Menor valor da linha 5: " + menorDaLinha_5);
//        System.out.println();
//        System.out.println("Maior valor da coluna 7: " + maiorDaColuna_7);
//        System.out.println("Menor valor da coluna 7: " + menorDaColuna_7);

        /*
         * 4
         * Implemente um programa que utilize uma matriz para armazenar os compromissos de uma agenda mensal.
         *
         * - Cada linha representa um dia do mês (1 a 30);
         * - Cada coluna representa uma hora do dia (0 a 23).
         *
         * O programa deve apresentar um menu com as opções:
         * - a) Inserir ou alterar um compromisso (informando dia e hora);
         * - b) Consultar um compromisso (informando dia e hora);
         * - c) Encerrar o programa.
         *
         */

//        Scanner scan = new Scanner(System.in);
//
//        String[][] agenda = new String[30][24];
//        int opc;
//
//        do {
//
//            System.out.println("-----------------------------------");
//            System.out.println("|  Agenda Mensal de Compromissos  |");
//            System.out.println("-----------------------------------");
//
//            System.out.println("\nPara selecionar a ação, digite: ( 1 | 2 | 3 | 4 )\n");
//
//            System.out.println("1 - Inserir / Alterar compromisso");
//            System.out.println("2 - Consultar compromisso");
//            System.out.println("3 - Encerrar programa");
//
//            System.out.print("\nO que deseja fazer? ");
//            opc = scan.nextInt(5);
//
//            if (opc == 1) {
//
//                System.out.print("\nInforme o dia (1 a 30).: ");
//                int dia = scan.nextInt() - 1;
//
//                System.out.print("Informe a hora (0 a 23): ");
//                int hora = scan.nextInt();
//
//                scan.nextLine(); // limpar buffer - o Enter
//
//                System.out.print("\nInforme qual será o compromisso: ");
//                String compromisso = scan.nextLine();
//
//                agenda[dia][hora] = compromisso;
//
//                System.out.println("\nCompromisso salvo com sucesso! \n");
//
//            } else if (opc == 2) {
//
//                System.out.print("\nInforme o dia (1 a 30): ");
//                int dia = scan.nextInt() - 1;
//
//                System.out.print("Informe a hora (0 a 23): ");
//                int hora = scan.nextInt();
//
//                if (agenda[dia][hora] == null) {
//                    System.out.println("\nNenhum compromisso nesse dia/horário.\n");
//                } else {
//                    System.out.println("Compromisso: " + agenda[dia][hora]);
//                }
//
//            } else {
//                System.out.println("\nEncerrando programa...");
//            }
//
//        } while (opc != 3);

        /*
         * 5
         * Modifique o exercício anterior para armazenar os compromissos
         *  do decorrer do ano, utilizando uma matriz tridimensional:
         * - mês (1 a 12);
         * - dia (1 a 30);
         * - hora (0 a 7).
         *
         * O programa deve permitir:
         * - cadastrar compromissos;
         * - consultar compromissos informando mês, dia e hora.
         *
         */

        Scanner scan = new Scanner(System.in);

        String[][][] agendaAnual = new String[12][30][8];
        int opc;

        do {

            System.out.println("-----------------------------------");
            System.out.println("|  Agenda Anual de Compromissos  |");
            System.out.println("-----------------------------------");

            System.out.println("1 - Cadastrar compromisso");
            System.out.println("2 - Consultar compromisso");
            System.out.println("3 - Encerrar programa");

            System.out.print("\nQual deseja selecionar? ");
            opc = scan.nextInt();

            if (opc == 1) {

                System.out.print("\nSelecione o mês (1 a 12): ");
                int mes = scan.nextInt() - 1;

                System.out.print("Selecione o dia (1 a 30): ");
                int dia = scan.nextInt() - 1;

                System.out.print("Selecione a hora (0 a 7): ");
                int hora = scan.nextInt();

                scan.nextLine();

                System.out.print("\nCompromisso: ");
                String compromisso = scan.nextLine();

                agendaAnual[mes][dia][hora] = compromisso;

                System.out.println("\nCompromisso salvo com sucesso.\n");

            } else if (opc == 2) {

                System.out.print("\nDigite o mês (1 a 12): ");
                int mes = scan.nextInt() - 1;

                System.out.print("Digite o dia (1 a 30): ");
                int dia = scan.nextInt() - 1;

                System.out.print("Digite a hora (0 a 7): ");
                int hora = scan.nextInt();

                if (agendaAnual[mes][dia][hora] != null) {

                    System.out.println("\nMês.: " + (mes + 1));
                    System.out.println("Dia.: " + (dia + 1));
                    System.out.println("Hora: " + hora + "h\n");

                    System.out.println("Compromisso: " + agendaAnual[mes][dia][hora]);
                    System.out.println();
                } else {
                    System.out.println("\nNenhum compromisso encontrado com as informações digitadas.\n");
                }

            } else {
                System.out.println("\nEncerrando programa...\n");
            }

        } while (opc != 3);
    }
}