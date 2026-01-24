import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        *
        * O Sr. Manoel Joaquim expandiu seus negócios para além dos negócios de 1,99
        * e agora possui uma loja de conveniências. Faça um programa que implemente uma
        * caixa registradora rudimentar. O programa deverá receber um número desconhecido
        * de valores referentes aos preços das mercadorias. Um valor zero deve ser informado
        * pelo operador para indicar o final da compra. O programa deve então mostrar o total
        * da compra e perguntar o valor em dinheiro que o cliente forneceu, para então calcular
        * e mostrar o valor do troco. Após esta operação, o programa deverá voltar ao ponto
        * inicial, para registrar a próxima compra. A saída deve ser conforme o exemplo abaixo:
            - Lojas Tabajara
            - Produto 1: R$ 2.20
            - Produto 2: R$ 5.80
            - Produto 3: R$ 0
            - Total: R$ 8.00
            - Dinheiro: R$ 20.00
            - Troco: R$ 12.00
            - ...
        */

//        Scanner scan = new Scanner(System.in);
//
//        double prod = 0;
//        int count = 1;
//        double soma = 0;
//        double dinheiroDoCliente = 0;
//        double troco = 0;
//        String msg = "N";
//
//        System.out.println("Loja Tabajara\n");
//        do {
//            do {
//                System.out.print("Produto " + count + ": R$ ");
//                prod = scan.nextDouble();
//
//                if (prod != 0) {
//                    soma += prod;
//                    count++;
//                }
//
//                if (prod == 0) {
//                    System.out.println("\nTotal: R$ " + String.format("%.2f", soma));
//
//                    do {
//                        System.out.print("Dinheiro: R$ ");
//                        dinheiroDoCliente = scan.nextDouble();
//
//                        if (dinheiroDoCliente < soma) {
//                            System.out.println("\nSaldo insuficiente.\n");
//                        }
//                    } while(dinheiroDoCliente < soma);
//                        troco = dinheiroDoCliente - soma;
//                        System.out.println("Troco: R$ " + String.format("%.2f", troco));
//                }
//
//            } while (prod != 0);
//
//            System.out.print("\nDeseja fazer uma nova compra? (S/N): ");
//            msg = scan.next();
//
//            if (msg.equals("s") || msg.equals("S")) {
//                count = 1;
//                prod = 0;
//                soma = 0;
//            } else {
//                System.out.println("\nSaindo do sistema...");
//            }
//
//        } while (msg.equals("s") || msg.equals("S"));


        /*
         *
         * Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
         * Ex.: 5! = 5.4.3.2.1 = 120. A saída deve ser conforme o exemplo abaixo:
            - Fatorial de: 5
            - 5! = 5 . 4 . 3 . 2 . 1 = 120
         */

//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Fatorial de: ");
//        int fat = scan.nextInt();
//
//        System.out.print("\n" + fat + "! = ");
//
//        for (int i = (fat - 1); i >= 2; i--) {
//
//            fat *= i;
//            System.out.print(i + " . ");
//        }
//
//        System.out.println("1 = " + fat);

        /*
         *
         * O Departamento Estadual de Meteorologia lhe contratou para desenvolver um programa que leia
         * as um conjunto indeterminado de temperaturas, e informe ao final a menor e a maior temperatura
         * informada, bem como a média das temperaturas.
         */

//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("\nDigite 0 nas temperaturas para parar o cadastro de temperaturas.\n");
//
//        System.out.print("Digite a temperatura " + 1 + ": ");
//        double temp = scan.nextDouble();
//
//        int i = 2;
//        int qtd = 0;
//        double soma  = temp;
//        double menor = temp;
//        double maior = temp;
//        double media;
//
//        do {
//
//            System.out.print("Digite a temperatura " + i + ": ");
//            temp = scan.nextDouble();
//
//            soma += temp;
//            qtd++;
//
//            if (temp == 0) { break; }
//            if (temp < menor) { menor = temp; }
//            if (temp > maior) { maior = temp; }
//
//            i++;
//
//        } while(temp != 0);
//
//        media = soma / qtd;
//
//        System.out.println("\nA menor temperatura é: " + menor);
//        System.out.println("A maior temperatura é: " + maior);
//        System.out.println("A média é............: " + media);


        /*
         *
         * Desenvolva um programa que faça a tabuada de um número qualquer inteiro que será digitado
         * pelo usuário, mas a tabuada não deve necessariamente iniciar em 1 e terminar em 10, o valor
         * inicial e final devem ser informados também pelo usuário, conforme exemplo abaixo:
            - Montar a tabuada de: 5
            - Começar por: 4
            - Terminar em: 7
            - Vou montar a tabuada de 5 começando em 4 e terminando em 7:
            - 5 X 4 = 20
            - 5 X 5 = 25
            - 5 X 6 = 30
            - 5 X 7 = 35
            - Obs: Você deve verificar se o usuário não digitou o final menor que o inicial.
         */

