package com.systechafrica.assignments.libraryMS;

import com.systechafrica.assignments.shoppos.Connector;
import com.systechafrica.part3.logging.FileLogging;

import java.sql.*;
import java.util.logging.Logger;

public class DbConnector implements Connector {
    private static final Logger LOGGER = Logger.getLogger(FileLogging.class.getName());
    Connection connection;

    private void startConnection() {
        try {
            String connectionUrl = "jdbc:mysql://localhost:3306/javase";
            String user = "root";
            String password = "Lena2540";
            connection = DriverManager.getConnection(connectionUrl, user, password);


            Statement statement = connection.createStatement();

            statement.execute("CREATE TABLE IF NOT EXISTS book(bookId INT AUTO_INCREMENT PRIMARY KEY, isbn VARCHAR(10), title VARCHAR(255), status VARCHAR(20))");

            statement.execute("create table IF NOT EXISTS student(studentId INT AUTO_INCREMENT PRIMARY KEY, number VARCHAR(10), name VARCHAR(50) NOT NULL, status VARCHAR(20) NOT NULL)");

            statement.close();


        } catch (SecurityException e) {
            LOGGER.severe("Database error " + e);
        } catch (SQLException e) {
            LOGGER.severe("Database operation failure " + e);
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