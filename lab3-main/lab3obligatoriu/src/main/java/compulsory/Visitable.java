package compulsory;

import java.time.LocalTime;

public interface Visitable {
    void setOpenHour(LocalTime openHour);

    void setCloseHour(LocalTime closeHour);

    LocalTime getOpenHour();

    LocalTime getCloseHour();


}
