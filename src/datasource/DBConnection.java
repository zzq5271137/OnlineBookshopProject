package datasource;

import java.sql.*;

public class DBConnection {
    // local
    private static final String DB_CONNECTION = "jdbc:postgresql://localhost:5432/bookshop";
    private static final String DB_USER = "postgres";
    private static final String DB_PASSWORD = "ZZQ930603";
    
    // remote
//    private static final String DB_CONNECTION = "jdbc:postgresql://ec2-54-221-214-3.compute-1.amazonaws.com:5432/d7dv19pab1v9m9";
//    private static final String DB_USER = "xxaklhtmqaushi";
//    private static final String DB_PASSWORD = "5604933d43705cf456fd16fece07dd6ab3e950b65c3e69d735783d3147b65bf7";

    public static PreparedStatement prepare(String stm) throws SQLException {
        PreparedStatement preparedStatement = null;
        try {
            Connection dbConnection = getDBConnection();
            preparedStatement = dbConnection.prepareStatement(stm);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return preparedStatement;
    }

    private static Connection getDBConnection() {
        try {
            DriverManager.registerDriver(new org.postgresql.Driver());
            Connection dbConnection = DriverManager
                    .getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
            return dbConnection;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Connection problem");
        return null;
    }
}
