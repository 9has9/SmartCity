package com.company.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class LibraryRegistrationPageController {

    @FXML
    private Label headLineLBL;

    @FXML
    private JFXTextField lastNameTXF;

    @FXML
    private Label lastNameLBL;

    @FXML
    private JFXTextField nationalCodeTXF;

    @FXML
    private Label nationalCodeLBL;

    @FXML
    private JFXTextField ageTXF;

    @FXML
    private Label ageLBL;

    @FXML
    private JFXComboBox<?> genderCMB;

    @FXML
    private Label genderLBL;

    @FXML
    private JFXTextField phoneNumberTXF;

    @FXML
    private Label phoneNumberLBL;

    @FXML
    private JFXTextField firstNameTXF;

    @FXML
    private Label firstNameLBL;

    @FXML
    private JFXTextArea addressTXA;

    @FXML
    private Label addressLBL;

    @FXML
    private JFXButton cancelBTN;

    @FXML
    private JFXButton createAccountBTN;

    @FXML
    void pressCancelBTN(ActionEvent event) {
        closeStage();
    }

    @FXML
    void pressCreateAccountBTN(ActionEvent event) {

    }

    private void closeStage() {
        ((Stage)cancelBTN.getScene().getWindow()).hide();
        LibraryLoginPageController.libraryRegistrationPage = null;
    }

}

