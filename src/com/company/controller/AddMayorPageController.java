package com.company.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

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
    void pressAddBTN(ActionEvent event) {
        if (libraryNameTXF.getText().compareTo("") == 0
                || districtTXF.getText().compareTo("") == 0
                || ownerFirstNameTXF.getText().compareTo("") == 0
                || ownerLastNameTXF.getText().compareTo("") == 0
                || establishedYearTXF.getText().compareTo("") == 0
                || ownerNumberTXF.getText().compareTo("") == 0) {

            addLBL.setTextFill(Color.RED);
            addLBL.setText("Complete all the parts!!");
        }else {


        }
    }

}
