package com.buzilov.lab4db.datastorage;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.sql.*;

@Component
public class DataStorageJdbc {
    private static final String url = "jdbc:mysql://localhost:3306/philharmonic";
    private static final String login = "root";
    private static final String password = "qwert";

    Connection con;
    Statement statement;

    @PostConstruct
    public void init() throws SQLException {
        con = DriverManager.getConnection(url,login,password);
        statement = con.createStatement();
    }

    public ResultSet executeQuery(String query) throws SQLException {
        return statement.executeQuery(query);
    }

    public int executeUpdate(String query) throws SQLException{
        return  statement.executeUpdate(query);
    }

    public DataStorageJdbc() throws SQLException {
    }
}
