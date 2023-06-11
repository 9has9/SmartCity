package com.company.controller;

import com.company.model.Library;

import java.sql.*;

public class DataBase {

    private static Connection connection;
    private static Statement statement;

    public DataBase () {
        makeConnection();
        creatTableForLibraries();

    }

    private static void makeConnection() {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:SmartCity.db");
            statement = connection.createStatement();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void creatTableForLibraries() {
        String tableSQL = "CREATE TABLE IF NOT EXISTS Libraries (Name TEXT,District TEXT , OwnerFirstName TEXT, OwnerLastName TEXT,EstablishedYear TEXT,OwnerNumber TEXT );";
        try {
            statement.executeUpdate(tableSQL);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int insertLibrary(Library library) {
        makeConnection();

        String insertSQL = "INSERT INTO Libraries (Name,District,OwnerFirstName,OwnerLastName,EstablishedYear,OwnerNumber) VALUES" +
                " ('" + library.getName() + "','" + library.getDistrict() + "','" + library.getOwnerFirstName() + "','" + library.getOwnerLastName() + "','" + library.getEstablishedYear() + "','" + library.getOwnerNumber() + "');";

        /*try {
            statement.executeUpdate(insertSQL, Statement.RETURN_GENERATED_KEYS);
            System.out.println("inserted person");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            System.out.println(e.getMessage() + "person");
            e.printStackTrace();
        }*/

        ResultSet re = null;
        int id = 0;
        try {
            statement.executeUpdate(insertSQL, Statement.RETURN_GENERATED_KEYS);

            re = statement.getGeneratedKeys();
            re.next();
            id = re.getInt(1);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return id;
    }

}
