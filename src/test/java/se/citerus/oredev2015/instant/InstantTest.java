package se.citerus.oredev2015.instant;


import org.junit.Test;

import java.time.*;
import java.time.temporal.WeekFields;
import java.util.Date;

public class InstantTest {

    @Test
    public void instant() {
        Instant now = Instant.now();
        ZonedDateTime inUtc = now.atZone(ZoneOffset.UTC);
        ZonedDateTime inSin = now.atZone(ZoneId.of("Asia/Singapore"));
        System.out.println("UTC: " + inUtc);
        System.out.println("SIN:" + inSin);
        System.out.println("Chronology: " + inSin.getChronology());

        System.out.println(inSin.get(WeekFields.ISO.weekOfYear()));
    }
}
