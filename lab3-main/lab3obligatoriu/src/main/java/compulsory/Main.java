package compulsory;

import java.time.LocalTime;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        City oras = new City();
        Hotel v1 = new Hotel("Hotel");
        Museum v2 = new Museum("Museum A");
        Museum v3 = new Museum("Museum B");
        Church v4 = new Church("Church A");
        Church v5 = new Church("Church B");
        Restaurant v6 = new Restaurant("Restaurant");
        oras.addLocation(v1);
        oras.addLocation(v2);
        oras.addLocation(v3);
        oras.addLocation(v4);
        oras.addLocation(v5);
        oras.addLocation(v6);
        oras.afisare();
        v1.addCost(v2, 10);
        v1.setOraDeschidere(10);
        v1.addCost(v3, 50);
        v2.addCost(v3, 20);
        v2.addCost(v4, 20);
        v2.addCost(v5, 10);
        v3.addCost(v4, 20);
        v4.addCost(v5, 30);
        v4.addCost(v6, 10);
        v5.addCost(v6, 20);
        System.out.print("De la nodul " + v1.getName() + " putem ajunge la nodurile: ");
        v1.afisare();
        System.out.println();
        System.out.print("De la nodul " + v2.getName() + " putem ajunge la nodurile: ");
        v2.afisare();
        System.out.println();
        System.out.print("De la nodul " + v3.getName() + " putem ajunge la nodurile: ");
        v3.afisare();
        System.out.println();
        System.out.print("De la nodul " + v4.getName() + " putem ajunge la nodurile: ");
        v4.afisare();
        System.out.println();
        System.out.print("De la nodul " + v5.getName() + " putem ajunge la nodurile: ");
        v5.afisare();
        System.out.println();
    }
}
