package com.tenmenezes.fundamentos;

import java.util.Scanner;

public class Vetores_Arrays {

    static void main(String[] args) {

        /*
         * Preenchimento manual + leitura
         * Crie um array de int com 5 posições.
         * Preencha manualmente com valores diferentes e mostre:
         *   todos os valores
         *   o tamanho do array
         */

//        int[] numeros = new int[5];
//
//        numeros[0] = 1;
//        numeros[1] = 2;
//        numeros[2] = 3;
//        numeros[3] = 4;
//        numeros[4] = 5;
//
//        for (int num : numeros) {
//
//            System.out.println("Números no array numeros: " + num);
//
//        }
//
//        System.out.println("\nTamanho do array: " + numeros.length);

        /*
         * Dado um array de `int`, calcule e mostre:
         *  - a soma de todos os valores
         *  - dica mental: variável acumuladora fora do `for`.
         */

//        int[] valores = new int[5];
//
//        valores[0] = 10;
//        valores[1] = 100000;
//        valores[2] = 32543543;
//        valores[3] = 787;
//        valores[4] = 1223;
//
//        int soma = 0;
//
//        for (int i = 0; i < valores.length; i++) {
//
//            soma += valores[i];
//
//        }
//
//        System.out.println("A soma dos valores é: " + soma);

        /*
         * Usando um array de `double` com notas de alunos:
         *   - calcule a média
         *   - mostre a média no final
         */

//        double[] notaAlunos = new double[3];
//
//        notaAlunos[0] = 10;
//        notaAlunos[1] = 5.5;
//        notaAlunos[2] = 2;
//
//        double soma = 0;
//
//        for (int i = 0; i < notaAlunos.length; i++) {
//
//            System.out.println("Nota do aluno " + (i+1) + ": " + notaAlunos[i]);
//
//            soma += notaAlunos[i];
//        }
//
//        double media = soma / notaAlunos.length;
//
//        System.out.println("\nMédia de notas é: " + String.format("%.2f", media));




        /*
         * Dado um array de números inteiros:
         *  - descubra o maior
         *  - descubra o menor
         *
         *  ⚠️ sem usar funções prontas (Math.max, etc).
         *
         */

//        int[] array = new int[5];
//
//        array[0] = 4;
//        array[1] = 23;
//        array[2] = 456;
//        array[3] = 1233;
//        array[4] = 13455;
//
//        int maior = array[0];
//        int menor = array[0];
//
//        for (int i = 0; i < array.length; i++) {
//
//            if (maior < array[i]) { maior = array[i]; }
//            if (menor > array[i]) { menor = array[i]; }
//
//        }
//
//        System.out.println("Maior: " + maior);
//        System.out.println("Menor: " + menor);

        /*
         * Dado um array de `int`:
         *  - conte quantos valores são pares
         *  - conte quantos são ímpares
         */

//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Quantos valores deseja adicionar? ");
//        int n = scan.nextInt();
//
//        int[] numsImparEPar = new int[n];
//
//        int par = 0;
//        int impar = 0;
//
//        System.out.println(" ");
//
//        for (int i = 0; i < numsImparEPar.length; i++) {
//
//            System.out.print("Valor " + (i+1) + ": ");
//            numsImparEPar[i] = scan.nextInt();
//
//            if (numsImparEPar[i] % 2 == 0) {
//                par++;
//            } else {
//                impar++;
//            }
//        }
//
//        System.out.println("\nQtd. de números Pares..: " + par);
//        System.out.println("Qtd. de números Ímpares: " + impar);

        /*
         * Dado um array de `double`:
         *  1. calcule a média
         *  2. mostre apenas os valores maiores que a média
         */

//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Qtd. de notas: ");
//        int qtdNotas = scan.nextInt();
//
//        double[] notas = new double[qtdNotas];
//
//        double soma = 0;
//        double media;
//
//        System.out.println(" ");
//
//        for (int i = 0; i < notas.length; i++) {
//
//            System.out.print("Nota " + (i+1) + ": ");
//            notas[i] = scan.nextDouble();
//
//            soma += notas[i];
//
//        }
//
//        media = soma / notas.length;
//
//        System.out.print("\nValores maiores que a média: ");
//
//        for (int j = 0; j < notas.length; j++) {
//
//            if (media < notas[j]) {
//                System.out.print(String.format("%.1f", notas[j]) + "  ");
//            }
//
//        }


        /*
         * Dado um array:
         *  - mostre os valores do último para o primeiro
         *  - não é criar outro array, é só mostrar invertido.
         */

//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Qtd. de números do array: ");
//        int qtdNums = scan.nextInt();
//
//        double[] array = new double[qtdNums];
//
//        System.out.println(" ");
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.print("Valor " + (i + 1) + ": ");
//            array[i] = scan.nextDouble();
//        }
//
//        System.out.print("\nValores invertidos: ");
//
//        for (int j = (array.length - 1); j >= 0; j--) {
//            System.out.print(array[j] + "  ");
//        }

        /*
         * Dado um array de temperaturas:
         *  - mostre quais dias tiveram temperatura maior que o dia anterior
         *
         * Exemplo de saída:
         *      Dia3 teve temperatura maior que o dia2
         */

//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Qtd. de temperaturas: ");
//        int qtdTemp = scan.nextInt();
//
//        double[] temps = new double[qtdTemp];
//
//        double diaAtual = 0;
//        double diaAnterior = 0;
//
//        System.out.println(" ");
//
//        for (int i = 0; i < temps.length; i++) {
//
//            System.out.print("Temperatura do dia " + (i + 1) + ": ");
//            temps[i] = scan.nextDouble();
//        }
//
//        for (int j = 1; j < temps.length; j++) {
//
//            diaAnterior = temps[j - 1];
//            diaAtual = temps[j];
//
//            if (diaAtual > diaAnterior) {
//                System.out.println("Dia " + (j+1) + " com temperatura maior que dia " + j);
//            }
//        }

        /*
         * Dado um array de números inteiros pequenos (ex: 1 a 10):
         *  - conte quantas vezes cada número aparece
         *  - aqui você vai precisar pensar bem em loops.
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a quantidade de valores que o array irá ter: ");
        int qtdValores = scan.nextInt();

        int[] valores = new int[qtdValores];

        int[] contador = new int[10];

        System.out.println(" ");

        for (int i = 0; i < valores.length; i++) {
            System.out.print("Valor " + (i+1) + ": ");
            valores[i] = scan.nextInt();

            if (valores[i] >= 1 && valores[i] <= 10) { contador[valores[i] - 1]++; }

        }

        System.out.println(" ");

        for (int j = 0; j <= (contador.length - 1); j++) {
            System.out.println("Valor " + (j + 1) + " se repete: " + contador[j] + " vezes.");
        }
    }
}