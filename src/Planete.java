public class Planete {
    private final String nom;
    private final double diametre;
    private final double masse;
    private final String etat;
    static public int nombreDePlanete=0;
    public int population;

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
                ", diametre=" + diametre +
                ", masse=" + masse +
                ", etat='" + etat + '\'' +
                ", population=" + population +
                '}';
    }
    @Override
    public void finalize(){
        nombreDePlanete--;
    }
}
