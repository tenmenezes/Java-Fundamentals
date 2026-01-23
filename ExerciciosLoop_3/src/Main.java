import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        * 1)
        * Faça um programa que peça um número inteiro e determine se ele é ou não um número primo.
        * Um número primo é aquele que é divisível somente por ele mesmo e por 1.
        */

        /*
        * Não preciso guardar o resultado do cálculo, preciso apenas
        * guardar se aqueles números são primos ou não,
        * os únicos números que são verificados como primo é o próprio número e 1
        * caso todos os outros dêem resto igual a 0, o loop para pois achou
        * um valor que confirma aquele número como não-primo
        */

//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Digite um número inteiro: ");
//        int num = scan.nextInt();
//
//        boolean encontrouDivisor = false;
//        if(num > 1) {
//            for (int i = (num - 1); i >= 2; i--) {
//
//                if (num % i == 0) {
//                    encontrouDivisor = true;
//                    break;
//                }
//            }
//
//            if (encontrouDivisor) {
//                System.out.println("\nEste número não é primo.");
//            } else {
//                System.out.println("\nEste número é primo.");
//            }
//        } else {
//            System.out.println("\nNão é primo.");
//        }

        /*
         * 2)
         * Altere o programa de cálculo dos números primos, informando, caso o número não seja primo,
         * por quais números ele é divisível.
         */

//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Digite um número inteiro: ");
//        int num = scan.nextInt();
//
//        boolean encontrouDivisor = false;
//
//        int result = 0;
//
//        if(num > 1) {
//            for (int i = (num - 1); i >= 2; i--) {
//
//                if (num % i == 0) {
//                    encontrouDivisor = true;
//                    break;
//                }
//            }
//
//            if (encontrouDivisor) {
//                System.out.println("\nEste número não é primo.");
//
//                System.out.print("Ele é divisível por: ");
//                for (int j = (num - 1); j >= 2; j--) {
//                    result = num % j;
//
//                    if (result == 0) {
//                        System.out.print(j + " ");
//                    }
//                }
//                System.out.println(" ");
//            } else {
//                System.out.println("\nEste número é primo.");
//            }
//        } else {
//            System.out.println("\nNão é primo.");
//        }

        /*
         * 3)
         * Faça um programa que mostre todos os primos entre 1 e N sendo N um número inteiro fornecido pelo usuário.
         * O programa deverá mostrar também o número de divisões que ele executou para encontrar os números primos.
         * Serão avaliados o funcionamento, o estilo e o número de testes (divisões) executados.
         */

//        OutPut esperado (ao meu ver):
//        Digite um número: 8

//        Números primos entre 1 e 8: 7 5 3 2
//        Número de divisões feitas: 25

//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Digite um numero inteiro: ");
//        int n = scan.nextInt();
//
//        int numeroDeDivisoes = 0;
//
//        System.out.println(" ");
//
//        System.out.print("Os números primos entre 1 e " + n + " são: ");
//
//        for (int i = n; i >= 2; i--) {
//            int numeroDeDivisoesExatas = 0;
//            for (int j = 2; j <= i; j++) {
//                numeroDeDivisoes++;
//                if (i % j == 0) {
//                    numeroDeDivisoesExatas++;
//                }
//            }
//            if (numeroDeDivisoesExatas == 1) {
//                System.out.print(i + " ");
//            }
//        }
//        System.out.println("\nNúmero de divisões efetuadas: " + numeroDeDivisoes);

        /*
         * 4)
         * Faça um programa que calcule e mostre a média aritmética de N notas.
         */

//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Quantidade de notas que deseja calcular: ");
//        int n = scan.nextInt();
//
//        if (n <= 1) {
//            System.out.println("\nErro: O sistema precisa de um número acima de 1 nota para calcular a média.");
//        } else {
//
//            double soma = 0;
//            double media = 0;
//
//            for (int i = 1; i <= n; i++) {
//
//                System.out.print("Digite a nota " + i + ": ");
//                double nota = scan.nextDouble();
//
//                soma += nota;
//
//            }
//
//            media = soma / n;
//
//            System.out.println("\nSua média é: " + media);
//        }

        /*
         * 5)
         * Faça um programa que peça para n pessoas a sua idade, ao final o programa deverá verificar
         * se a média de idade da turma varia entre 0 e 25, 26 e 60 e maior que 60; e então,
         * dizer se a turma é jovem, adulta ou idosa, conforme a média calculada.
         */

