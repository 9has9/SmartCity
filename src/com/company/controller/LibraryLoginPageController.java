package com.company.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import com.sun.glass.events.MouseEvent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

public class LibraryLoginPageController {

    @FXML
    private JFXTextField userNameTXF;

    @FXML
    private Label userNameLBL;

    @FXML
    private JFXPasswordField passwordTXF;

    @FXML
    private Label passwordLBL;

    @FXML
    private JFXButton signInBTN;

    @FXML
    private Label signUpLBL;

    @FXML
    private JFXButton signUpBTN;

    @FXML
    private Text headLineLBL;

    @FXML
    void pressReplyBTN(MouseEvent event) {

    }

    @FXML
    void pressSignInBTN(ActionEvent event) {

    }

    @FXML
    void pressSignUpBTN(ActionEvent event) {

    }

}
