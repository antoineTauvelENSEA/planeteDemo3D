public class Main {

    public static void main(String[] args) {
	// write your code here
        Planete terre= new Planete ("Terre",11000,5e27,"Tellurique");
        Planete mars= new Planete ("Mars",8000,3e27,"Tellurique");

        mars=terre;
        terre.population=2;

        System.gc();

        System.out.println(terre);
        System.out.println(mars);

        System.out.println("Nombre de planete : "+terre.nombreDePlanete);
    }
}