//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Quantidade de pessoas que deseja cadastrar a idade: ");
//        int n = scan.nextInt();
//
//        if (n <= 1) {
//            System.out.println("\nErro: número de pessoas precisa ser maior que 1.");
//        } else {
//
//            int soma = 0;
//            double media = 0;
//
//            for (int i = 1; i <= n; i++) {
//
//                System.out.print("Idade da pessoa " + i + ": ");
//                int idade = scan.nextInt();
//
//                soma += idade;
//            }
//
//            media = soma / n;
//
//            System.out.print("\nA idade média da turma é: " + media);
//
//            if (media > 0 && media <= 25) {
//
//                System.out.println("\nA turma é jovem.");
//
//            } else if (media > 25 && media < 60) {
//
//                System.out.println("\nA turma é adulta.");
//
//            } else {
//
//                System.out.println("\nA turma é idosa.");
//
//            }
//        }

        /*
         * 6)
         * Numa eleição existem três candidatos. Faça um programa que peça o número total de eleitores.
         * Peça para cada eleitor votar e ao final mostrar o número de votos de cada candidato.
         */

//        output esperado na minha visão:

//        digite o numero de eleitores: 4

//        Eleitor 1 pode votar em: Candidato 1 | Candidato 2 | Candidato 3

//        Digite em qual deseja votar ( 1 | 2 | 3 ): 1

//        Eleitor 2 pode votar em: Candidato 1 | Candidato 2 | Candidato 3

//        Digite em qual deseja votar ( 1 | 2 | 3 ): 2

//        Eleitor 3 pode votar em: Candidato 1 | Candidato 2 | Candidato 3

//        Digite em qual deseja votar ( 1 | 2 | 3 ): 3

//        Eleitor 4 pode votar em: Candidato 1 | Candidato 2 | Candidato 3

//        Digite em qual deseja votar ( 1 | 2 | 3 ): 3

//
//        Total de votos de cada candidato:

//        Candidato 1: 1 votos
//        Candidato 2: 1 votos
//        Candidato 3: 2 votos


//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Digite o numero de eleitores: ");
//        int n = scan.nextInt();
//
//        if (n <= 0) {
//
//            System.out.println("\nErro: O número de eleitores tem que ser maior que 0.");
//
//        } else {
//
//            int votos1 = 0;
//            int votos2 = 0;
//            int votos3 = 0;
//
//            for (int i = 1; i <= n; i++) {
//
//                System.out.println("\nEleitor " + i + " pode votar em: Candidato 1 | Candidato 2 | Candidato 3");
//
//                int voto = 0;
//
//                do {
//
//                    System.out.print("\nDigite em qual deseja votar ( 1 | 2 | 3 ): ");
//                    voto = scan.nextInt();
//
//                    if (!(voto > 0 && voto <= 3)) {
//                        System.out.println("Erro: Só pode votar em candidatos de 1 a 3. Tente novamente.");
//                    }
//
//                } while (voto < 1 || voto > 3);
//
//                if (voto == 1) {
//                    votos1++;
//                } else if (voto == 2) {
//                    votos2++;
//                } else if (voto == 3) {
//                    votos3++;
//                }
//            }
//
//                System.out.println("\nTotal de votos por candidato: ");
//
//                System.out.println("\nCandato 1: " + votos1 + " votos");
//                System.out.println("Candato 2: " + votos2 + " votos");
//                System.out.println("Candato 3: " + votos3 + " votos");
//
//        }


        /*
         * 7)
         * Faça um programa que calcule o número médio de alunos por turma. Para isto, peça a quantidade de turmas
         * e a quantidade de alunos para cada turma. As turmas não podem ter mais de 40 alunos.
         */

//        output esperado:

//        Digite a quantidade de turmas que o sistema deverá ter: 2

//        Turma 1
//        Digite a quantidade de alunos para essa turma: 4

//        Turma 2
//        Digite a quantidade de alunos para essa turma: 4

//        Número médio de alunos por turma: 4.0

