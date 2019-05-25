package com.kodilla.jdbc;

import com.kodilla.jdbc.DbManager;
import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManagerTestSuite {
    @Test
    public void testConnect() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        Assert.assertNotNull(dbManager.getConnection());
    }

    @Test
    public void testSelectUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        Assert.assertEquals(5, counter);
    }

    @Test
    public void testSelectUsersAndPosts() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String query = "SELECT U.LASTNAME, U.FIRSTNAME, COUNT(*) AS POSTS_NUMBER\n" +
                "FROM USERS U\n" +
                "JOIN POSTS P ON P.USER_ID = U.ID\n" +
                "GROUP BY U.ID\n" +
                "HAVING COUNT(*) > 1;";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(query);

        //When
        int counter = 0;
        System.out.println("Users with more than 1 posts:");
        while (rs.next()) {
            System.out.println(rs.getString("FIRSTNAME") + " " +
                    rs.getString("LASTNAME") + " : " +
                    rs.getInt("POSTS_NUMBER"));
            counter++;
        }
        statement.close();
        rs.close();

        Assert.assertEquals(2, counter);
    }
}





