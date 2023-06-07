package com.company.view;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class LoginPage extends VBox {

    private TextField textField;
    private PasswordField passwordField;
    private Label errorLBL;
    private Button loginBTN;

    public LoginPage() {

        setTextField(new TextField());
        getTextField().setPromptText("User Name");

        setPasswordField(new PasswordField());
        getPasswordField().setPromptText("Password");

        setErrorLBL(new Label(""));

        setLoginBTN(new Button("Login"));

        getLoginBTN().setPrefWidth(70);

        this.getChildren().addAll(getTextField(), getPasswordField(), getErrorLBL(), getLoginBTN());
        this.setAlignment(Pos.CENTER);
        this.setSpacing(5);
        this.setFillWidth(false);


    }

    public TextField getTextField() {
        return textField;
    }

    public void setTextField(TextField textField) {
        this.textField = textField;
    }

    public PasswordField getPasswordField() {
        return passwordField;
    }

    public void setPasswordField(PasswordField passwordField) {
        this.passwordField = passwordField;
    }

    public Label getErrorLBL() {
        return errorLBL;
    }

    public void setErrorLBL(Label errorLBL) {
        this.errorLBL = errorLBL;
    }

    public Button getLoginBTN() {
        return loginBTN;
    }

    public void setLoginBTN(Button loginBTN) {
        this.loginBTN = loginBTN;
    }
}
