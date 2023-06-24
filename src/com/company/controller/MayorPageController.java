package com.company.controller;

import com.company.model.Library;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class MayorPageController implements Initializable {

    @FXML
    private TableView<Library> libraryTBLV;

    @FXML
    private TableColumn<Library, Integer> idTBLC;

    @FXML
    private TableColumn<Library, String> libraryNameTBLC;

    @FXML
    private TableColumn<Library, String> districtTBLC;

    @FXML
    private TableColumn<Library, String> establishedYearTBLC;

    @FXML
    private TableColumn<Library, String> ownerFullNameTBLC;

    @FXML
    private TableColumn<Library, String> firstNameTBLC;

    @FXML
    private TableColumn<Library, String> lastNameTBLC;

    @FXML
    private TableColumn<Library, String> ownerNumberTBLC;

    @FXML
    private Button exitBTN;

    @FXML
    private Button removeBTN;

    @FXML
    private Button editBTN;

    @FXML
    private Button addBTN;

    @FXML
    private Button openBTN;

    static Stage addMayorPageStage = null;

    private Stage loginPageStage;

    private LoginPageController loginPageController;

    @FXML
    void pressAddBTN(ActionEvent event) {
        if (addMayorPageStage == null) {
            openAddMayorPageStage();
        }
    }

    @FXML
    void pressEditBTN(ActionEvent event) {
        if (addMayorPageStage == null && getLibraryTBLV().getSelectionModel().getSelectedItem() != null) {
            openEditMayorpageStage();
        }
    }

    @FXML
    void pressExitBTN(ActionEvent event) {
        if (addMayorPageStage == null) {
            closeStage();
            openLoginPage(getLoginPageStage());
            cleanLoginPage(getLoginPageController());
        }
    }

    @FXML
    void pressOpenBTN(ActionEvent event) {
        if (addMayorPageStage == null && getLibraryTBLV().getSelectionModel().getSelectedItem() != null) {
            openLibraryLoginPageStage();
        }
    }

    @FXML
    void pressRemoveBTN(ActionEvent event) {
        if (addMayorPageStage == null && getLibraryTBLV().getSelectionModel().getSelectedItem() != null) {
            removeLibrary();
            updateTable();
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        Library.createTableForLibraries();

        idTBLC.setCellValueFactory(new PropertyValueFactory<>("id"));
        libraryNameTBLC.setCellValueFactory(new PropertyValueFactory<>("name"));
        districtTBLC.setCellValueFactory(new PropertyValueFactory<>("district"));
        firstNameTBLC.setCellValueFactory(new PropertyValueFactory<>("ownerFirstName"));
        lastNameTBLC.setCellValueFactory(new PropertyValueFactory<>("ownerLastName"));
        establishedYearTBLC.setCellValueFactory(new PropertyValueFactory<>("establishedYear"));
        ownerNumberTBLC.setCellValueFactory(new PropertyValueFactory<>("ownerNumber"));

        ArrayList<Library> libraries = Library.getAllLibraries();

        for (int i = 0; i < libraries.size(); i++) {

            addLibraryToTableView(libraries.get(i));
        }

    }

    private void openLibraryLoginPageStage() {

        closeStage();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/company/view/LibraryLoginPage.fxml"));
        try {
            loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Stage LibraryLoginPageStage = new Stage();
        LibraryLoginPageStage.setScene(new Scene(loader.getRoot()));
        LibraryLoginPageStage.setTitle("Library Login Page");
        LibraryLoginPageStage.setResizable(false);
        LibraryLoginPageStage.show();
    }

    private void openAddMayorPageStage() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/company/view/AddMayorPage.fxml"));
        try {
            loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        AddMayorPageController controller = loader.getController();
        controller.setMayorPageController(this);
        controller.setOpenedAsEdit(false);
        controller.setTextheadLine();

        addMayorPageStage = new Stage();
        addMayorPageStage.setScene(new Scene(loader.getRoot()));
        addMayorPageStage.setResizable(false);
        addMayorPageStage.setTitle("Add Library");
        addMayorPageStage.show();

        addMayorPageStage.setOnCloseRequest(event -> {
            addMayorPageStage = null;
        });
    }

    private void openEditMayorpageStage() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/company/view/AddMayorPage.fxml"));

        try {
            loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Library selectedLibrary = getLibraryTBLV().getSelectionModel().getSelectedItem();
        AddMayorPageController controller = loader.getController();
        controller.setMayorPageController(this);
        controller.setOpenedAsEdit(true);
        controller.setSelectedLibrary(selectedLibrary);
        controller.setTextheadLine();

        controller.setAllTextFields(selectedLibrary.getName(), selectedLibrary.getDistrict()
                , selectedLibrary.getOwnerFirstName(), selectedLibrary.getOwnerLastName()
                , selectedLibrary.getEstablishedYear(), selectedLibrary.getOwnerNumber());

        addMayorPageStage = new Stage();
        addMayorPageStage.setScene(new Scene(loader.getRoot()));
        addMayorPageStage.setResizable(false);
        addMayorPageStage.setTitle("Edit Library");
        addMayorPageStage.show();

        addMayorPageStage.setOnCloseRequest(event -> {
            addMayorPageStage = null;
        });

    }

    private void closeStage() {
        ((Stage)exitBTN.getScene().getWindow()).hide();
    }

    private void openLoginPage(Stage loginStage) {
        loginStage.show();
    }

    private void cleanLoginPage(LoginPageController loginPageController) {
        loginPageController.getLoginPage().getTextField().setText("");
        loginPageController.getLoginPage().getPasswordField().setText("");
        loginPageController.getLoginPage().getErrorLBL().setText("");

    }

    private void removeLibrary() {
        Library selectedLibrary = getLibraryTBLV().getSelectionModel().getSelectedItem();
        selectedLibrary.delete();
        getLibraryTBLV().getItems().remove(selectedLibrary);
    }

    public void addLibraryToTableView(Library library) {
        getLibraryTBLV().getItems().add(library);
    }

    public void updateTable() {
        ArrayList<Library> libraries = Library.getAllLibraries();
        Library.deleteTableOfLibraries();
        Library.createTableForLibraries();
        getLibraryTBLV().getItems().clear();

        for (int i = 0; i < libraries.size(); i++) {
            libraries.get(i).setId(-1);
            libraries.get(i).save();
            addLibraryToTableView(libraries.get(i));
        }
    }

    public TableView<Library> getLibraryTBLV() {
        return libraryTBLV;
    }

    public void setLibraryTBLV(TableView<Library> libraryTBLV) {
        this.libraryTBLV = libraryTBLV;
    }

    public Stage getLoginPageStage() {
        return loginPageStage;
    }

    public void setLoginPageStage(Stage loginPageStage) {
        this.loginPageStage = loginPageStage;
    }

    public LoginPageController getLoginPageController() {
        return loginPageController;
    }

    public void setLoginPageController(LoginPageController loginPageController) {
        this.loginPageController = loginPageController;
    }

}
