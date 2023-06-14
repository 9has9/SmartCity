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
    private Label addlibraryLBL;

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
    private Label addLBL;

    @FXML
    private JFXButton cancelBTN;

    @FXML
    void pressAddBTN(ActionEvent event) {
        createLibrary();
    }

    @FXML
    void pressCancelBTN(ActionEvent event) {

    }

    private void createLibrary() {

        if (checkAllFields() == true && checkLibraryName() == true) {
            Library library = new Library(libraryNameTXF.getText(), districtTXF.getText(), ownerFirstNameTXF.getText()
                    , ownerLastNameTXF.getText(), establishedYearTXF.getText(), ownerNumberTXF.getText());

            library.save();
        }
    }

    private boolean checkAllFields() {

        if (libraryNameTXF.getText().compareTo("") == 0
                || districtTXF.getText().compareTo("") == 0
                || ownerFirstNameTXF.getText().compareTo("") == 0
                || ownerLastNameTXF.getText().compareTo("") == 0
                || establishedYearTXF.getText().compareTo("") == 0
                || ownerNumberTXF.getText().compareTo("") == 0) {

            addLBL.setTextFill(Color.RED);
            addLBL.setText("Complete all the parts!!");
            return false;
        }
        return true;
    }

    private boolean checkLibraryName() {
        ArrayList<Library> libraries = Library.getAllLibraries();

        for (int i = 0; i < libraries.size(); i++) {
            if (libraries.get(i).getName().equals(libraryNameTXF.getText())) {
                addLBL.setTextFill(Color.RED);
                addLBL.setText("This name has already been used!!");
                return false;
            }
        }
        return true;
    }

    private void closeStage() {
        ((Stage)cancelBTN.getScene().getWindow()).hide();
        
    }
}
