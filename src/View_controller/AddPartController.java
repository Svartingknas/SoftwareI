/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View_controller;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author sergio.morales
 */
public class AddPartController implements Initializable {


    @FXML
    private Button addPartSave;
    @FXML
    private Button addPartCancel;
    @FXML
    private RadioButton addPartInHouseRadious;
    @FXML
    private RadioButton addPartOutsourcedRadious;
    @FXML
    private TextField addPartIdtextField;
    @FXML
    private TextField addPartMachineIdTextField;
    @FXML
    private TextField addPartNameTextField;
    @FXML
    private TextField addPartInvTextField;
    @FXML
    private TextField addPartPriceTextField;
    @FXML
    private TextField addPartMinTextField;
    @FXML
    private TextField addPartMaxTextField;
    @FXML
    private ToggleGroup inHouseOutsourcedRadioButton;
    @FXML
    private Label AddPartCompanyNameMachineIDlabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        addPartOutsourcedRadious.setSelected(true);
        addPartOutsourcedRadious.requestFocus();


    }

    @FXML
    private void addPartSaveButtonHandler(ActionEvent event) {
    }

    @FXML
    private void addPartCancelButtonHandler(ActionEvent event) throws IOException {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.initModality(Modality.NONE);
        alert.setTitle("Add Part Cancellation");
        alert.setHeaderText("Confirm");
        alert.setContentText("Are you sure you want to cancel adding a part?");
        Optional<ButtonType> result = alert.showAndWait();

        if (result.get() == ButtonType.OK) {
            Stage stage;
            Parent root;
            stage=(Stage) addPartCancel.getScene().getWindow();
            FXMLLoader loader=new FXMLLoader(getClass().getResource("/View_controller/MainScreen.fxml"));

            root = loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } else {
            System.out.println("You Cancelled adding a Part");
        }


    }

    @FXML
    private void addPartInHouseRadiousHandler(ActionEvent event) {
        AddPartCompanyNameMachineIDlabel.setText("Machine ID");


    }

    @FXML
    private void addPartOutsourcedRadiusHandler(ActionEvent event) {
        AddPartCompanyNameMachineIDlabel.setText("Company Name");

    }



}
