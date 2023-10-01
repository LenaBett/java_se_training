package com.systechafrica.assignments.shoppos;

import java.sql.*;
import java.util.logging.Logger;

public class DbConnector implements Connector {
    private static final Logger LOGGER = Logger.getLogger(DbConnector.class.getName());
    Connection connection;

    private void startConnection() {
        try {
            String connectionUrl = "jdbc:mysql://localhost:3306/javase";
            String user = "root";
            String password = "Lena2540";
            connection = DriverManager.getConnection(connectionUrl, user, password);


            Statement statement = connection.createStatement();

            statement.execute("CREATE TABLE IF NOT EXISTS items(code VARCHAR(5) PRIMARY KEY, name VARCHAR(255) NOT NULL,unit_price DOUBLE)");

            statement.close();


        } catch (SecurityException e) {
            LOGGER.severe("Database error " + e.getMessage());
        } catch (SQLException e) {
            LOGGER.severe("Database operation failure " + e.getMessage());
        } catch (Exception e) {
            LOGGER.severe("Oops! An error occurred " + e.getMessage());
        }
    }

    @Override
    public void close() throws SQLException {
        connection.close();
    }

    @Override
    public PreparedStatement prepareStatement(String query) throws SQLException {
        startConnection();
        return connection.prepareStatement(query);
    }
}


