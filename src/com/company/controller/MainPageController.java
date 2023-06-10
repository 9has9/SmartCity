package com.company.controller;

import com.company.model.*;
import com.company.view.MainPage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainPageController {

    private MainPage mainPage;
    private LoginPageController loginPageController;

    public MainPageController(LoginPageController loginPageController) {
        setMainPage(new MainPage());
        setLoginPageController(loginPageController);

        getMainPage().getAddBTN().setOnAction(event ->  {

                AddPageController addPageController = new AddPageController(this);

                //getMainPage().getScene().getWindow().hide();

                Stage addPageStage = new Stage();
                addPageStage.setScene(new Scene(addPageController.getAddPage()));
                addPageStage.setWidth(856);
                addPageStage.setHeight(500);

                addPageStage.show();

        });

        getMainPage().getRemoveBTN().setOnAction(e -> {

            if (getMainPage().getTabPane().getSelectionModel(). getSelectedItem()
                    .equals(getMainPage().getTabPane().getTabs().get(0))) {

                Mayor selectedItemMayor = getMainPage().getMayorTBLV().getSelectionModel().getSelectedItem();
                getMainPage().getMayorTBLV().getItems().remove(selectedItemMayor);

            }else if (getMainPage().getTabPane().getSelectionModel(). getSelectedItem()
                    .equals(getMainPage().getTabPane().getTabs().get(1))) {

                Deputy selectedItemDeputy = getMainPage().getDeputyTBLV().getSelectionModel().getSelectedItem();
                getMainPage().getDeputyTBLV().getItems().remove(selectedItemDeputy);

            }else if (getMainPage().getTabPane().getSelectionModel(). getSelectedItem()
                    .equals(getMainPage().getTabPane().getTabs().get(2))) {

                Inspector selectedItemInspector = getMainPage().getInspectorTBLV().getSelectionModel().getSelectedItem();
                getMainPage().getInspectorTBLV().getItems().remove(selectedItemInspector);

            }else if (getMainPage().getTabPane().getSelectionModel(). getSelectedItem()
                    .equals(getMainPage().getTabPane().getTabs().get(3))) {

                Employee selectedItemEmployee = getMainPage().getEmployeeTBLV().getSelectionModel().getSelectedItem();
                getMainPage().getEmployeeTBLV().getItems().remove(selectedItemEmployee);

            }else if (getMainPage().getTabPane().getSelectionModel(). getSelectedItem()
                    .equals(getMainPage().getTabPane().getTabs().get(4))) {

                Guard selectedItemGuard = getMainPage().getGuardTBLV().getSelectionModel().getSelectedItem();
                getMainPage().getGuardTBLV().getItems().remove(selectedItemGuard);

            }

        });

        getMainPage().getExitBTN().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                getMainPage().getScene().getWindow().hide();

            }
        });

    }

    public void addMayorToTable(Mayor mayor) {
        getMainPage().getMayorTBLV().getItems().add(mayor);
    }

    public void addDeputyToTable(Deputy deputy) {
        getMainPage().getDeputyTBLV().getItems().add(deputy);
    }

    public void addInspectorToTable(Inspector inspector) {
        getMainPage().getInspectorTBLV().getItems().add(inspector);
    }

    public void addEmployeeToTable(Employee employee) {
        getMainPage().getEmployeeTBLV().getItems().add(employee);
    }

    public void addGuardToTable(Guard guard) {
        getMainPage().getGuardTBLV().getItems().add(guard);
    }

    public MainPage getMainPage() {
        return mainPage;
    }

    public void setMainPage(MainPage mainPage) {
        this.mainPage = mainPage;
    }

    public LoginPageController getLoginPageController() {
        return loginPageController;
    }

    public void setLoginPageController(LoginPageController loginPageController) {
        this.loginPageController = loginPageController;
    }
}
