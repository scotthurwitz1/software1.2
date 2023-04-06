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
import javafx.stage.Stage;
import main.Switcher;

public class AddPartFormController {
    
    Stage stage;
    Parent scene;

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
    void onActionCancelPart(ActionEvent event) throws IOException {
        
        Switcher switcher = new Switcher();
        switcher.screen("/View/mainForm.fxml", event);
        
    }

    @FXML
    void onActionSavePart(ActionEvent event) {
        System.out.println("Part Saved");
    }

}
