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
    }
}
