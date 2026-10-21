public class Felix extends Mensch {



    // Konstruktoren
    public Felix() {
        super();
    }

    public Felix(String name) {
        super(name);
    }

    public static void main(String[] args) {
        Felix felix = new Felix("Felix");
        System.out.println(felix.getName());
    }
}
