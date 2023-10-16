public class Calciatore extends Persona {
    private String ruolo;
    private int numeroMaglia;

    public Calciatore(
            String nome, String sesso, int annoNascita,
            String ruolo, int numeroMaglia
    ) {
        super(nome, sesso, annoNascita);
        this.ruolo = ruolo;
        this.numeroMaglia = numeroMaglia;
    }

    public String getRuolo() {
        return ruolo;
    }

    public int getNumeroMaglia() {
        return numeroMaglia;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }

    public void setNumeroMaglia(int numeroMaglia) {
        this.numeroMaglia = numeroMaglia;
    }

    public String toString() {
        return "{" + toStringInner() + "}";
    }

    public String toStringInner() {
        return super.toStringInner() + "," +
                "\"ruolo\":\"" + this.ruolo + "\"," +
                "\"numeroMaglia\":" + this.numeroMaglia;
    }
}
