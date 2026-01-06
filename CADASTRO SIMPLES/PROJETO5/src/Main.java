import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Cria o leitor de dados do teclado
        Scanner scanner = new Scanner(System.in);

        //Solicita o nome
        System.out.print("Digite seu nome: ");
        String name = scanner.nextLine();


        //Solicita a idade
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        //Verifica se é maior de idade
        if (idade >= 18) {
            System.out.print("Ola " + name +", você é maior de idade. ");
        } else {
            System.out.print("Olá " + name + ", você é menor de idade. ");
        }

        //Fechar o scanner
        scanner.close();


    }
}