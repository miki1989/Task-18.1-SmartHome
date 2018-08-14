package pl.miki1989.pogoda;

import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import java.util.concurrent.ThreadLocalRandom;

@Component
public class StacjaPogodowa {
    public static final Map<Integer, String> myMap = createMap();

    public static Map<Integer, String> createMap() {
        Map<Integer, String> myMap = new TreeMap<>();
        myMap.put(0, "Jest słonecznie. ");
        myMap.put(1, "Jest pochmurno. ");
        return myMap;
    }



    Random random = new Random();

    int randy = ThreadLocalRandom.current().nextInt(-25,35);


    public String print(){
        return "Stacja pogodowa pobiera dane o pogodzie";
    }

    public String weatherDescription(){
        return "Dzień dobry. Dzisiejsza temperatura to " + randy + "*C. ";
    }
    int check = random.nextInt(2);

    public String varia() {
        switch (check) {
            case 0:
                System.out.print(myMap.get(0));
                System.out.println("Życze miłego dnia");
                break;
            case 1:
                System.out.print(myMap.get(1));
                System.out.println("Życze miłego dnia");
                break;
            default:
                System.out.println("Szklana pogoda");
        }
        return " ";
    }
}
