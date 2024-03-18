
import java.util.LinkedList;

public class LinkedListBuildIn {
    public static void main(String[] args) {
        Autohaus<Auto> autohaus_west = new Autohaus<>();
        Autohaus<Auto> autohaus_sued = new Autohaus<>();

        Auto bmwX5_1 = new Auto("BMW", "X-5", 2020, 986578);
        Auto mercedesBenzG_1 = new Auto("Mercedes-Benz", "G-Klasse", 2018, 986570);
        Auto mercedesBenzG_2 = new Auto("Mercedes-Benz", "G-Klasse", 2019, 986575);
        Auto audiA4_1 = new Auto("Audi", "A4", 2022, 986589);
        Auto vwGolf_1 = new Auto("Volkswagen", "Golf", 2023, 986591);
        Auto fordMustang_1 = new Auto("Ford", "Mustang", 2021, 986595);
        Auto toyotaCamry_1 = new Auto("Toyota", "Camry", 2023, 986597);
        Auto hondaCivic_1 = new Auto("Honda", "Civic", 2022, 986599);
        Auto chevySilverado_1 = new Auto("Chevrolet", "Silverado", 2023, 986601);
        Auto jeepWrangler_1 = new Auto("Jeep", "Wrangler", 2022, 986603);
        Auto subaruOutback_1 = new Auto("Subaru", "Outback", 2024, 986605);


        autohaus_sued.addToGarage(
                mercedesBenzG_2,
                mercedesBenzG_1,
                audiA4_1,
                vwGolf_1
        );

        autohaus_west.addToGarage(
                bmwX5_1,
                fordMustang_1,
                toyotaCamry_1,
                hondaCivic_1,
                chevySilverado_1,
                jeepWrangler_1,
                subaruOutback_1
        );
        System.out.println("********** Garage SÜD: **********");
        autohaus_sued.printGarage(); // Ausgabe der Garage
        System.out.println("********** Garage WEST: **********");
        autohaus_west.printGarage();


    }
}
class Autohaus<T>{
    LinkedList<T> garage = new LinkedList<>();
    public void addToGarage(T... autos){
        for (T auto : autos)
            garage.add(auto);
    }
    public void printGarage(){
        for (T auto : garage){
            Auto angezeigtesAuto = (Auto) auto;
            System.out.println("Hersteller: " + angezeigtesAuto.getHersteller());
            System.out.println("Modell: " + angezeigtesAuto.getModel());
            System.out.println("Baujahr: " + angezeigtesAuto.getBj());
            System.out.println("ID: " + angezeigtesAuto.getId());
            System.out.println();
        }
    }
}
class Auto{
    private String hersteller;
    private String model;
    private int bj;
    private int id;

    Auto (String hersteller, String model, int bj, int id){
        this.hersteller = hersteller;
        this.model = model;
        this.bj = bj;
        this.id = id;
    }
    public String getHersteller(){
        return hersteller;
    }

    public String getModel() {
        return model;
    }

    public int getBj() {
        return bj;
    }

    public int getId() {
        return id;
    }
    public String getAutoInfo() {
        return "Hersteller: " + hersteller + ", Modell: " + model + ", Baujahr: " + bj + ", ID: " + id;
    }
}
