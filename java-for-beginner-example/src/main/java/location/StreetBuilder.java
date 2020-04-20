package location;

public class StreetBuilder {
    public static void streets() {
        Street[] streets = new Street[10];
        streets[0] = new Street();
        streets[1] = new Street("Voronezh");
        streets[2] = new Street("Piter");
        streets[3] = new Street("Piter", "super city", "129");
        streets[4] = new Street("Moscow", "super puoer city", "232");
        streets[5] = new Street();
        streets[6] = new Street();
        streets[7] = new Street();
        streets[8] = new Street();
        streets[9] = new Street();

        for (int i=0; i<streets.length; i++){
            Street street = streets[i];
            System.out.println(street);

        }
    }
}
