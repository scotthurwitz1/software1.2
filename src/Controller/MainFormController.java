package Controller;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import main.Switcher;

public class MainFormController {
    
    Stage stage;
    Parent scene;
    
    @FXML
    private Button exitBtn;

    @FXML
    private Button partAddBtn;

    @FXML
    private TableColumn<?, ?> partCostCol;

    @FXML
    private Button partDelBtn;

    @FXML
    private TableColumn<?, ?> partIdCol;

    @FXML
    private TableColumn<?, ?> partInvCol;

    @FXML
    private Button partModBtn;

    @FXML
    private TableColumn<?, ?> partNameCol;

    @FXML
    private TextField partSearchTxt;

    @FXML
    private TableView<?> partsTbl;

    @FXML
    private Button prodAddBtn;

    @FXML
    private Button prodDelBtn;

    @FXML
    private TableColumn<?, ?> prodIdCol;

    @FXML
    private TableColumn<?, ?> prodInvCol;

    @FXML
    private Button prodModBtn;

    @FXML
    private TableColumn<?, ?> prodNameCol;

    @FXML
    private TableColumn<?, ?> prodPriceCol;

    @FXML
    private TableView<?> prodTbl;

    @FXML
    private TextField searchProdTxt;

    @FXML
    void onActionAddPart(ActionEvent event) throws IOException {
        
        Switcher switcher = new Switcher();
        switcher.screen("/View/addPartForm.fxml", event);
        
    }

    @FXML
    void onActionAddProduct(ActionEvent event) throws IOException {
        
        Switcher switcher = new Switcher();
        switcher.screen("/View/addProductForm.fxml", event);
        
    }

    @FXML
    void onActionDeletePart(ActionEvent event) {

    }

    @FXML
    void onActionDeleteProduct(ActionEvent event) {

    }

    @FXML
    void onActionExit(ActionEvent event) {
        
        System.exit(0);

    }

    @FXML
    void onActionModifyPart(ActionEvent event) throws IOException {
        
        Switcher switcher = new Switcher();
        switcher.screen("/View/modifyPartForm.fxml", event);
        
    }

    @FXML
    void onActionModifyProduct(ActionEvent event) throws IOException {
        
        Switcher switcher = new Switcher();
        switcher.screen("/View/modifyProductForm.fxml", event);

    }

}
