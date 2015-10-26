package se.citerus.oredev2015.localtimeduration;


import org.junit.Test;

import java.time.Duration;
import java.time.LocalTime;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MeetingTimeTest {

    @Test
    public void meetingTime() {
        LocalTime meetingStart = LocalTime.of(10, 0);
        Duration duration = Duration.ofHours(2);
        assertThat(meetingStart.plus(duration), is(LocalTime.of(12, 0)));
    }
}
