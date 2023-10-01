package com.systechafrica.assignments.shoppos;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public interface Connector {
    void close() throws SQLException;

    PreparedStatement prepareStatement(String insertQuery) throws SQLException;
}
