package optional;

import java.util.HashMap;
import java.util.Map;

public class Location {
    public String name;
    public double pret;
    private Map<Location, Integer> cost = new HashMap<>();

    public String getName() {
        return name;
    }

    public double getPret() {
        return pret;
    }

    public Map<Location, Integer> getCost() {
        return cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public void setCost(Map<Location, Integer> cost) {
        this.cost = cost;
    }

    public void addCost(Location node, int value) {
        cost.put(node, value);
    }

    public void afisare() //afisam map
    {
        cost.forEach((key, value) -> System.out.print(key + ":" + value + " , "));

    }


}
