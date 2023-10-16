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

    public String toString() {
        return "{" +
                super.toStringInner() + "," +
                "\"ruolo\":\"" + this.ruolo + "\"," +
                "\"numeroMaglia\":" + this.numeroMaglia +
                "}";
    }
}
