package se.citerus.oredev2015.jdbc;

import org.junit.Test;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.UUID;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PostgreSqlTest {

    private static final String UID = "uid";
    private static final String PWD = "pwd";
    private static final String CONN_STRING = "jdbc:postgresql://localhost:5432/oredev";

    @Test
    public void writeLocalDateTime() throws Exception {

        try (Connection connection = DriverManager.getConnection(CONN_STRING, UID, PWD)) {
            LocalDateTime time = LocalDateTime.of(2015, 11, 5, 12, 10);
            Timestamp timestamp = Timestamp.valueOf(time);
            final String id = UUID.randomUUID().toString();

            final PreparedStatement writeStatement = connection.prepareStatement("INSERT INTO time VALUES (?, ?, ?)");
            writeStatement.setString(1, id);
            writeStatement.setTimestamp(2, timestamp);
            writeStatement.setTimestamp(3, timestamp);
            writeStatement.executeUpdate();
        }
    }

    @Test
    public void readLocalDateTime() throws Exception {

        System.out.println(Calendar.getInstance().getTimeZone().getDisplayName(false, TimeZone.SHORT));

        try (Connection connection = DriverManager.getConnection(CONN_STRING, UID, PWD)) {
            LocalDateTime time = LocalDateTime.of(2015, 11, 5, 12, 10);

            final Statement qryStatement = connection.createStatement();
            final ResultSet rs = qryStatement.executeQuery("SELECT sometime, sometimez FROM time WHERE id = '7da1e06e-5418-47ff-87e0-f9e21a6cdbd5'");
            rs.next();
            final LocalDateTime sometime = rs.getTimestamp("sometime").toLocalDateTime();
            final LocalDateTime sometimez = rs.getTimestamp("sometimez").toLocalDateTime();
            assertThat(sometime, is(time));
            assertThat(sometimez, is(time));

        }
    }
}
