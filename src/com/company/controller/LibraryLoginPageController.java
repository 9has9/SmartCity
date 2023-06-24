package com.company.controller;


import com.company.model.Library;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class LibraryLoginPageController {

    @FXML
    private FontAwesomeIconView backBTN;

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
    private Label errorLBL;

    @FXML
    private Text headLineLBL;

    static Stage libraryRegistrationPage = null;

    private Stage mayorPageStage;

    @FXML
    void pressReplyBTN(MouseEvent event) {
        if (libraryRegistrationPage == null) {
            closeStage();
            openMayorPage(getMayorPageStage());
        }
    }

    @FXML
    void pressSignInBTN(ActionEvent event) {
        if (libraryRegistrationPage == null) {
            signIN();
        }
    }

    @FXML
    void pressSignUpBTN(ActionEvent event) {
        if (libraryRegistrationPage == null) {
            openLibraryRegistrationPageStage();
        }
    }

    private void signIN() {
        if (checkAllFields() == true && checkUserPass() == true) {

        }
    }

    private void openLibraryRegistrationPageStage() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/company/view/LibraryRegistrationPage.fxml"));
        try {
            loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //LibraryRegistrationPageController controller = loader.getController();

        libraryRegistrationPage = new Stage();
        libraryRegistrationPage.setScene(new Scene(loader.getRoot()));
        libraryRegistrationPage.setResizable(false);
        libraryRegistrationPage.setTitle("Registration Page");
        libraryRegistrationPage.show();

        libraryRegistrationPage.setOnCloseRequest(event -> {
            libraryRegistrationPage = null;
        });
    }

    private boolean checkAllFields() {

        if (userNameTXF.getText().compareTo("") == 0 || passwordTXF.getText().compareTo("") == 0) {

            errorLBL.setTextFill(Color.RED);
            errorLBL.setText("Complete all the parts!!");
            errorLBL.setVisible(true);
            return false;
        }
        return true;
    }

    private boolean checkUserPass() {
        /*ArrayList<Library> libraries = Library.getAllLibraries();

        for (int i = 0; i < libraries.size(); i++) {
            if (libraries.get(i).getName().equals(libraryNameTXF.getText())) {
                errorLBL.setTextFill(Color.RED);
                errorLBL.setText("This name has already been used!!");
                return false;
            }
        }
        return true;*/
        return true;
    }

    private void closeStage() {
        ((Stage)signUpBTN.getScene().getWindow()).hide();
    }

    private void openMayorPage(Stage mayorStage) {
        mayorStage.show();
    }

    public Stage getMayorPageStage() {
        return mayorPageStage;
    }

    public void setMayorPageStage(Stage mayorPageStage) {
        this.mayorPageStage = mayorPageStage;
    }
}
