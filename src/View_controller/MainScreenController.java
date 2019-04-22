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
public class MainScreenController implements Initializable {

    @FXML
    private Button productsSearchButton;
    @FXML
    private TextField productsSearchTextField;
    @FXML
    private Button productsAddButton;
    @FXML
    private Button productsDeleteButton;
    @FXML
    private Button productsModifyButton;
    @FXML
    //private TableView<Parts> partsTable1;
    private TableView<?> partsTable1;
    @FXML
    //private TableColumn<Parts, int> productIdColumn;
    private TableColumn<?, ?> productIdColumn;
    @FXML
    private TableColumn<?, ?> productNameColumn;
    @FXML
    private TableColumn<?, ?> productInventoryLevelColumn;
    @FXML
    private TableColumn<?, ?> productPriceColumn;
    @FXML
    private Button partSearchButton;
    @FXML
    private TableView<?> partsTable;
    @FXML
    private TableColumn<?, ?> partIdColumn;
    @FXML
    private TableColumn<?, ?> partNameColumn;
    @FXML
    private TableColumn<?, ?> partInventoryLevelColumn;
    @FXML
    private TableColumn<?, ?> partPriceColumn;
    @FXML
    private TextField partSearchTextField;
    @FXML
    private Button partsAddButton;
    @FXML
    private Button partsDeleteButton;
    @FXML
    private Button partsModifyButton;
    @FXML
    private Button exitMainScreen;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void productsSearch(ActionEvent event) {
    }

    @FXML
    private void productsAddButtonHandler(ActionEvent event) throws IOException {
        Stage stage;
        Parent root;
        stage=(Stage) productsAddButton.getScene().getWindow();
        FXMLLoader loader=new FXMLLoader(getClass().getResource("/View_controller/AddProduct.fxml"));

        root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void productsDeleteButtonHandler(ActionEvent event) {
    }

    @FXML
    private void productsModifyButtonHandler(ActionEvent event) throws IOException {
        Stage stage;
        Parent root;
        stage=(Stage) partsAddButton.getScene().getWindow();
        FXMLLoader loader=new FXMLLoader(getClass().getResource("/View_controller/ModifyProduct.fxml"));

        root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void partsSearch(ActionEvent event) {
    }

    @FXML
    private void partsAddButtonHandler(ActionEvent event) throws IOException {
        Stage stage;
        Parent root;
        stage=(Stage) partsAddButton.getScene().getWindow();
        FXMLLoader loader=new FXMLLoader(getClass().getResource("/View_controller/AddPart.fxml"));

        root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void partsDeleteButtonHandler(ActionEvent event) {
    }

    @FXML
    private void partsModifyButtonHandler(ActionEvent event) throws IOException {
        Stage stage;
        Parent root;
        stage=(Stage) partsModifyButton.getScene().getWindow();
        FXMLLoader loader=new FXMLLoader(getClass().getResource("/View_controller/ModifyPart.fxml"));

        root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();


    }

    @FXML
    private void exitMainHandler(ActionEvent event) throws IOException {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.initModality(Modality.NONE);
        alert.setTitle("EXIT");
        alert.setHeaderText("Confirm");
        alert.setContentText("Are you sure you want to exit?");
        Optional<ButtonType> result = alert.showAndWait();

        if (result.get() == ButtonType.OK) {
            System.exit(0);
        } else {
            System.out.println("exit");
        }
    }

}
