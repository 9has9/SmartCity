package com.company.view;

import com.company.model.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public class MainPage extends BorderPane {

    private TabPane tabPane;
    private TableView<Mayor> mayorTBLV;
    private TableView<Deputy> deputyTBLV;
    private TableView<Inspector> inspectorTBLV;
    private TableView<Employee> employeeTBLV;
    private TableView<Guard> guardTBLV;
    private Button addBTN;
    private Button removeBTN;
    private Button editBTN;
    private Button exitBTN;

    public MainPage() {

        //MayorTableView

        TableColumn<Mayor, String> mayorFirstNameCOL = new TableColumn<>("First Name");
        TableColumn<Mayor, String> mayorLastNameCOL = new TableColumn<>("Last Name");
        TableColumn<Mayor, String> mayorIDCOL = new TableColumn<>("MayorID");
        TableColumn<Mayor, String> mayorDateOfEmploymentCOL = new TableColumn<>("Date Of Employment");
        TableColumn<Mayor, String> mayorIncomeCOL = new TableColumn<>("Income");
        TableColumn<Mayor, String> mayorDistrictCOL = new TableColumn<>("District");

        mayorFirstNameCOL.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        mayorLastNameCOL.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        mayorIDCOL.setCellValueFactory(new PropertyValueFactory<>("personalID"));
        mayorDateOfEmploymentCOL.setCellValueFactory(new PropertyValueFactory<>("dateOfEmployment"));
        mayorIncomeCOL.setCellValueFactory(new PropertyValueFactory<>("income"));
        mayorDistrictCOL.setCellValueFactory(new PropertyValueFactory<>("district"));

        mayorFirstNameCOL.setPrefWidth(140);
        mayorLastNameCOL.setPrefWidth(140);
        mayorIDCOL.setPrefWidth(140);
        mayorDateOfEmploymentCOL.setPrefWidth(140);
        mayorIncomeCOL.setPrefWidth(140);
        mayorDistrictCOL.setPrefWidth(140);

        mayorFirstNameCOL.setSortable(false);
        mayorLastNameCOL.setSortable(false);
        mayorIDCOL.setSortable(false);
        mayorDateOfEmploymentCOL.setSortable(false);
        mayorIncomeCOL.setSortable(false);
        mayorDistrictCOL.setSortable(false);

        mayorFirstNameCOL.setResizable(false);
        mayorLastNameCOL.setResizable(false);
        mayorIDCOL.setResizable(false);
        mayorDateOfEmploymentCOL.setResizable(false);
        mayorIncomeCOL.setResizable(false);
        mayorDistrictCOL.setResizable(false);

        setMayorTBLV(new TableView<>());
        getMayorTBLV().getColumns().addAll(mayorFirstNameCOL, mayorLastNameCOL, mayorIDCOL,
                mayorDateOfEmploymentCOL, mayorIncomeCOL, mayorDistrictCOL);

        //DeputyTableView

        TableColumn<Deputy, String> deputyFirstNameCOL = new TableColumn<>("First Name");
        TableColumn<Deputy, String> deputyLastNameCOL = new TableColumn<>("Last Name");
        TableColumn<Deputy, String> deputyIDCOL = new TableColumn<>("DeputyID");
        TableColumn<Deputy, String> deputyDateOfEmploymentCOL = new TableColumn<>("Date Of Employment");
        TableColumn<Deputy, String> deputyIncomeCOL = new TableColumn<>("Income");
        TableColumn<Deputy, String> deputyEducationCOL = new TableColumn<>("Education");

        deputyFirstNameCOL.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        deputyLastNameCOL.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        deputyIDCOL.setCellValueFactory(new PropertyValueFactory<>("personalID"));
        deputyDateOfEmploymentCOL.setCellValueFactory(new PropertyValueFactory<>("dateOfEmployment"));
        deputyIncomeCOL.setCellValueFactory(new PropertyValueFactory<>("income"));
        deputyEducationCOL.setCellValueFactory(new PropertyValueFactory<>("education"));

        deputyFirstNameCOL.setPrefWidth(140);
        deputyLastNameCOL.setPrefWidth(140);
        deputyIDCOL.setPrefWidth(140);
        deputyDateOfEmploymentCOL.setPrefWidth(140);
        deputyIncomeCOL.setPrefWidth(140);
        deputyEducationCOL.setPrefWidth(140);

        deputyFirstNameCOL.setSortable(false);
        deputyLastNameCOL.setSortable(false);
        deputyIDCOL.setSortable(false);
        deputyDateOfEmploymentCOL.setSortable(false);
        deputyIncomeCOL.setSortable(false);
        deputyEducationCOL.setSortable(false);

        deputyFirstNameCOL.setResizable(false);
        deputyLastNameCOL.setResizable(false);
        deputyIDCOL.setResizable(false);
        deputyDateOfEmploymentCOL.setResizable(false);
        deputyIncomeCOL.setResizable(false);
        deputyEducationCOL.setResizable(false);

        setDeputyTBLV(new TableView<>());
        getDeputyTBLV().getColumns().addAll(deputyFirstNameCOL, deputyLastNameCOL, deputyIDCOL,
                deputyDateOfEmploymentCOL, deputyIncomeCOL, deputyEducationCOL);

        //InspectorTableView

        TableColumn<Inspector, String> inspectorFirstNameCOL = new TableColumn<>("First Name");
        TableColumn<Inspector, String> inspectorLastNameCOL = new TableColumn<>("Last Name");
        TableColumn<Inspector, String> inspectorIDCOL = new TableColumn<>("InspectorID");
        TableColumn<Inspector, String> inspectorDateOfEmploymentCOL = new TableColumn<>("Date Of Employment");
        TableColumn<Inspector, String> inspectorIncomeCOL = new TableColumn<>("Income");
        TableColumn<Inspector, String> inspectorMissionsCOL = new TableColumn<>("Missions");

        inspectorFirstNameCOL.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        inspectorLastNameCOL.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        inspectorIDCOL.setCellValueFactory(new PropertyValueFactory<>("personalID"));
        inspectorDateOfEmploymentCOL.setCellValueFactory(new PropertyValueFactory<>("dateOfEmployment"));
        inspectorIncomeCOL.setCellValueFactory(new PropertyValueFactory<>("income"));
        inspectorMissionsCOL.setCellValueFactory(new PropertyValueFactory<>("missions"));

        inspectorFirstNameCOL.setPrefWidth(140);
        inspectorLastNameCOL.setPrefWidth(140);
        inspectorIDCOL.setPrefWidth(140);
        inspectorDateOfEmploymentCOL.setPrefWidth(140);
        inspectorIncomeCOL.setPrefWidth(140);
        inspectorMissionsCOL.setPrefWidth(140);

        inspectorFirstNameCOL.setSortable(false);
        inspectorLastNameCOL.setSortable(false);
        inspectorIDCOL.setSortable(false);
        inspectorDateOfEmploymentCOL.setSortable(false);
        inspectorIncomeCOL.setSortable(false);
        inspectorMissionsCOL.setSortable(false);

        inspectorFirstNameCOL.setResizable(false);
        inspectorLastNameCOL.setResizable(false);
        inspectorIDCOL.setResizable(false);
        inspectorDateOfEmploymentCOL.setResizable(false);
        inspectorIncomeCOL.setResizable(false);
        inspectorMissionsCOL.setResizable(false);

        setInspectorTBLV(new TableView<>());
        getInspectorTBLV().getColumns().addAll(inspectorFirstNameCOL, inspectorLastNameCOL, inspectorIDCOL,
                inspectorDateOfEmploymentCOL, inspectorIncomeCOL, inspectorMissionsCOL);

        //EmployeeTableView

        TableColumn<Employee, String> employeeFirstNameCOL = new TableColumn<>("First Name");
        TableColumn<Employee, String> employeeLastNameCOL = new TableColumn<>("Last Name");
        TableColumn<Employee, String> employeeIDCOL = new TableColumn<>("EmployeeID");
        TableColumn<Employee, String> employeeDateOfEmploymentCOL = new TableColumn<>("Date Of Employment");
        TableColumn<Employee, String> employeeIncomeCOL = new TableColumn<>("Income");
        TableColumn<Employee, String> employeeWhpwCOL = new TableColumn<>("Working Hours");

        employeeFirstNameCOL.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        employeeLastNameCOL.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        employeeIDCOL.setCellValueFactory(new PropertyValueFactory<>("personalID"));
        employeeDateOfEmploymentCOL.setCellValueFactory(new PropertyValueFactory<>("dateOfEmployment"));
        employeeIncomeCOL.setCellValueFactory(new PropertyValueFactory<>("income"));
        employeeWhpwCOL.setCellValueFactory(new PropertyValueFactory<>("whpw"));

        employeeFirstNameCOL.setPrefWidth(140);
        employeeLastNameCOL.setPrefWidth(140);
        employeeIDCOL.setPrefWidth(140);
        employeeDateOfEmploymentCOL.setPrefWidth(140);
        employeeIncomeCOL.setPrefWidth(140);
        employeeWhpwCOL.setPrefWidth(140);

        employeeFirstNameCOL.setSortable(false);
        employeeLastNameCOL.setSortable(false);
        employeeIDCOL.setSortable(false);
        employeeDateOfEmploymentCOL.setSortable(false);
        employeeIncomeCOL.setSortable(false);
        employeeWhpwCOL.setSortable(false);

        employeeFirstNameCOL.setResizable(false);
        employeeLastNameCOL.setResizable(false);
        employeeIDCOL.setResizable(false);
        employeeDateOfEmploymentCOL.setResizable(false);
        employeeIncomeCOL.setResizable(false);
        employeeWhpwCOL.setResizable(false);

        setEmployeeTBLV(new TableView<>());
        getEmployeeTBLV().getColumns().addAll(employeeFirstNameCOL, employeeLastNameCOL, employeeIDCOL,
                employeeDateOfEmploymentCOL, employeeIncomeCOL, employeeWhpwCOL);

        //GuardTableView

        TableColumn<Guard, String> guardFirstNameCOL = new TableColumn<>("First Name");
        TableColumn<Guard, String> guardLastNameCOL = new TableColumn<>("Last Name");
        TableColumn<Guard, String> guardIDCOL = new TableColumn<>("GuardID");
        TableColumn<Guard, String> guardDateOfEmploymentCOL = new TableColumn<>("Date Of Employment");
        TableColumn<Guard, String> guardIncomeCOL = new TableColumn<>("Income");
        TableColumn<Guard, String> guardShiftCOL = new TableColumn<>("Shift");

        guardFirstNameCOL.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        guardLastNameCOL.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        guardIDCOL.setCellValueFactory(new PropertyValueFactory<>("personalID"));
        guardDateOfEmploymentCOL.setCellValueFactory(new PropertyValueFactory<>("dateOfEmployment"));
        guardIncomeCOL.setCellValueFactory(new PropertyValueFactory<>("income"));
        guardShiftCOL.setCellValueFactory(new PropertyValueFactory<>("shift"));

        guardFirstNameCOL.setPrefWidth(140);
        guardLastNameCOL.setPrefWidth(140);
        guardIDCOL.setPrefWidth(140);
        guardDateOfEmploymentCOL.setPrefWidth(140);
        guardIncomeCOL.setPrefWidth(140);
        guardShiftCOL.setPrefWidth(140);

        guardFirstNameCOL.setSortable(false);
        guardLastNameCOL.setSortable(false);
        guardIDCOL.setSortable(false);
        guardDateOfEmploymentCOL.setSortable(false);
        guardIncomeCOL.setSortable(false);
        guardShiftCOL.setSortable(false);

        guardFirstNameCOL.setResizable(false);
        guardLastNameCOL.setResizable(false);
        guardIDCOL.setResizable(false);
        guardDateOfEmploymentCOL.setResizable(false);
        guardIncomeCOL.setResizable(false);
        guardShiftCOL.setResizable(false);

        setGuardTBLV(new TableView<>());
        getGuardTBLV().getColumns().addAll(guardFirstNameCOL, guardLastNameCOL, guardIDCOL,
                guardDateOfEmploymentCOL, guardIncomeCOL, guardShiftCOL);

        Tab mayorTAB = new Tab("Mayor", getMayorTBLV());
        Tab deputyTAB = new Tab("Deputy", getDeputyTBLV());
        Tab inspectorTAB = new Tab("Inspector", getInspectorTBLV());
        Tab employeeTAB = new Tab("Employee", getEmployeeTBLV());
        Tab guardTAB = new Tab("Guard", getGuardTBLV());

        mayorTAB.setClosable(false);
        deputyTAB.setClosable(false);
        inspectorTAB.setClosable(false);
        employeeTAB.setClosable(false);
        guardTAB.setClosable(false);

        setTabPane(new TabPane(mayorTAB, deputyTAB,  inspectorTAB, employeeTAB, guardTAB));

        setAddBTN(new Button("Add"));
        setRemoveBTN(new Button("Remove"));
        setEditBTN(new Button("Edit"));
        setExitBTN(new Button("Exit"));

        getAddBTN().setPrefWidth(70);
        getRemoveBTN().setPrefWidth(70);
        getEditBTN().setPrefWidth(70);
        getExitBTN().setPrefWidth(70);

        HBox hBox = new HBox(getExitBTN(), getEditBTN(), getRemoveBTN(), getAddBTN());
        hBox.setSpacing(8);
        hBox.setPadding(new Insets(8));
        hBox.setAlignment(Pos.CENTER_RIGHT);

        this.setCenter(getTabPane());
        this.setBottom(hBox);


    }

    public TabPane getTabPane() {
        return tabPane;
    }

    public void setTabPane(TabPane tabPane) {
        this.tabPane = tabPane;
    }

    public TableView<Mayor> getMayorTBLV() {
        return mayorTBLV;
    }

    public void setMayorTBLV(TableView<Mayor> mayorTBLV) {
        this.mayorTBLV = mayorTBLV;
    }

    public TableView<Deputy> getDeputyTBLV() {
        return deputyTBLV;
    }

    public void setDeputyTBLV(TableView<Deputy> deputyTBLV) {
        this.deputyTBLV = deputyTBLV;
    }

    public TableView<Inspector> getInspectorTBLV() {
        return inspectorTBLV;
    }

    public void setInspectorTBLV(TableView<Inspector> inspectorTBLV) {
        this.inspectorTBLV = inspectorTBLV;
    }

    public TableView<Employee> getEmployeeTBLV() {
        return employeeTBLV;
    }

    public void setEmployeeTBLV(TableView<Employee> employeeTBLV) {
        this.employeeTBLV = employeeTBLV;
    }

    public TableView<Guard> getGuardTBLV() {
        return guardTBLV;
    }

    public void setGuardTBLV(TableView<Guard> guardTBLV) {
        this.guardTBLV = guardTBLV;
    }

    public Button getAddBTN() {
        return addBTN;
    }

    public void setAddBTN(Button addBTN) {
        this.addBTN = addBTN;
    }

    public Button getRemoveBTN() {
        return removeBTN;
    }

    public void setRemoveBTN(Button removeBTN) {
        this.removeBTN = removeBTN;
    }

    public Button getEditBTN() {
        return editBTN;
    }

    public void setEditBTN(Button editBTN) {
        this.editBTN = editBTN;
    }

    public Button getExitBTN() {
        return exitBTN;
    }

    public void setExitBTN(Button exitBTN) {
        this.exitBTN = exitBTN;
    }

}
