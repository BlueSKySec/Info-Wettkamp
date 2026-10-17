
/**
 * @author 
 * @version 
 */
public class Laeufer
{
    // Bezugsobjekte

    // Attribute
    private String name;
    private double zeit;
    private boolean qualifiziert;
    // Konstruktor
    public Laeufer(String pName)
    {
        name=pName;
        zeit=0.0;
        qualifiziert = false;
    }
 
    // Dienste
    public String gibName() {
        return name;
    }
    
    public double gibZeit() {
        return zeit;
    }
    
    public boolean istQualifiziert() {
        return qualifiziert;
    }
    
    public void setzeZeit(double pZeit) {
        zeit = pZeit;
    }
    
    public void qualifiziere() {
        qualifiziert=true;
    }
}
