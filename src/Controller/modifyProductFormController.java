package Controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class modifyProductFormController implements Initializable {

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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        System.out.println("I am initialized");
    }

}
