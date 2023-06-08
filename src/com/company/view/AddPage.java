package com.company.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class AddPage extends VBox {

    private ChoiceBox personalCHB;
    private TextField firstNameTXF;
    private TextField lastNameTXF;
    private TextField personalIDTXF;
    private DatePicker dateOfEmploymentDPR;
    private TextField incomeTXF;
    private ChoiceBox districtCHB;
    private TextField mayorUserNameTXF;
    private PasswordField mayorPasswordPSF;
    private Label mayorUserNameLBL;
    private Label mayorPasswordLBL;
    private Button applyBTN;
    private Button cancelBTN;
    private Button okBTN;

    public AddPage() {

        setPersonalCHB(new ChoiceBox<>());
        getPersonalCHB().getItems().addAll("Select a personal", "Mayor", "Deputy", "Inspector", "Employee", "Guard");
        getPersonalCHB().setValue("Select a personal");
        getPersonalCHB().setPrefWidth(250);

        HBox hBox1 = new HBox(getPersonalCHB());
        hBox1.setAlignment(Pos.CENTER);
        hBox1.setPadding(new Insets(30, 0, 0, 0));

        Label firstNameLBL = new Label("First Name");
        setFirstNameTXF(new TextField());
        VBox vBox1_1 = new VBox(firstNameLBL, getFirstNameTXF());

        Label personalIDLBL = new Label("ID");
        setPersonalIDTXF(new TextField());
        VBox vBox1_2 = new VBox(personalIDLBL, getPersonalIDTXF());

        Label incomeLBL = new Label("Income");
        setIncomeTXF(new TextField());
        VBox vBox1_3 = new VBox(incomeLBL, getIncomeTXF());

        setMayorUserNameLBL(new Label("User Name"));
        setMayorUserNameTXF(new TextField());
        VBox vBox1_4 = new VBox(getMayorUserNameLBL(), getMayorUserNameTXF());
        getMayorUserNameLBL().setVisible(false);
        getMayorUserNameTXF().setVisible(false);

        VBox vBox1 = new VBox(vBox1_1, vBox1_2, vBox1_3, vBox1_4);
        vBox1.setPrefWidth(428);
        vBox1.setPadding(new Insets(10, 30, 20, 30));
        vBox1.setSpacing(10);

        Label lastNameLBL = new Label("Last Name");
        setLastNameTXF(new TextField());
        VBox vBox2_1 = new VBox(lastNameLBL, getLastNameTXF());

        Label dateOfEmploymentLBL = new Label("Date Of Employment");
        setDateOfEmploymentDPR(new DatePicker());
        getDateOfEmploymentDPR().setPrefWidth(428);
        VBox vBox2_2 = new VBox(dateOfEmploymentLBL, getDateOfEmploymentDPR());

        setMayorPasswordLBL(new Label("Password"));
        setMayorPasswordPSF(new PasswordField());
        VBox vBox2_4 = new VBox(mayorPasswordLBL, getMayorPasswordPSF());
        getMayorPasswordLBL().setVisible(false);
        getMayorPasswordPSF().setVisible(false);

        setDistrictCHB(new ChoiceBox<>());
        getDistrictCHB().getItems().add("Select an option");
        getDistrictCHB().setValue("Select an option");
        getDistrictCHB().setDisable(true);
        getDistrictCHB().setPrefWidth(368);

        VBox vBox2_3 = new VBox(vBox2_2, getDistrictCHB());
        vBox2_3.setSpacing(27);

        VBox vBox2 = new VBox(vBox2_1, vBox2_3, vBox2_4);
        vBox2.setPrefWidth(428);
        vBox2.setPadding(new Insets(10, 30, 20, 30));
        vBox2.setSpacing(10);

        HBox hbox2 = new HBox(vBox1, vBox2);
        hbox2.setPrefHeight(400);

        setApplyBTN(new Button("Apply"));
        setCancelBTN(new Button("Cancel"));
        setOkBTN(new Button("Ok"));

        getOkBTN().setPrefWidth(70);
        getCancelBTN().setPrefWidth(70);
        getApplyBTN().setPrefWidth(70);

        //getApplyBTN().setDisable(true);

        HBox hBox3 = new HBox(getOkBTN(), getCancelBTN(), getApplyBTN());
        hBox3.setSpacing(8);
        hBox3.setPadding(new Insets(8));
        hBox3.setAlignment(Pos.CENTER_RIGHT);

        this.getChildren().addAll(hBox1, hbox2, hBox3);

    }

    public ChoiceBox getPersonalCHB() {
        return personalCHB;
    }

    public void setPersonalCHB(ChoiceBox personalCHB) {
        this.personalCHB = personalCHB;
    }

    public TextField getFirstNameTXF() {
        return firstNameTXF;
    }

    public void setFirstNameTXF(TextField firstNameTXF) {
        this.firstNameTXF = firstNameTXF;
    }

    public TextField getLastNameTXF() {
        return lastNameTXF;
    }

    public void setLastNameTXF(TextField lastNameTXF) {
        this.lastNameTXF = lastNameTXF;
    }

    public TextField getPersonalIDTXF() {
        return personalIDTXF;
    }

    public void setPersonalIDTXF(TextField personalIDTXF) {
        this.personalIDTXF = personalIDTXF;
    }

    public DatePicker getDateOfEmploymentDPR() {
        return dateOfEmploymentDPR;
    }

    public void setDateOfEmploymentDPR(DatePicker dateOfEmploymentDPR) {
        this.dateOfEmploymentDPR = dateOfEmploymentDPR;
    }

    public TextField getIncomeTXF() {
        return incomeTXF;
    }

    public void setIncomeTXF(TextField incomeTXF) {
        this.incomeTXF = incomeTXF;
    }

    public ChoiceBox getDistrictCHB() {
        return districtCHB;
    }

    public void setDistrictCHB(ChoiceBox districtCHB) {
        this.districtCHB = districtCHB;
    }

    public TextField getMayorUserNameTXF() {
        return mayorUserNameTXF;
    }

    public void setMayorUserNameTXF(TextField mayorUserNameTXF) {
        this.mayorUserNameTXF = mayorUserNameTXF;
    }

    public TextField getMayorPasswordPSF() {
        return mayorPasswordPSF;
    }

    public void setMayorPasswordPSF(PasswordField mayorPasswordPSF) {
        this.mayorPasswordPSF = mayorPasswordPSF;
    }

    public Label getMayorUserNameLBL() {
        return mayorUserNameLBL;
    }

    public void setMayorUserNameLBL(Label mayorUserNameLBL) {
        this.mayorUserNameLBL = mayorUserNameLBL;
    }

    public Label getMayorPasswordLBL() {
        return mayorPasswordLBL;
    }

    public void setMayorPasswordLBL(Label mayorPasswordLBL) {
        this.mayorPasswordLBL = mayorPasswordLBL;
    }

    public Button getApplyBTN() {
        return applyBTN;
    }

    public void setApplyBTN(Button applyBTN) {
        this.applyBTN = applyBTN;
    }

    public Button getCancelBTN() {
        return cancelBTN;
    }

    public void setCancelBTN(Button cancelBTN) {
        this.cancelBTN = cancelBTN;
    }

    public Button getOkBTN() {
        return okBTN;
    }

    public void setOkBTN(Button okBTN) {
        this.okBTN = okBTN;
    }

}
