package se.citerus.oredev2015;


import org.junit.Test;

import java.time.Duration;

public class TimeTest {

    @Test
    public void marathonPace() {
        int distance = 42195;
        Duration goal = Duration.ofHours(4);
        Duration pace = goal.dividedBy(distance).multipliedBy(1000);
        System.out.println(pace);
    }
}
