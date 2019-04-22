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
public class AddProductController implements Initializable {

    @FXML
    private TableView<?> addProductTableView;
    @FXML
    private TableColumn<?, ?> addProductInventoryNameColumnaddProductPartIDNameColumn;
    @FXML
    private TableColumn<?, ?> addProductPartNameColumn;
    @FXML
    private TableColumn<?, ?> addProductInventoryNameColumn;
    @FXML
    private TableColumn<?, ?> addProductPriceColumn;
    @FXML
    private TableView<?> addProductAssociatedTableView;
    @FXML
    private TableColumn<?, ?> addDeleteProductPartIDColumn;
    @FXML
    private TableColumn<?, ?> addDeleteProductPartNameColumn;
    @FXML
    private TableColumn<?, ?> addDeleteProductInventoryLevelColumn;
    @FXML
    private TableColumn<?, ?> addDeleteProductPriceColumn;
    @FXML
    private Button addProductAddTableButton;
    @FXML
    private Button addProductDeleteButton;
    @FXML
    private Button addProductSaveButton;
    @FXML
    private Button addProductCancelButton;
    @FXML
    private TextField addProductIdTextField;
    @FXML
    private TextField addProductNameTextField;
    @FXML
    private TextField addProductInvTextField;
    @FXML
    private TextField addProductPriceTextField;
    @FXML
    private TextField addProductMaxTextField;
    @FXML
    private TextField addProductSearchTextField;
    @FXML
    private Button addProductSearchButton;
    @FXML
    private TextField addProductMinTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void addProductAddTableButtonHandler(ActionEvent event) {
    }

    @FXML
    private void addProductDeleteButtonHandler(ActionEvent event) {
    }

    @FXML
    private void addButtonSaveProductHandler(ActionEvent event) {
    }

    @FXML
    private void addProductCancelButtonHandler(ActionEvent event) throws IOException {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.initModality(Modality.NONE);
        alert.setTitle("Add Product Cancellation");
        alert.setHeaderText("Confirm");
        alert.setContentText("Are you sure you want to cancel adding a product?");
        Optional<ButtonType> result = alert.showAndWait();

        if (result.get() == ButtonType.OK) {
            Stage stage;
            Parent root;
            stage=(Stage) addProductCancelButton.getScene().getWindow();
            FXMLLoader loader=new FXMLLoader(getClass().getResource("/View_controller/MainScreen.fxml"));

            root = loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } else {
            System.out.println("You cancelled adding a product");
        }
    }

    @FXML
    private void addProductSearchHandler(ActionEvent event) {
    }

}
