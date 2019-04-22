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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author sergio.morales
 */
public class ModifyProductController implements Initializable {

    @FXML
    private TableColumn<?, ?> modifyProductInventoryNameColumn;
    @FXML
    private TableColumn<?, ?> modifyProductPriceColumn;
    @FXML
    private TableColumn<?, ?> modifyDeleteProductPartIDColumn;
    @FXML
    private TableColumn<?, ?> modifyDeleteProductPartNameColumn;
    @FXML
    private TableColumn<?, ?> modifyDeleteProductInventoryLevelColumn;
    @FXML
    private TableColumn<?, ?> modifyDeleteProductPriceColumn;
    @FXML
    private Button modifyProductAddTableButton;
    @FXML
    private Button modifyProductDeleteButton;
    @FXML
    private Button modifyProductSaveButton;
    @FXML
    private Button modifyProductCancelButton;
    @FXML
    private TextField modifyProductIdTextField;
    @FXML
    private TextField modifyProductNameTextField;
    @FXML
    private TextField modifyProductInvTextField;
    @FXML
    private TextField modifyProductPriceTextField;
    @FXML
    private TextField modifyProductMaxTextField;
    @FXML
    private TextField modifyProductSearchTextField;
    @FXML
    private Button modifyProductSearchButton;
    @FXML
    private TextField modifyProductMinTextField;
    @FXML
    private TableView<?> modifyProductTableView;
    @FXML
    private TableColumn<?, ?> modifyProductPartIdColumn;
    @FXML
    private TableColumn<?, ?> modifyProductPartNameColumn;
    @FXML
    private TableView<?> modifyDeleteProductTableView;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void modifyProductAddTableButtonHandler(ActionEvent event) {
    }

    @FXML
    private void modifyProductDeleteButtonHandler(ActionEvent event) {
    }

    @FXML
    private void modifyButtonSaveProductHandler(ActionEvent event) {
    }

    @FXML
    private void modifyProductCancelButtonHandler(ActionEvent event) throws IOException {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.initModality(Modality.NONE);
        alert.setTitle("Modify Product Cancellation");
        alert.setHeaderText("Confirm");
        alert.setContentText("Are you sure you want to cancel modifying a product?");
        Optional<ButtonType> result = alert.showAndWait();

        if (result.get() == ButtonType.OK) {
            Stage stage;
            Parent root;
            stage=(Stage) modifyProductCancelButton.getScene().getWindow();
            FXMLLoader loader=new FXMLLoader(getClass().getResource("/View_controller/MainScreen.fxml"));

            root = loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } else {
            System.out.println("You cancelled modifying a product");
        }
    }

    @FXML
    private void modifyProductSearchHandler(ActionEvent event) {
    }

}