//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Digite a quantidade de turmas que o sistema deverá ter: ");
//        int turmas = scan.nextInt();
//
//        if (turmas > 1) {
//            System.out.println("Número de turmas incorreto.");
//        } else {
//            int soma     = 0;
//            double media = 0;
//
//            for (int i = 1; i <= turmas; i++) {
//
//                System.out.println("\nTurma " + i);
//
//                int qtdAlunos = 0;
//
//                do {
//
//                    System.out.print("Digite a quantidade de alunos para essa turma: ");
//                    qtdAlunos = scan.nextInt();
//
//                    if (qtdAlunos > 40) {
//                        System.out.println("\nErro: A quantidade de alunos não pode exceder 40. Tente Novamente.\n");
//                    }
//
//                } while (qtdAlunos > 40);
//
//                soma += qtdAlunos;
//
//            }
//
//            media = soma / turmas;
//
//            System.out.println("\nNúmero médio de alunos por turma: " + media);
//        }

        /*
         * 8)
         * Faça um programa que calcule o valor total investido por um colecionador em sua coleção de CDs
         * e o valor médio gasto em cada um deles. O usuário deverá informar a quantidade de CDs e o valor
         * de cada um.
         */

//        output esperado:

//        Digite a quantidade de CDs adquiridos: 4

//        valor do CD 1: 4
//        valor do CD 2: 4
//        valor do CD 3: 4
//        valor do CD 4: 4

//        Total gasto: 16
//        Valor médio gasto em cada um: 4

//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Digite a quantidade de CDs adquiridos: ");
//        int qtdCds = scan.nextInt();
//
//        if (qtdCds <= 0) {
//            System.out.println("A quantidade precisa ser maior que 0.");
//        } else {
//            double soma = 0;
//            double media = 0;
//
//            System.out.println(" ");
//
//            for (int i = 1; i <= qtdCds; i++) {
//
//                System.out.print("Valor do CD " + i + ": ");
//                double valorCD = scan.nextDouble();
//
//                soma += valorCD;
//
//            }
//
//            media = soma / qtdCds;
//
//            System.out.println("\nTotal gasto.................: " + soma);
//            System.out.println("Valor médio gasto em cada um: " + media);
//        }

        /*
         * 9)
         * O Sr. Manoel Joaquim possui uma grande loja de artigos de R$ 1,99, com cerca de 10 caixas.
         * Para agilizar o cálculo de quanto cada cliente deve pagar ele desenvolveu uma tabela que contém
         * o número de itens que o cliente comprou e ao lado o valor da conta. Desta forma a atendente
         * do caixa precisa apenas contar quantos itens o cliente está levando e olhar na tabela de preços.
         * Você foi contratado para desenvolver o programa que monta esta tabela de preços, que conterá os
         * preços de 1 até 50 produtos, conforme o exemplo abaixo:
            - Lojas Quase Dois - Tabela de preços
            - 1 - R$ 1.99
            - 2 - R$ 3.98
            - ...
            - 50 - R$ 99.50
         */

//        double preco = 1.99;
//
//        System.out.println("Lojas Quase Dois - Tabela de preços\n");
//
//        for (int i = 1; i <= 50; i++) {
//
//            System.out.println(i + " - " + "R$ " + String.format("%.2f", i * preco));
//
//        }

        /*
         * 10)
         * O Sr. Manoel Joaquim acaba de adquirir uma panificadora e pretende implantar a metodologia da tabelinha,
         * que já é um sucesso na sua loja de 1,99. Você foi contratado para desenvolver o programa que monta a tabela
         * de preços de pães, de 1 até 50 pães, a partir do preço do pão informado pelo usuário, conforme o exemplo
         * abaixo:
            - Preço do pão: R$ 0.18
            - Panificadora Pão de Ontem - Tabela de preços
            - 1 - R$ 0.18
            - 2 - R$ 0.36
            - ...
            - 50 - R$ 9.00
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Preço do pão: R$ ");
        double pao = scan.nextDouble();

        System.out.println("\nPanificadora Pão de Ontem - Tabela de preços");

        for (int i = 1; i <= 50; i++) {

            System.out.println(i + " - " + "R$ " + String.format("%.2f", pao * i));

        }

    }
}