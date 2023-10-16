public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("Carlo", "Maschio", 1998);
        System.out.println(p.toString());

        Persona p2 = (Persona) p.clone();
        System.out.println(p2.toString());
    }
}