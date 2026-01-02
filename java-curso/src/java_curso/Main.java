package java_curso;

// public -> acessível de todo lugar
// default -> quando não tem nenhum modificador de acesso.
// private -> acessível somente dentro da classe que foi definido
// protected -> acessivel por todo mundo que esta no mesmo pacote

import java.util.concurrent.LinkedTransferQueue;

public class Main {

    public static void teste() {
        System.out.println("Teste");
    }

    public static void main(String[] args) {
        Carro meuCarro = new Sandero();
        Carro meuCarro2 = new Mobi();

        SerVivo meuSer = new Humano();
        meuSer.respirar();

        Carro meuCarroFurado = null;

        try {
            for (int i = 0; i < 50; i++) {
                meuCarro.acelerar();

            }
        } catch (NullPointerException exception) {
            System.out.println("Vender carro furado");
        }
    }
}


