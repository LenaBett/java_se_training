package com.systechafrica.part2.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcDemo {
    public static void main(String[] args) {
        try {
            DataAccess mysql = new MysqlDataAccess();
            mysql.connect();
            ResultSet itemsResultSet = mysql.executeQuery("SELECT * from items");
            while (itemsResultSet.next()) {
                String itemId = itemsResultSet.getString("id");
                String itemDescription= itemsResultSet.getString("description");
                System.out.println("ID: " + itemId + "  Description:  " + itemDescription);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

}
