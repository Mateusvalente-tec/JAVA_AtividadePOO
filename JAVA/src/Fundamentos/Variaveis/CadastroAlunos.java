package Fundamentos.Variaveis;

import java.util.Scanner;
import java.text.DecimalFormat;

public class CadastroAlunos {
    public static void main(String[] args) {
        // Declarando variaveis de notas.
        Scanner entrada = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("0.0");

        System.out.println("Quantos alunos deseja cadastrar? ");
        int total = entrada.nextInt();
        entrada.nextLine(); //limpar o buffer

        boolean continuar = true;
        while (continuar) {

            System.out.print("Digite o nome do aluno: ");
            String nome = entrada.nextLine();

            System.out.print("Digite a idade: ");
            int idade = entrada.nextInt();

            System.out.print("Digite a altura (ex: 1,60): ");
            double altura = entrada.nextDouble();

            System.out.print("Está matriculado? (true/false): ");
            boolean matriculado = entrada.nextBoolean();

            System.out.print("Digite a seria (ex: A): ");
            char serie = entrada.next().charAt(0);

            System.out.print("Digite a nota da prova 1: ");
            double prova1 = entrada.nextDouble();

            System.out.print("Digite a nota da prova 2: ");
            double prova2 = entrada.nextDouble();

            System.out.print("Digite a nota da prova 3: ");
            double prova3 = entrada.nextDouble();


            // Declarando uma variavel média, portanto devemos somar todos para depois tirar o valor.
            double media = (prova1 + prova2 + prova3) / 3;
        /* % = marcador de valor
           .2 = duas casas decimais
           f = numero decimal
         */

            System.out.println("==== FICHA DO ALUNO ====");
            System.out.println("Nome:" + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Altura: " + formatador.format(altura));
            System.out.println("Matriculado: " + matriculado);
            System.out.println("Serie:" + serie);
            System.out.println("Provas: " + formatador.format(prova1) + "," + formatador.format(prova2) + "," + formatador.format(prova3));
            System.out.println("Média: " + formatador.format(media));
            System.out.println("O valor da média do " + nome + " é " + formatador.format(media));
            if (media >= 7) {
                System.out.println("Situação: Aprovado.");
            } else {
                System.out.println("Situação: Reprovado.");
            }
            System.out.println("=========================");
            System.out.println("Deseja cadastrar outro aluno? (true/false)");
            continuar = entrada.nextBoolean();
            entrada.nextLine(); // limpar o buffer


        }

    }
}