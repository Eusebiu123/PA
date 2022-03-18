package compulsory;

import java.util.*;

public class City {
    private List<Location> nodes = new ArrayList<>();

    public void setNodes(List<Location> nodes) {
        this.nodes = nodes;
    }

    public List<Location> getNodes() {
        return nodes;
    }

    public City() {

    }

    public void addLocation(Location node) {
        nodes.add(node);
    }

    public City(List<Location> nodes) {
        this.nodes = nodes;
    }

    public void afisare() {
        for (int i = 0; i < nodes.size(); i++)
            System.out.println(nodes.get(i));
    }
}
