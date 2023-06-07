package com.company.controller;

import com.company.model.*;
import com.company.view.AddPage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class AddPageController {

    private AddPage addPage;
    private MainPageController mainPageController;

    public AddPageController(MainPageController mainPageController) {
        setAddPage(new AddPage());
        setMainPageController(mainPageController);

        getAddPage().getPersonalCHB().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (getAddPage().getPersonalCHB().getValue().equals("Select a personal")) {

                    getAddPage().getDistrictCHB().getItems().clear();
                    getAddPage().getDistrictCHB().getItems().addAll("Select an option");
                    getAddPage().getDistrictCHB().setValue("Select an option");
                    getAddPage().getDistrictCHB().setDisable(true);

                }else if (getAddPage().getPersonalCHB().getValue().equals("Mayor")) {

                    getAddPage().getDistrictCHB().getItems().clear();
                    getAddPage().getDistrictCHB().getItems().addAll("Select a district", "1", "2", "3");
                    getAddPage().getDistrictCHB().setValue("Select a district");
                    getAddPage().getDistrictCHB().setDisable(false);

                }else if (getAddPage().getPersonalCHB().getValue().equals("Deputy")) {

                    getAddPage().getDistrictCHB().getItems().clear();
                    getAddPage().getDistrictCHB().getItems().addAll("Select an education", "Bachelor's degree", "Master'degree", "Doctorate");
                    getAddPage().getDistrictCHB().setValue("Select an education");
                    getAddPage().getDistrictCHB().setDisable(false);

                }else if (getAddPage().getPersonalCHB().getValue().equals("Inspector")) {

                    getAddPage().getDistrictCHB().getItems().clear();
                    getAddPage().getDistrictCHB().getItems().addAll("Select the number of missions", "0", "1 - 5", "5 - ...");
                    getAddPage().getDistrictCHB().setValue("Select the number of missions");
                    getAddPage().getDistrictCHB().setDisable(false);

                }else if (getAddPage().getPersonalCHB().getValue().equals("Employee")) {

                    getAddPage().getDistrictCHB().getItems().clear();
                    getAddPage().getDistrictCHB().getItems().addAll("Select the working hours", "20 - 30", "30 - 40", "50 - ...");
                    getAddPage().getDistrictCHB().setValue("Select the working hours");
                    getAddPage().getDistrictCHB().setDisable(false);

                }else if (getAddPage().getPersonalCHB().getValue().equals("Guard")) {

                    getAddPage().getDistrictCHB().getItems().clear();
                    getAddPage().getDistrictCHB().getItems().addAll("Select the number of shifts", "1", "2", "3");
                    getAddPage().getDistrictCHB().setValue("Select the number of shifts");
                    getAddPage().getDistrictCHB().setDisable(false);

                }
            }
        });

        getAddPage().getApplyBTN().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                applyAndOk();
            }
        });

        getAddPage().getCancelBTN().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                getAddPage().getScene().getWindow().hide();
            }
        });

        getAddPage().getOkBTN().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                applyAndOk();
                getAddPage().getScene().getWindow().hide();
            }
        });

    }

    public void applyAndOk() {

        if (getAddPage().getPersonalCHB().getValue().equals("Mayor")) {

            String district = getAddPage().getDistrictCHB().getValue().toString();
            String firstName = getAddPage().getFirstNameTXF().getText();
            String lastName = getAddPage().getLastNameTXF().getText();
            String personalID = getAddPage().getPersonalIDTXF().getText();
            String dateOfEmployment = getAddPage().getDateOfEmploymentDPR().getValue().toString();
            String income = getAddPage().getIncomeTXF().getText();

            Mayor mayor = new Mayor(district, firstName, lastName, personalID, dateOfEmployment, income);

            getMainPageController().addMayorToTable(mayor);

        }else if (getAddPage().getPersonalCHB().getValue().equals("Deputy")) {

            String education = getAddPage().getDistrictCHB().getValue().toString();
            String firstName = getAddPage().getFirstNameTXF().getText();
            String lastName = getAddPage().getLastNameTXF().getText();
            String personalID = getAddPage().getPersonalIDTXF().getText();
            String dateOfEmployment = getAddPage().getDateOfEmploymentDPR().getValue().toString();
            String income = getAddPage().getIncomeTXF().getText();

            Deputy deputy = new Deputy(education, firstName, lastName, personalID, dateOfEmployment, income);

            getMainPageController().addDeputyToTable(deputy);

        }else if (getAddPage().getPersonalCHB().getValue().equals("Inspector")) {

            String missions = getAddPage().getDistrictCHB().getValue().toString();
            String firstName = getAddPage().getFirstNameTXF().getText();
            String lastName = getAddPage().getLastNameTXF().getText();
            String personalID = getAddPage().getPersonalIDTXF().getText();
            String dateOfEmployment = getAddPage().getDateOfEmploymentDPR().getValue().toString();
            String income = getAddPage().getIncomeTXF().getText();

            Inspector inspector = new Inspector(missions, firstName, lastName, personalID, dateOfEmployment, income);

            getMainPageController().addInspectorToTable(inspector);

        }else if (getAddPage().getPersonalCHB().getValue().equals("Employee")) {

            String whpw = getAddPage().getDistrictCHB().getValue().toString();
            String firstName = getAddPage().getFirstNameTXF().getText();
            String lastName = getAddPage().getLastNameTXF().getText();
            String personalID = getAddPage().getPersonalIDTXF().getText();
            String dateOfEmployment = getAddPage().getDateOfEmploymentDPR().getValue().toString();
            String income = getAddPage().getIncomeTXF().getText();

            Employee employee = new Employee(whpw, firstName, lastName, personalID, dateOfEmployment, income);

            getMainPageController().addEmployeeToTable(employee);

        }else if (getAddPage().getPersonalCHB().getValue().equals("Guard")) {

            String shift = getAddPage().getDistrictCHB().getValue().toString();
            String firstName = getAddPage().getFirstNameTXF().getText();
            String lastName = getAddPage().getLastNameTXF().getText();
            String personalID = getAddPage().getPersonalIDTXF().getText();
            String dateOfEmployment = getAddPage().getDateOfEmploymentDPR().getValue().toString();
            String income = getAddPage().getIncomeTXF().getText();

            Guard guard = new Guard(shift, firstName, lastName, personalID, dateOfEmployment, income);

            getMainPageController().addGuardToTable(guard);

        }

    }

    public AddPage getAddPage() {
        return addPage;
    }

    public void setAddPage(AddPage addPage) {
        this.addPage = addPage;
    }

    public MainPageController getMainPageController() {
        return mainPageController;
    }

    public void setMainPageController(MainPageController mainPageController) {
        this.mainPageController = mainPageController;
    }
}
