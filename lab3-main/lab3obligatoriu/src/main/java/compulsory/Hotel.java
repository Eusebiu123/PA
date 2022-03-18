package compulsory;

import java.time.LocalTime;

public class Hotel extends Location implements Classifiable {
    private String name;
    private String descriere;
    private String coordonate;
    private int oraDeschidere;
    private int oraInchidere;

    Hotel() {

    }

    Hotel(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", descriere='" + descriere + '\'' +
                ", coordonate='" + coordonate + '\'' +
                ", oraDeschidere=" + oraDeschidere +
                ", oraInchidere=" + oraInchidere +
                ", name='" + name + '\'' +
                ", pret=" + pret +
                '}';
    }

    public String getName() {
        return name;
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

    public void setOraDeschidere(int oraDeschidere) {
        this.oraDeschidere = oraDeschidere;
    }

    public void setOraInchidere(int oraInchidere) {
        this.oraInchidere = oraInchidere;
    }


    public void setPret(double pret) {
        pret = 100;
    }


    public void setRang(int rang) {
        rang = 3;
    }
}