//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("\nMontar a tabuada de: ");
//        int n = scan.nextInt();
//
//        System.out.print("Começando por......: ");
//        int first = scan.nextInt();
//
//        System.out.print("Finalizando em.....: ");
//        int last = scan.nextInt();
//
//        System.out.println("\nTabuada de " + n + " começando em " + first + " terminando em " + last + ":\n");
//
//        if (first > last) {
//            System.out.println("\nO número final deve ser maior que o início.\n");
//        } else {
//
//            for (int i = first; i <= last; i++) {
//
//                int result = n * i;
//
//                System.out.println(n + " X " + i + " = " + result);
//
//            }
//
//        }

        /*
         *
         * Uma academia deseja fazer um senso entre seus clientes para descobrir o mais alto, o mais baixo,
         * o mais gordo e o mais magro, para isto você deve fazer um programa que pergunte a cada um dos
         * clientes da academia seu código, sua altura e seu peso. O final da digitação de dados deve ser
         * dada quando o usuário digitar 0 (zero) no campo código. Ao encerrar o programa também deve ser
         * informados os códigos e valores do cliente mais alto, do mais baixo, do mais gordo e do mais
         * magro, além da média das alturas e dos pesos dos clientes.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("--------------------------");
        System.out.println("|  Academia > Hope 23 <  |");
        System.out.println("--------------------------");
        System.out.println(" ");

        System.out.print("Digite o código do cliente " + 1 + ": ");
        int cod = scan.nextInt();

        System.out.print("Digite a altura do cliente " + 1 + ": ");
        double alt = scan.nextDouble();

        System.out.print("Digite o peso do cliente " + 1 + ": ");
        double peso = scan.nextDouble();

        int i = 2;
        int contador = 1;

        double menorPeso = peso;
        int codMenorPeso = cod;
        double maiorPeso = peso;
        int codMaiorPeso = cod;

        double menorAltura = alt;
        int codMenorAltura = cod;
        double maiorAltura = alt;
        int codMaiorAltura = cod;

        double somaPeso = peso;
        double somaAtura = alt;

        double mediaPeso, mediaAltura;

        while(cod != 0) {

            System.out.print("\nDigite o código do cliente " + i + ": ");
            cod = scan.nextInt();

            if (cod == 0) { break; }

            System.out.print("Digite a altura do cliente " + i + ": ");
            alt = scan.nextDouble();

            System.out.print("Digite o peso do cliente " + i + ": ");
            peso = scan.nextDouble();

            somaAtura += alt;
            somaPeso += peso;
            contador++;

            if (alt < menorAltura) { menorAltura = alt; codMenorAltura = cod; }
            if (alt > maiorAltura) { maiorAltura = alt; codMaiorAltura = cod; }

            if (peso < menorPeso) { menorPeso = peso; codMenorPeso = cod; }
            if (peso > maiorPeso) { maiorPeso = peso; codMaiorPeso = cod; }

            i++;

            System.out.println(" ");

        }

        mediaAltura = somaAtura / contador;
        mediaPeso   = somaPeso / contador;

        System.out.println("\nCliente mais magro: " + codMenorPeso);
        System.out.println("Peso: " + menorPeso + " Kg");

        System.out.println("\nCliente mais gordo: " + codMaiorPeso);
        System.out.println("Peso: " + maiorPeso + " Kg");

        System.out.println("\nCliente mais alto: " + codMaiorAltura);
        System.out.println("Altura: " + maiorAltura + " m");

        System.out.println("\nCliente mais baixo: " + codMenorAltura);
        System.out.println("Altura: " + menorAltura + " m");

        System.out.println("\nPeso médio..: " + String.format("%.2f", mediaPeso) + " Kg");
        System.out.println("Altura média: " + String.format("%.2f",mediaAltura) + " m");

        /*
         *
         * Um funcionário de uma empresa recebe aumento salarial anualmente. Sabe-se que:
            - Esse funcionário foi contratado em 1995, com salário inicial de R$ 1.000,00;
            - a. Em 1996 recebeu aumento de 1,5% sobre seu salário inicial;
            - b. A partir de 1997 (inclusive), os aumentos salariais sempre correspondem ao dobro do percentual
                *  do ano anterior. Faça um programa que determine o salário atual desse funcionário.
                *  Após concluir isto, altere o programa permitindo que o usuário digite o salário inicial
                *  do funcionário.
         */



        /*
         *
         * Faça um programa que leia dez conjuntos de dois valores, o primeiro representando o número do
         * aluno e o segundo representando a sua altura em centímetros.
         * Encontre o aluno mais alto e o mais baixo.
         * Mostre o número do aluno mais alto e o número do aluno mais baixo, junto com suas alturas.
         */



        /*
         *
         * Foi feita uma estatística em cinco cidades brasileiras para coletar dados sobre acidentes de trânsito.
         * Foram obtidos os seguintes dados:
            - Código da cidade;
            - a. Número de veículos de passeio (em 1999);
            - b. Número de acidentes de trânsito com vítimas (em 1999).
            - Deseja-se saber:
            - c. Qual o maior e menor índice de acidentes de trânsito e a que cidade pertence;
            - d. Qual a média de veículos nas cinco cidades juntas;
            - e. Qual a média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio.
         */



        /*
         *
         * Faça um programa que receba o valor de uma dívida e mostre uma tabela com os seguintes dados:
         * valor da dívida, valor dos juros, quantidade de parcelas e valor da parcela. Os juros e a quantidade
         * de parcelas seguem a tabela abaixo:
            - (Tabela de Juros: 1 parcela - 0%, 3 parcelas - 10%, 6 parcelas - 15%,
            *   9 parcelas - 20%, 12 parcelas - 25%)
         */



        /*
         *
         * Faça um programa que leia uma quantidade indeterminada de números positivos e conte quantos deles
         * estão nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100]. A entrada de dados deverá
         * terminar quando for lido um número negativo.
         */



    }
}