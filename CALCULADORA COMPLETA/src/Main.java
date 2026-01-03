import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Solicita os dois numeros
        System.out.print("Digite o primeiro número: ");
        double Number1 = entrada.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double Number2 = entrada.nextDouble();

        //Solicita a operação desejada
        System.out.print("Escolha a operação (+, -, *, /): ");
        char operacao = entrada.next().charAt(0);

        double resultado;

        // Realiza a operação escolhida
        switch (operacao) {
            case '+':
                resultado = Number1 + Number2;
                break;
            case '-':
                resultado = Number1 - Number2;
                break;
            case '*':
                resultado = Number1 * Number2;
                break;
            case '/':
                if (Number2 != 0) {
                    resultado = Number1 / Number2;
                } else {
                    System.out.println("Erro: divisão por zero.");
                    entrada.close();
                    return;
                }
                break;
            default:
                System.out.println("Operação inválida.");
                entrada.close();
                return;

        }
        // Exibe o resultado
        System.out.println("Resultado: " + resultado);

        entrada.close();
    }
}