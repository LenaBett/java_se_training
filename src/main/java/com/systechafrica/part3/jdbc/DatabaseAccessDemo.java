package com.systechafrica.part3.jdbc;

import com.systechafrica.part3.logging.CustomFormatter;
import com.systechafrica.part3.logging.FileLogging;

import java.io.IOException;
import java.sql.*;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class DatabaseAccessDemo {
    private static final Logger LOGGER = Logger.getLogger(FileLogging.class.getName());


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileHandler fileHandler;

        try {
            fileHandler = new FileHandler("working-with-database.txt", true);
            CustomFormatter formatter = new CustomFormatter();
            LOGGER.addHandler(fileHandler);
            fileHandler.setFormatter(formatter);

            //1. Add the jdbc driver to the pom.xml
            //2. Load the database driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //3. Create a connection
            String connectionUrl = "jdbc:mysql://localhost:3306/javase";
            String user = "root";
            String password = "Lena2540";
            Connection connection = DriverManager.getConnection(connectionUrl, user, password);

            //4. Create Statement from yhe connection
            Statement statement = connection.createStatement();

            String createTasksTable = "CREATE TABLE IF NOT EXISTS tasks (task_id INT AUTO_INCREMENT PRIMARY KEY,title VARCHAR(255) NOT NULL,start_date DATE,due_date DATE,status TINYINT NOT NULL,priority TINYINT NOT NULL,description TEXT);";
            // Execute queries
            int updateStatus = statement.executeUpdate(createTasksTable);
            LOGGER.info("Update status: " + updateStatus);


            //Execute insert statements without supplying dynamic data
            // String insertQuery = "insert into tasks (title,start_date,due_date,status,priority,description)values('Add driver to the pom.xml','2023-09-22','2023-09-25',0,1,'updating drivers to the class path');";
            //int numberOfRowsInserted = statement.executeUpdate(insertQuery);
            //LOGGER.info("Number of rows inserted: " + numberOfRowsInserted);


            String insertQuery = "insert into tasks (title,start_date,due_date,status,priority,description)values(?,?,?,?,?,?);";
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);


            //read task details
            Task task = getTaskFromUser(scanner);
            preparedStatement.setString(1, task.getTitle());
            preparedStatement.setString(2, task.getStartDate().toString());
            preparedStatement.setString(3, task.getDueDate().toString());
            preparedStatement.setInt(4, task.getStatus());
            preparedStatement.setInt(5, task.getPriority());
            preparedStatement.setString(6, task.getDescription());
            int noOfRows = preparedStatement.executeUpdate();
            LOGGER.info("Number of Rows" + noOfRows);


            //Execute selection
            String selectQuery = "SELECT * from tasks;";

            ResultSet resultSet = statement.executeQuery(selectQuery);
            while (resultSet.next()) {
                int id = resultSet.getInt("task_id");
                String title = resultSet.getString("title");
                LocalDate startDate = LocalDate.parse(resultSet.getString("start_date"));
                LocalDate dueDate = LocalDate.parse(resultSet.getString("due_date"));
                int status = resultSet.getInt("status");
                int priority = resultSet.getInt("priority");
                String description = resultSet.getString("description");

                //map to object
                Task dbtask = new Task(id, title, startDate, dueDate, status, priority, description);
                System.out.println(dbtask);

            }

            //release resources from bottom up
            resultSet.close();
            preparedStatement.close();
            statement.close();
            connection.close();

        } catch (SecurityException e) {
            LOGGER.severe("Unable to obtain security permissions for the log file " + e.getMessage());
        } catch (IOException e) {
            LOGGER.severe("Unable to obtain read/write permissions for the log file " + e.getMessage());
        } catch (ClassNotFoundException e) {
            LOGGER.severe("Unable to find class for jdbc driver " + e.getMessage());
        } catch (SQLException e) {
            LOGGER.severe("Database operation failure " + e.getMessage());
        } catch (Exception e) {
        e.printStackTrace();
        }

    }

    private static Task getTaskFromUser(Scanner scanner) {
        System.out.println("Enter task title");
        String title = scanner.nextLine();

        System.out.println("Enter task Start date");
        LocalDate startDate = LocalDate.parse(scanner.nextLine());

        System.out.println("Enter task due date");
        LocalDate dueDate = LocalDate.parse(scanner.nextLine());

        System.out.println("Enter task Status");
        int status = scanner.nextInt();

        System.out.println("Enter task Priority");
        scanner.nextLine();
        int priority = scanner.nextInt();

        System.out.println("Enter task description");
        scanner.nextLine();
        String description = scanner.nextLine();

        return new Task(title, startDate, dueDate, status, priority, description);

    }
}
