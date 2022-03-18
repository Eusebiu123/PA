package optional;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Problem p = new Problem();
        Source S1 = new Warehouse();
        Source S2 = new Warehouse();
        Source S3 = new Factory();
        Destination D1 = new Destination();
        Destination D2 = new Destination();
        Destination D3 = new Destination();
        S1.setCapacity(10);
        S1.setName("S1");
        S2.setCapacity(35);
        S2.setName("S2");
        S3.setCapacity(25);
        S3.setName("S3");
        D1.setDemand(20);
        D1.setName("D1");
        D2.setDemand(25);
        D2.setName("D2");
        D3.setDemand(25);
        D3.setName("D3");
        Solutie s = new Solutie();
        s.solutie(S1, S2, S3, D1, D2, D3);
    }
}
