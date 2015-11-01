package se.citerus.oredev2015.jdbc;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class PostgreSqlTest {

    public void writeLocalDateTime() {

        LocalDateTime time = LocalDateTime.of(2015, 11, 5, 12, 10);
        Timestamp timestamp = Timestamp.valueOf(time);


    }

}
