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

public class AddProductFormController {
    
    Switcher switcher = new Switcher();

    @FXML
    private Button addBtn;

    @FXML
    private Button cancelBtn;

    @FXML
    private Button cancelSceneBtn;

    @FXML
    private TextField invTxt;

    @FXML
    private TextField maxTxt;

    @FXML
    private TextField minTxt;

    @FXML
    private TextField nameTxt;

    @FXML
    private TableColumn<?, ?> partListIdCol;

    @FXML
    private TableColumn<?, ?> partListInvCol;

    @FXML
    private TableColumn<?, ?> partListNameCol;

    @FXML
    private TableColumn<?, ?> partListPriceCol;

    @FXML
    private TableView<?> partListTbl;

    @FXML
    private TextField priceTxt;

    @FXML
    private TableColumn<?, ?> relPartIdCol;

    @FXML
    private TableColumn<?, ?> relPartInvCol;

    @FXML
    private TableColumn<?, ?> relPartNameCol;

    @FXML
    private TableColumn<?, ?> relPartPriceCol;

    @FXML
    private TableView<?> relPartTbl;

    @FXML
    private Button removeBtn;

    @FXML
    private Button saveBtn;

    @FXML
    private Button saveSceneBtn;

    @FXML
    private TextField searchTxt;

    @FXML
    void onActionAddPart(ActionEvent event) {

    }

    @FXML
    void onActionCancel(ActionEvent event) {

    }

    @FXML
    void onActionCancelToMain(ActionEvent event) throws IOException {
        
        switcher.screen("/View/mainForm.fxml", event);

    }

    @FXML
    void onActionRemovePart(ActionEvent event) {

    }

    @FXML
    void onActionSave(ActionEvent event) {

    }

    @FXML
    void onActionSaveToMain(ActionEvent event) {

    }

}
