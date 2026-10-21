public class Patient {
    
    private String name;
    private String kasse;

    public Patient(String pName, String pKasse) {
        name = pName;
        kasse = pKasse;
    }

    public String getName() {
        return name;
    }

    public String getKasse() {
        return kasse;
    }
    
    public String toString() {
        return name;
    }

}