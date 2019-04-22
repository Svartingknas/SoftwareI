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
public class ModifyPartController implements Initializable {

    @FXML
    private Button addPartSaveButton;
    @FXML
    private Button modifyPartCancelButton;
    @FXML
    private RadioButton modifyPartInHouseRadious;
    @FXML
    private RadioButton modifyPartOutsourcedRadious;
    @FXML
    private TextField modifyPartIdtextField;
    @FXML
    private TextField modifyPartMachineIdTextField;
    @FXML
    private TextField modifyPartNameTextField;
    @FXML
    private TextField modifyPartInvTextField;
    @FXML
    private TextField modifyPartPriceTextField;
    @FXML
    private TextField modifyPartMinTextField;
    @FXML
    private TextField modifyPartMaxTextField;
    @FXML
    private ToggleGroup inHouseOutsourcedRadioButton;
    @FXML
    private Label modifyPartOutsourcedInhouseLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        modifyPartOutsourcedRadious.setSelected(true);
        modifyPartOutsourcedRadious.requestFocus();
        // TODO
    }

    @FXML
    private void modifyPartSaveHandler(ActionEvent event) {
    }

    @FXML
    private void modifyPartCancelHandler(ActionEvent event) throws IOException {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.initModality(Modality.NONE);
        alert.setTitle("Modify Part Cancellation");
        alert.setHeaderText("Confirm");
        alert.setContentText("Are you sure you want to cancel modifying a part?");
        Optional<ButtonType> result = alert.showAndWait();

        if (result.get() == ButtonType.OK) {
            Stage stage;
            Parent root;
            stage=(Stage) modifyPartCancelButton.getScene().getWindow();
            FXMLLoader loader=new FXMLLoader(getClass().getResource("/View_controller/MainScreen.fxml"));

            root = loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } else {
            System.out.println("You Cancelled modifying a part");
        }
    }

    @FXML
    private void modifyPartInHouseRadiousHandler(ActionEvent event) {
        modifyPartOutsourcedInhouseLabel.setText("Machine ID");

    }

    @FXML
    private void modifyPartoutsourcedRadiousHandler(ActionEvent event) {
        modifyPartOutsourcedInhouseLabel.setText("Company Name");
    }

}
