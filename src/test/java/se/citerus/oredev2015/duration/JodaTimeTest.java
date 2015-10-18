package se.citerus.oredev2015.duration;


import org.joda.time.Duration;
import org.joda.time.Period;
import org.junit.Test;

public class JodaTimeTest {

    @Test
    public void marathonPace() {
        int distance = 42195;
        Duration goal = Duration.standardHours(4);
        Period pace = goal.dividedBy(distance).multipliedBy(1000).toPeriod();
        System.out.printf("Pace: %s:%s", pace.getMinutes(), pace.getSeconds());
    }
}
