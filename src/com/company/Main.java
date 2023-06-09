package com.company;

import com.company.controller.LoginPageController;
import com.company.model.UserMayor;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import com.company.model.Admin;

public class Main extends Application {

    public static Admin admin = new Admin();
    public static UserMayor userMayor = new UserMayor();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        LoginPageController loginPageController = new LoginPageController();

        loginPageController.setLoginPageStage(primaryStage);

        primaryStage.setScene(new Scene(loginPageController.getLoginPage()));
        primaryStage.setTitle("Smart City");
        primaryStage.setWidth(400);
        primaryStage.setHeight(230);

        primaryStage.show();
    }
}