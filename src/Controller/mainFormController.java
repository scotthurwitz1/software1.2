package Controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class mainFormController implements Initializable {

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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        System.out.println("I am initialized");
    }

}
