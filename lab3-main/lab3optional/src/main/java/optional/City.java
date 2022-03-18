package optional;

import java.util.ArrayList;
import java.util.List;

public class City {
    private List<Location> nodes = new ArrayList<>();
    List<Location> lista = new ArrayList<>();

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

    public void afisare() {// afisam fiecare element din lista
        for (int i = 0; i < nodes.size(); i++)
            System.out.println(nodes.get(i));
    }

    public void filtrare() { //luam acele obiecte care sunt instante ale visitable si le punem intr o lista noua
        for (int i = 0; i < nodes.size(); i++) {
            if (nodes.get(i) instanceof Visitable)
                lista.add(nodes.get(i));
        }
    }

    public void sortare() { // sortam lista
        lista.sort((loc1, loc2) -> {
            if ((loc1 instanceof Visitable) && (loc2 instanceof Visitable)) {
                return ((Visitable) loc1).getOpenHour().compareTo(((Visitable) loc2).getOpenHour());
            }
            return 0;
        });
    }

    public void afisarelista() {
        for (int i = 0; i < lista.size(); i++)
            System.out.println(lista.get(i));
    }

}
