package compulsory;

import java.time.LocalTime;

public class Church extends Location implements Visitable {

    private LocalTime openHour;
    private LocalTime closeHour;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    Church() {
    }

    @Override
    public String toString() {
        return "Church{" +
                "openHour=" + openHour +
                ", closeHour=" + closeHour +
                ", name='" + name + '\'' +
                ", pret=" + pret +
                '}';
    }

    Church(String name) {
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

    @Override
    public LocalTime getOpenHour() {
        return openHour;
    }

    @Override
    public LocalTime getCloseHour() {
        return closeHour;
    }

}
