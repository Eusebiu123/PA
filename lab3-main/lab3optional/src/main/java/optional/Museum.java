package optional;

import java.time.LocalTime;

public class Museum extends Location implements Visitable, Payable {
    private LocalTime openHour;
    private LocalTime closeHour;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    Museum() {
    }

    Museum(String name) {
        this.name = name;
    }

    @Override
    public void setOpenHour(LocalTime openHour) {
        this.openHour = openHour;
    }

    @Override
    public void setCloseHour(LocalTime closeHour) {
        this.closeHour = closeHour;
    }

    public LocalTime getOpenHour() {
        return openHour;
    }

    public LocalTime getCloseHour() {
        return closeHour;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "Museum{" +
                "name='" + name + '\'' +
                ", pret=" + pret +
                ", openHour=" + openHour +
                ", closeHour=" + closeHour +
                '}';
    }
}
