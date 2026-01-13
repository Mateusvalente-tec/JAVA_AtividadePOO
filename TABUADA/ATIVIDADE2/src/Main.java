import java.util.Scanner;

public class Main{
    public static void main (String [] args){

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int Num = entrada.nextInt(); // le o numero digitado

        for (int i = 1; i <=10; i++){
            int resultado = Num * i;
            System.out.println(Num + " x " + i + " = " + resultado);

        }

        entrada.close(); // Boa pratica para fechar scanner
    }
}