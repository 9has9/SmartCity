package com.company.controller;

import com.company.model.Library;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.ArrayList;

public class AddMayorPageController {

    @FXML
    private Label headLineLBL;

    @FXML
    private JFXTextField libraryNameTXF;

    @FXML
    private JFXTextField districtTXF;

    @FXML
    private JFXTextField ownerFirstNameTXF;

    @FXML
    private JFXTextField ownerLastNameTXF;

    @FXML
    private JFXTextField establishedYearTXF;

    @FXML
    private JFXTextField ownerNumberTXF;

    @FXML
    private JFXButton addBTN;

    @FXML
    private Label errorLBL;

    @FXML
    private JFXButton cancelBTN;

    private MayorPageController mayorPageController;

    private boolean openedAsEdit;

    private Library selectedLibrary;

    @FXML
    void pressAddBTN(ActionEvent event) {
        if (getOpenedAsEdit() == false) {
            AddLibrary();
        }else {
            editLibrary();
        }

    }

    @FXML
    void pressCancelBTN(ActionEvent event) {
        closeStage();
    }

    private void AddLibrary() {

        if (checkAllFields() == true && checkLibraryName() == true) {
            Library library = new Library(libraryNameTXF.getText(), districtTXF.getText(), ownerFirstNameTXF.getText()
                    , ownerLastNameTXF.getText(), establishedYearTXF.getText(), ownerNumberTXF.getText());
            library.save();
            getMayorPageController().addLibraryToTableView(library);
            errorLBL.setTextFill(Color.GREEN);
            errorLBL.setText("The library added!");
            cleanPage();
        }
    }

    private boolean checkAllFields() {

        if (libraryNameTXF.getText().compareTo("") == 0
                || districtTXF.getText().compareTo("") == 0
                || ownerFirstNameTXF.getText().compareTo("") == 0
                || ownerLastNameTXF.getText().compareTo("") == 0
                || establishedYearTXF.getText().compareTo("") == 0
                || ownerNumberTXF.getText().compareTo("") == 0) {

            errorLBL.setTextFill(Color.RED);
            errorLBL.setText("Complete all the parts!!");
            return false;
        }
        return true;
    }

    private boolean checkLibraryName() {
        ArrayList<Library> libraries = Library.getAllLibraries();

        for (int i = 0; i < libraries.size(); i++) {
            if (libraries.get(i).getName().equals(libraryNameTXF.getText())) {
                errorLBL.setTextFill(Color.RED);
                errorLBL.setText("This name has already been used!!");
                return false;
            }
        }
        return true;
    }

    private void editLibrary() {

        if (checkAllFields() == true && checkLibraryNameForEdit() == true) {
            getSelectedLibrary().setName(libraryNameTXF.getText());
            getSelectedLibrary().setDistrict(districtTXF.getText());
            getSelectedLibrary().setOwnerFirstName(ownerFirstNameTXF.getText());
            getSelectedLibrary().setOwnerLastName(ownerLastNameTXF.getText());
            getSelectedLibrary().setEstablishedYear(establishedYearTXF.getText());
            getSelectedLibrary().setOwnerNumber(ownerNumberTXF.getText());
            getSelectedLibrary().save();
            mayorPageController.getLibraryTBLV().refresh();
            closeStage();
        }
    }

    private boolean checkLibraryNameForEdit() {

        if (getSelectedLibrary().getName().equals(libraryNameTXF.getText())) {
            return true;
        }else {
            ArrayList<Library> libraries = Library.getAllLibraries();

            for (int i = 0; i < libraries.size(); i++) {
                if (libraries.get(i).getName().equals(libraryNameTXF.getText())) {
                    errorLBL.setTextFill(Color.RED);
                    errorLBL.setText("This name has already been used!!");
                    return false;
                }
            }
            return true;
        }

    }

    private void cleanPage() {
        libraryNameTXF.setText("");
        districtTXF.setText("");
        ownerFirstNameTXF.setText("");
        ownerLastNameTXF.setText("");
        establishedYearTXF.setText("");
        ownerNumberTXF.setText("");
    }

    private void closeStage() {
        ((Stage)cancelBTN.getScene().getWindow()).hide();
        MayorPageController.addMayorPageStage = null;
    }

    public void setAllTextFields(String libraryName, String district, String ownerFirstName
            , String ownerLastName, String establishedYear, String ownerNumber) {
        libraryNameTXF.setText(libraryName);
        districtTXF.setText(district);
        ownerFirstNameTXF.setText(ownerFirstName);
        ownerLastNameTXF.setText(ownerLastName);
        establishedYearTXF.setText(establishedYear);
        ownerNumberTXF.setText(ownerNumber);
    }

    public void setTextheadLine() {
        if (getOpenedAsEdit() == true) {
            headLineLBL.setText("Edit Library");
        }else {
            headLineLBL.setText("Add Library");
        }
    }

    public MayorPageController getMayorPageController() {
        return mayorPageController;
    }

    public void setMayorPageController(MayorPageController mayorPageController) {
        this.mayorPageController = mayorPageController;
    }

    public boolean getOpenedAsEdit() {
        return openedAsEdit;
    }

    public void setOpenedAsEdit(boolean openedAsEdit) {
        this.openedAsEdit = openedAsEdit;
    }

    public Library getSelectedLibrary() {
        return selectedLibrary;
    }

    public void setSelectedLibrary(Library selectedLibrary) {
        this.selectedLibrary = selectedLibrary;
    }
}
