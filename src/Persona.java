public class Persona {
    private String nome;
    private String sesso;
    private int annoNascita;
    private int numeroScarpe;

    public Persona(String nome, String sesso, int annoNascita, int numeroScarpe) {
        this.nome = nome;
        this.sesso = sesso;
        this.annoNascita = annoNascita;
        this.numeroScarpe = numeroScarpe;
    }

    public Persona(Persona persona) {
        this.nome = persona.nome;
        this.sesso = persona.sesso;
        this.annoNascita = persona.annoNascita;
        this.numeroScarpe = persona.numeroScarpe;
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

    public int getNumeroScarpe() {
        return this.numeroScarpe;
    }

    public void setNumeroScarpe(int numeroScarpe) {
        this.numeroScarpe = numeroScarpe;
    }

    public Object clone() {
        return new Persona(this.nome, this.sesso, this.annoNascita, this.numeroScarpe);
    }

    public String toString() {
        return "{" + toStringInner() + "}";
    }

    public String toStringInner() {
        return "\"nome\":\"" + this.nome + "\"," +
                "\"sesso\":\"" + this.sesso + "\"," +
                "\"annoNascita\":" + this.annoNascita + "," +
                "\"numeroScarpe\":" + this.numeroScarpe;
    }
}
