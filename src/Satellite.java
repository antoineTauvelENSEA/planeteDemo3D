import java.awt.event.MouseMotionListener;

public class Satellite extends Planete{
    private final Planete centre;

    public Satellite(String nom, double diametre, double masse, Planete centre) {
        super(nom, diametre, masse, "Tellurique");
        this.centre = centre;
    }

    @Override
    public String toString() {
        return "Satellite{" +
                "nom='" + nom + '\'' +
                ", population=" + population +
                ", centre=" + centre +
                '}';
    }

    @Override
    public void augmentePopulation(int nouveauxHabitants) {
        this.population+=nouveauxHabitants;
        if (population>centre.population){
            int temp=(this.population+centre.population)/2;
            this.population=temp;
            centre.population=temp;
        }
    }
}
