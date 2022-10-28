import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Planete terre= new Planete ("Terre",11000,5e27,"Tellurique");
        Planete mars= new Planete ("Mars",8000,3e27,"Tellurique");

        terre.augmentePopulation(100);

        Satellite lune = new Satellite("Lune",3400, 7.6e22,terre);

        System.out.println(terre);
        System.out.println(mars);
        System.out.println(lune);

        System.out.println("Nombre de planete : "+terre.nombreDePlanete);

        lune.augmentePopulation(150);
        System.out.println(terre);
        System.out.println(lune);

        ArrayList<Planete> systemeSolaire = new ArrayList<>();

        String nom[]={"Mercure","Venus","Terre","Mars","Jupiter","Saturne","Uranus","Neptune" };

        Random rd = new Random();

        for(String s : nom){
            systemeSolaire.add(new Planete(s,rd.nextInt(100000),rd.nextInt(100000000),"Tellurique"));
        }

        String satt[]={"Lune","Io","Pluton","Europe"};
        for(String s : satt){
            systemeSolaire.add(new Satellite(s,rd.nextInt(100000),
                    rd.nextInt(100000000),
                    systemeSolaire.get(rd.nextInt(8))));
        }

        for (Planete p : systemeSolaire)
        {
            p.augmentePopulation(rd.nextInt(200));
        }
        for (Planete p : systemeSolaire)
        {
            p.augmentePopulation(rd.nextInt(200));
        }

        for (Planete p : systemeSolaire)
        {
            System.out.println(p);
        }

    }
}
