public class Persona {
    private String nome;
    private String sesso;
    private int annoNascita;

    public Persona(String nome, String sesso, int annoNascita) {
        this.nome = nome;
        this.sesso = sesso;
        this.annoNascita = annoNascita;
    }

    public String getNome() {
        return nome;
    }

    public String getSesso() {
        return sesso;
    }

    public int getAnnoNascita() {
        return annoNascita;
    }

    public Object clone() {
        return new Persona(this.nome, this.sesso, this.annoNascita);
    }

    public String toString() {
        return "{" +
                "\"nome\":\"" + this.nome + "\"," +
                "\"sesso\":\"" + this.sesso + "\"," +
                "\"annoNascita\":" + this.annoNascita +
                "}";
    }
}
