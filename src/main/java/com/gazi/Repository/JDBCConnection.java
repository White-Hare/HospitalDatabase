package com.gazi.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public abstract class JDBCConnection {

    Connection connection;
    DbHelper helper;
    Statement statement;
    ResultSet resultSet;
    PreparedStatement preparedStatement;

    public abstract String connectionStatus() throws SQLException;
}
