package com.company.controller;

import com.company.model.Library;

import java.sql.*;
import java.util.ArrayList;

public class DataBase {

    private static Connection connection;
    private static Statement statement;

    private DataBase () {}

    private static void makeConnection() {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:SmartCity.db");
            statement = connection.createStatement();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void closeConnection() {
        if (connection != null) {
            try {
                statement.close();
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void creatTableForLibraries() {

        makeConnection();

        String tableSQL = "CREATE TABLE IF NOT EXISTS Libraries (id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL ,Name TEXT,District TEXT , OwnerFirstName TEXT, OwnerLastName TEXT,EstablishedYear TEXT,OwnerNumber TEXT );";

        try {
            statement.executeUpdate(tableSQL);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        closeConnection();
    }

    public static int insertLibrary(Library library) throws SQLException {

        makeConnection();

        String insertSQL = String.format("insert into Libraries (Name, District, OwnerFirstName, OwnerLastName, EstablishedYear, OwnerNumber) values" +
                "('%s', '%s', '%s', '%s', '%s', '%s')",library.getName(), library.getDistrict(), library.getOwnerFirstName(), library.getOwnerLastName(), library.getEstablishedYear(), library.getOwnerNumber());

        /*String insertSQL = "INSERT INTO Libraries (Name,District,OwnerFirstName,OwnerLastName,EstablishedYear,OwnerNumber) VALUES" +
                //" ('" + library.getName() + "','" + library.getDistrict() + "','" + library.getOwnerFirstName() + "','" + library.getOwnerLastName() + "','" + library.getEstablishedYear() + "','" + library.getOwnerNumber() + "');";

        try {
            statement.executeUpdate(insertSQL, Statement.RETURN_GENERATED_KEYS);
            System.out.println("inserted person");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            System.out.println(e.getMessage() + "person");
            e.printStackTrace();
        }*/

        statement.execute(insertSQL, Statement.RETURN_GENERATED_KEYS);

        ResultSet re = statement.getGeneratedKeys();
        re.next();
        int id = re.getInt(1);

        closeConnection();

        return id;
    }

    public static void deleteLibrary(Library library) throws SQLException {

        makeConnection();

        String deleteSQL = String.format("delete from Libraries where id = %d", library.getId());

        statement.execute(deleteSQL);

        closeConnection();
    }

    public static ArrayList<Library> getAllLibraries() throws SQLException {

        makeConnection();

        String selectSQL = "select * from Libraries";

        ResultSet re = statement.executeQuery(selectSQL);

        ArrayList<Library> libraries = new ArrayList<>();

        while (re.next()) {
            libraries.add(new Library(re.getInt(1), re.getString(2), re.getString(3)
                    , re.getString(4), re.getString(5), re.getString(6)
                    , re.getString(7)));
        }

        closeConnection();

        return libraries;
    }

    public static void updateLibrary(Library library) throws SQLException {

        makeConnection();

        String updateSQL = String.format("update Libraries set Name = '%s', District = '%s', OwnerFirstName = '%s'" +
                ", OwnerLastName = '%s', EstablishedYear = '%s', OwnerNumber = '%s' where id = %d", library.getName()
                , library.getDistrict(), library.getOwnerFirstName(), library.getOwnerLastName()
                , library.getEstablishedYear(), library.getOwnerNumber(), library.getId());

        statement.execute(updateSQL);

        closeConnection();
    }

}
