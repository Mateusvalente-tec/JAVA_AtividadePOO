package java_curso;

public abstract class SerVivo {
    protected int idade;

    public void respirar() {
        System.out.println("Respirando genericamente...");
    }

    ;

    public SerVivo(int idade) {
        this.idade = idade;
    }
    /*    public abstract void respirar(); */

}
