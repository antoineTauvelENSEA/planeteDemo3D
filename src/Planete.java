import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Planete implements MouseMotionListener {
    protected final String nom;
    protected final double diametre;
    protected final double masse;
    protected final String etat;
    static public int nombreDePlanete=0;
    protected int population;

    public Planete(String nom, double diametre, double masse, String etat) {
        this.nom = nom;
        this.diametre = diametre;
        this.masse = masse;
        this.etat = etat;
        this.population=0;
        nombreDePlanete++;
    }

    @Override
    public String toString() {
        return "Planete{" +
                "nom='" + nom + '\'' +
                ", population=" + population +
                '}';
    }
    @Override
    public void finalize(){
        nombreDePlanete--;
    }

    public void augmentePopulation( int nouveauxHabitants){
        this.population+=nouveauxHabitants;
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
