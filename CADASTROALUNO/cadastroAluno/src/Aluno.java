public class Aluno {
    String nome;
    int idade;
    double notaFinal;

    public Aluno(String nome, int idade, double notaFinal) {
        this.nome = nome;
        this.idade = idade;
        this.notaFinal = notaFinal;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Nota Final: " + notaFinal);
    }

    public void verificarAprovacao() {
        if (notaFinal >= 6) {
            System.out.println("✅Apravado!");
        } else {
            System.out.println("❌ Reprovado!");
        }
    }
}
