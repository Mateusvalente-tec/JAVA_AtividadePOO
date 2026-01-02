package java_curso;

public class Humano extends SerVivo {

    public String name;

    public Humano() {
        super(42);
        this.name = "Mateus";

    }

    @Override
    public void respirar() {
        System.out.println("Inalando e exalando oxigênio CO2");

    }

}
