package Controller;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import main.Switcher;

public class ModifyPartFormController {
    
    Switcher switcher = new Switcher();

    @FXML
    private Button cancelBtn;

    @FXML
    private RadioButton inHouseBtn;

    @FXML
    private TextField invTxt;

    @FXML
    private TextField machineIdTxt;

    @FXML
    private TextField maxTxt;

    @FXML
    private TextField minTxt;

    @FXML
    private TextField nameTxt;

    @FXML
    private RadioButton outsourcedBtn;

    @FXML
    private TextField priceTxt;

    @FXML
    private Button saveBtn;

    @FXML
    private ToggleGroup sourceTG;

    @FXML
    void onActionCancelPart(ActionEvent event) throws IOException {

        switcher.screen("/View/mainForm.fxml", event);

    }

    @FXML
    void onActionSavePart(ActionEvent event) {

    }

}
