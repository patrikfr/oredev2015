package se.citerus.oredev2015.local;


import org.junit.Test;

import java.time.*;
import java.time.temporal.WeekFields;

import static org.junit.Assert.assertTrue;

public class LocalTest {

    @Test
    public void instant() {
        OredevSchedule oredevSchedule = new OredevSchedule();

        LocalDateTime sessionStart = LocalDateTime.of(2015, 11, 5, 16, 40);
        oredevSchedule.plan(sessionStart, "It's about time!");

        LocalDate birthDate = LocalDate.of(1985, 9, 28);
        LocalTime lunchTime = LocalTime.of(11, 30);
        LocalTime cakeTime = LocalTime.of(14, 0);

        assertTrue(lunchTime.isBefore(cakeTime));
    }

    private class OredevSchedule {
        public void plan(LocalDateTime sessionStart, String sessionTitle) {

        }
    }
}
