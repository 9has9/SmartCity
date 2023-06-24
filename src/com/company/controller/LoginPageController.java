package com.company.controller;


import com.company.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import com.company.view.LoginPage;
import javafx.scene.shape.Path;
import javafx.stage.Stage;

import java.io.IOException;
import java.nio.file.Paths;

public class LoginPageController {

    private LoginPage loginPage;
    private FXMLLoader loader;
    private Stage loginPageStage;

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

            }else if (getLoginPage().getTextField().getText().equals(Main.userMayor.getUserName())
                    && getLoginPage().getPasswordField().getText().equals(Main.userMayor.getPassword()) ) {

                getLoginPage().getScene().getWindow().hide();
                setLoader(new FXMLLoader(getClass().getResource("/com/company/view/MayorPage.fxml")));
                try {
                    loader.load();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

                MayorPageController controller = loader.getController();
                controller.setLoginPageStage(getLoginPageStage());
                controller.setLoginPageController(this);

                Stage mayorPageStage = new Stage();
                mayorPageStage.setScene(new Scene(loader.getRoot()));
                mayorPageStage.setTitle("Library Page");
                mayorPageStage.setResizable(false);
                mayorPageStage.show();

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

    public FXMLLoader getLoader() {
        return loader;
    }

    public void setLoader(FXMLLoader loader) {
        this.loader = loader;
    }

    public Stage getLoginPageStage() {
        return loginPageStage;
    }

    public void setLoginPageStage(Stage loginPageStage) {
        this.loginPageStage = loginPageStage;
    }
}
