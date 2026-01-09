import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<>();

        System.out.print("Quantos alunos deseja cadastrar? ");
        int quantidade = entrada.nextInt();
        entrada.nextLine(); // consome o enter que ficou no buffer

        for (int i = 0; i < quantidade; i++) {
            System.out.println("\nCadastro do aluno " + (i + 1));

            System.out.print("Nome: ");
            String nome = entrada.nextLine();

            System.out.print("Idade: ");
            int idade = entrada.nextInt();

            System.out.print("Nota final: ");
            double nota = entrada.nextDouble();
            entrada.nextLine(); // consumir quebra de linha

            alunos.add(new Aluno(nome, idade, nota));
        }
        System.out.println("Lista de alunos cadastrados: ");
        for (Aluno aluno : alunos) {
            aluno.mostrarDados();
            aluno.verificarAprovacao();
            System.out.println("--------------------------");
        }
    }

}


