package co.postgres.sql;

import java.sql.*;

public class PsQlcreateDB {

    static final String DB_URL = "jdbc:postgresql://localhost:2345/docker";
    static final String USER = "postgres";
    static final String PASS = "mysecretpassword";
    static final String QUERY = "SELECT id, first, last, age FROM Registration";

    public static void main(String[] args) {
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();)
           // ResultSet rs = stmt.executeQuery(QUERY))
            {


               String sql = "CREATE TABLE REGISTRATION " +
                        "(id INTEGER not NULL, " +
                        " first VARCHAR(255), " +
                        " last VARCHAR(255), " +
                        " age INTEGER, " +
                        " PRIMARY KEY ( id ))";
                stmt.executeUpdate(sql);
                sql = "INSERT INTO Registration VALUES (100, 'Zara', 'Ali', 18)";
                stmt.executeUpdate(sql);
                sql = "INSERT INTO Registration VALUES (101, 'Mahnaz', 'Fatma', 25)";
                stmt.executeUpdate(sql);
                sql = "INSERT INTO Registration VALUES (102, 'Zaid', 'Khan', 30)";
                stmt.executeUpdate(sql);
                sql = "INSERT INTO Registration VALUES(103, 'Sumit', 'Mittal', 28)";
                stmt.executeUpdate(sql);

                ResultSet rs = stmt.executeQuery(QUERY);

            while(rs.next()){
                //Display values
                System.out.print("ID: " + rs.getInt("id"));
                System.out.print(", Age: " + rs.getInt("age"));
                System.out.print(", First: " + rs.getString("first"));
                System.out.println(", Last: " + rs.getString("last"));

           }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
