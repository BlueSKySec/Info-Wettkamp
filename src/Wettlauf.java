import java.util.Random;
/**
 * @author 
 * @version 
 */
public class Wettlauf
{
    // Bezugsobjekte

    // Attribute
    private Laeufer[] laeuferfeld;
    private Random rnd;
    private double qualizeit = 0.0;

    // Konstruktor
    private Wettlauf()
    {   
        laeuferfeld = new Laeufer[8];
        rnd = new Random();
    }

    // Konstruktor
    public Wettlauf(double qualizeit)
    {
        this();
        this.qualizeit = qualizeit;
    }

    // Dienste
    
    public void anDenStart() {
        String[] namen = {"Alice","Bob","Chris", "Dave", "Emily","Frank","Gustav", "Heino"};
        //Ihr Code hier. Die Namen oben sind fuer die Erzeugung der Laufenden.
        for (int i= 0; i < namen.length; i++){
            laeuferfeld[i] = new Laeufer(namen[i]);

        }
    }
    
    public void zeitMessen() {
        for (int i = 0; i < laeuferfeld.length; i++) {
            Laeufer laeufer = laeuferfeld [i];
            double zeit = rnd.nextDouble();
            laeufer.setzeZeit(zeit);
        }
    }

    public void evaluateQuali() {
        for (int i = 0; i < laeuferfeld.length; i++) {
            Laeufer laeufer = laeuferfeld [i];
            double zeit = laeufer.gibZeit();
            if (zeit<= qualizeit) {
                laeufer.qualifiziere();
            }
        }
    }


    
    public void rennenLaufen() {
        anDenStart();
        zeitMessen();
        sortieren();
        evaluateQuali();
        ausgeben();
                
        //Qualifizieren
        
    }

    public void sortieren (){
        for(int n = laeuferfeld.length - 1; n > 0; n--) {
            for(int j = 0; j < n; j++) {
                Laeufer l1 = laeuferfeld[j];
                Laeufer l2 = laeuferfeld[j + 1];
                if (l1.gibZeit() > l2.gibZeit()) {
                    laeuferfeld[j] = l2;
                    laeuferfeld[j + 1] = l1;
                }
            }
        }
    }
    
    public void ausgeben(){
        for(int k=0; k<8;k++) {
            System.out.print(""+(k+1)+". Platz: " + laeuferfeld[k].gibName() + " mit " + laeuferfeld[k].gibZeit()+".");
            if(laeuferfeld[k].istQualifiziert()) {
                System.out.println(" Q ");
            }
            else{
                System.out.println("");
            }
        }
    }
    public static void main(String[] args) {
        Wettlauf lauf = new Wettlauf(1.15);
        lauf.rennenLaufen();

    }
}
