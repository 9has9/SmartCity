package com.company.controller;

import com.company.model.Library;
import com.company.model.LibraryManager;

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


    //Library

    public static void createTableForLibraries() throws SQLException {

        makeConnection();

        String creatTableSQL = "CREATE TABLE IF NOT EXISTS Libraries (id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, Name TEXT, District TEXT, OwnerFirstName TEXT, OwnerLastName TEXT, EstablishedYear TEXT, OwnerNumber TEXT);";

        statement.executeUpdate(creatTableSQL);

        closeConnection();
    }

    public static void deleteTableOfLibraries() throws SQLException {

        makeConnection();

        String deleteTableSQL = "DROP TABLE Libraries";

        statement.execute(deleteTableSQL);

        closeConnection();
    }

    public static int insertLibrary(Library library) throws SQLException {

        makeConnection();

        String insertSQL = String.format("insert into Libraries (Name, District, OwnerFirstName, OwnerLastName, EstablishedYear, OwnerNumber) values" +
                "('%s', '%s', '%s', '%s', '%s', '%s')",library.getName(), library.getDistrict(), library.getOwnerFirstName(), library.getOwnerLastName(), library.getEstablishedYear(), library.getOwnerNumber());

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


    //Library Manager

    public static void createTableForLibraryManagers() throws SQLException {

        makeConnection();

        String creatTableSQL = "CREATE TABLE IF NOT EXISTS Library Managers (id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, FirstName TEXT, LastName TEXT, NationalCode INTEGER, Age INTEGER, Gender TEXT, PhoneNumber INTEGER, Address TEXT, UserName TXT, Password TXT);";

        statement.executeUpdate(creatTableSQL);

        closeConnection();
    }

    public static void deleteTableOfLibraryManagers() throws SQLException {

        makeConnection();

        String deleteTableSQL = "DROP TABLE LibraryManagers";

        statement.execute(deleteTableSQL);

        closeConnection();
    }

    public static int insertLibraryManager(LibraryManager libraryManager) throws SQLException {

        makeConnection();

        String insertSQL = String.format("insert into Library Managers (FirstName, LastName, NationalCode, Age, Gender, PhoneNumber, Address, UserName, Password) values" +
                "('%s', '%s', %d, %d, '%s', %d, '%s, '%s', '%s')",libraryManager.getFirstName(), libraryManager.getLastName(), libraryManager.getNationalCode(), libraryManager.getAge(), libraryManager.getGender(), libraryManager.getPhoneNumber(), libraryManager.getUserName(), libraryManager.getPassword());

        statement.execute(insertSQL, Statement.RETURN_GENERATED_KEYS);

        ResultSet re = statement.getGeneratedKeys();
        re.next();
        int id = re.getInt(1);

        closeConnection();

        return id;
    }

    public static void deleteLibraryManager(LibraryManager libraryManager) throws SQLException {

        makeConnection();

        String deleteSQL = String.format("delete from Library Managers where id = %d", libraryManager.getId());

        statement.execute(deleteSQL);

        closeConnection();
    }

    public static ArrayList<LibraryManager> getAllLibraryManagers() throws SQLException {

        makeConnection();

        String selectSQL = "select * from Library Managers";

        ResultSet re = statement.executeQuery(selectSQL);

        ArrayList<LibraryManager> libraryManagers = new ArrayList<>();

        while (re.next()) {
            libraryManagers.add(new LibraryManager(re.getInt(1), re.getString(2)
                    , re.getString(3), re.getInt(4), re.getInt(5)
                    , re.getString(6), re.getInt(7), re.getString(8)
                    , re.getString(9), re.getString(10)));
        }

        closeConnection();

        return libraryManagers;
    }

    public static void updateLibraryManager(LibraryManager libraryManager) throws SQLException {

        makeConnection();

        String updateSQL = String.format("update Library Managers set FirstName = '%s', LastName = '%s', NationalCode = %d" +
                        ", Age = %d, Gender = '%s', PhoneNumber = %d, Address = '%s', UserName = '%s', Password = '%s' where id = %d"
                , libraryManager.getFirstName(), libraryManager.getLastName(), libraryManager.getNationalCode(), libraryManager.getAge()
                , libraryManager.getGender(), libraryManager.getPhoneNumber(), libraryManager.getAddress(), libraryManager.getUserName()
                , libraryManager.getPassword());

        statement.execute(updateSQL);

        closeConnection();
    }


}
