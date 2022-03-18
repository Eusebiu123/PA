package optional;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Location> locatii = new ArrayList<>();
        City oras = new City();
        oras.setNodes(locatii);
        Hotel v1 = new Hotel("Hotel");
        Museum v2 = new Museum("Museum A");
        Museum v3 = new Museum("Museum B");
        Church v4 = new Church("Church A");
        Church v5 = new Church("Church B");
        Restaurant v6 = new Restaurant("Restaurant");
        v2.setOpenHour(LocalTime.of(8, 45));
        v2.setCloseHour(LocalTime.of(21, 23));
        v3.setOpenHour(LocalTime.of(6, 00));
        v3.setCloseHour(LocalTime.of(23, 00));
        v4.setOpenHour(LocalTime.of(7, 45));
        v4.setCloseHour(LocalTime.of(17, 23));
        v5.setOpenHour(LocalTime.of(10, 45));
        v5.setCloseHour(LocalTime.of(23, 23));
        oras.addLocation(v1);
        oras.addLocation(v2);
        oras.addLocation(v3);
        oras.addLocation(v4);
        oras.addLocation(v5);
        oras.addLocation(v6);
        oras.afisare();
        oras.filtrare();
        oras.sortare();
        System.out.println();
        oras.afisarelista();
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
//        System.out.print("De la nodul "+v1.getName()+" putem ajunge la nodurile: ");
//        v1.afisare();
//        System.out.println();
//        System.out.print("De la nodul "+v2.getName()+" putem ajunge la nodurile: ");
//        v2.afisare();
//        System.out.println();
//        System.out.print("De la nodul "+v3.getName()+" putem ajunge la nodurile: ");
//        v3.afisare();
//        System.out.println();
//        System.out.print("De la nodul "+v4.getName()+" putem ajunge la nodurile: ");
//        v4.afisare();
//        System.out.println();
//        System.out.print("De la nodul "+v5.getName()+" putem ajunge la nodurile: ");
//        v5.afisare();
//        System.out.println();
    }
}
