package se.citerus.oredev2015;


import org.junit.Test;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.temporal.TemporalUnit;

public class TimeTest {

    @Test
    public void marathonPace() {

        int distance = 42195;
        Duration duration = Duration.ofHours(4);
        Duration pace = duration.dividedBy(distance).multipliedBy(1000);
        System.out.println(pace);
    }


}
