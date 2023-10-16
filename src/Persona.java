import java.util.Date;

public class Persona {
    private String nome;
    private String sesso;
    private int annoNascita;

    public Persona(String nome, String sesso, int annoNascita) {
        this.nome = nome;
        this.sesso = sesso;
        this.annoNascita = annoNascita;
    }

    public String toString() {
        return "{" +
                "\"nome\":\"" + this.nome + "\"," +
                "\"sesso\":\"" + this.sesso + "\"," +
                "\"annoNascita\":" + this.annoNascita +
                "}";
    }
}
