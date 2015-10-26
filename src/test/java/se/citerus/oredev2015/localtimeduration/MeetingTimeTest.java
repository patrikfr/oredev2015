package se.citerus.oredev2015.localtimeduration;


import org.junit.Test;

import java.time.Duration;
import java.time.LocalTime;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MeetingTimeTest {

    @Test
    public void meetingTime() {
        LocalTime lunchOClock = LocalTime.of(11, 30);
        LocalTime meetingStart = LocalTime.of(10, 0);
        Duration meetingDuration = Duration.ofHours(2);
        if (lunchOClock.isAfter(meetingStart.plus(meetingDuration))) {
            System.out.println("Lunch is happening!");
        } else {
            System.out.println("No lunch for you.");
        }
    }
}
