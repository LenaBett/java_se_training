package com.systechafrica.assignments.shoppos;

import com.systechafrica.part3.jdbc.Task;
import com.systechafrica.part3.logging.FileLogging;

import java.io.File;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.logging.Logger;

public class Item {
    private final String code;
    private final String name;
    private final double unitPrice;
    private static final Logger LOGGER = Logger.getLogger(FileLogging.class.getName());


    public Item(String code, String name, double unitPrice) {
        this.code = code;
        this.name = name;
        this.unitPrice = unitPrice;
    }

    public void save() {
        try {
            Connector connector = new DbConnector();

            String insertQuery = "insert into items (code, name, unit_price) values (?,?,?);";
            PreparedStatement preparedStatement = connector.prepareStatement(insertQuery);

            preparedStatement.setString(1, code);
            preparedStatement.setString(2, name);
            preparedStatement.setDouble(3, unitPrice);

            preparedStatement.executeUpdate();


            preparedStatement.close();

            connector.close();

        }catch (SQLException e) {
            LOGGER.severe("Error " + e.getMessage());
        }


    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }


}