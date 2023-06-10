package com.company.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.stage.Stage;

import java.io.IOException;

public class MayorPageController {

    @FXML
    private TableColumn<?, ?> libraryNameTBLC;

    @FXML
    private TableColumn<?, ?> districtTBLC;

    @FXML
    private TableColumn<?, ?> establishedYearTBLC;

    @FXML
    private TableColumn<?, ?> ownerFullNameTBLC;

    @FXML
    private TableColumn<?, ?> firstNameTBLC;

    @FXML
    private TableColumn<?, ?> lastNameTBLC;

    @FXML
    private TableColumn<?, ?> ownerNumberTBLC;

    @FXML
    private Button backBTN;

    @FXML
    private Button removeBTN;

    @FXML
    private Button addBTN;

    @FXML
    private Button openBTN;

    @FXML
    void pressAddBTN(ActionEvent event) {
        addBTN.getScene().getWindow().hide();
        Stage addMayorPageStage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/company/view/AddMayorPage.fxml"));
        try {
            loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        addMayorPageStage.setScene(new Scene(loader.getRoot()));
        addMayorPageStage.setResizable(false);
        addMayorPageStage.setTitle("Add Library");
        addMayorPageStage.show();
    }

    @FXML
    void pressBackBTN(ActionEvent event) {

    }

    @FXML
    void pressOpenBTN(ActionEvent event) {

    }

    @FXML
    void pressRemoveBTN(ActionEvent event) {

    }

}
