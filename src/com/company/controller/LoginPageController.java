package com.company.controller;


import com.company.Main;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import com.company.view.LoginPage;
import javafx.stage.Stage;

public class LoginPageController {

    private LoginPage loginPage;

    public LoginPageController() {
        setLoginPage(new LoginPage());

        getLoginPage().getLoginBTN().setOnAction(event ->  {

            if (getLoginPage().getTextField().getText().equals(Main.admin.getUserName())
                        && getLoginPage().getPasswordField().getText().equals(Main.admin.getPassword())) {

                    MainPageController mainPageController = new MainPageController(this);

                    getLoginPage().getScene().getWindow().hide();

                    Stage mainPageStage = new Stage();
                    mainPageStage.setScene(new Scene(mainPageController.getMainPage()));
                    mainPageStage.setTitle("Smart City");
                    mainPageStage.setWidth(856);
                    mainPageStage.setHeight(500);
                    mainPageStage.setResizable(false);

                    mainPageStage.show();



                }else {
                    getLoginPage().getErrorLBL().setTextFill(Color.RED);
                    getLoginPage().getErrorLBL().setText("User Name or Password is wrong!");
                }

        });

    }

    public LoginPage getLoginPage() {
        return loginPage;
    }

    public void setLoginPage(LoginPage loginPage) {
        this.loginPage = loginPage;
    }
}
