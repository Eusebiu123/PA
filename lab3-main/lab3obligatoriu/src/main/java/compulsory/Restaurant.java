package compulsory;

import java.time.LocalTime;

public class Restaurant extends Location implements Classifiable {
    private String descriere;
    private String coordonate;

    Restaurant() {

    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", pret=" + pret +
                ", descriere='" + descriere + '\'' +
                ", coordonate='" + coordonate + '\'' +
                '}';
    }

    Restaurant(String name) {
        this.name = name;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public void setCoordonate(String coordonate) {
        this.coordonate = coordonate;
    }

    public String getCoordonate() {
        return coordonate;
    }

    public void setPret(double pret) {
        pret = 400;
    }


    public void setRang(int rang) {
        rang = 4;
    }
}
