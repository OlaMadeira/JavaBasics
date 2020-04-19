package lesson;

import location.City;

public class NullKey {
    public static void nullKey() {
        City[] cityArray = new City[10];
        cityArray[0] = new City(100, "msk");
        cityArray[1] = new City(100, "vrn");
        cityArray[2] = new City(100, "spb");

        for (int i = 0; i < cityArray.length; i++) {
            City city = cityArray[i];

            if(city != null){
                System.out.println(city.key);
            } else {
                System.out.println("null element");
            }
        }
    }
}
