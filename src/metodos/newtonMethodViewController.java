package metodos;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by core i 5 on 3/04/2018.
 */
public class newtonMethodViewController {

    @FXML
    Button back;

    @FXML
    Button clean;

    @FXML
    Button calculate;

    @FXML
    TextField firstSign;

    @FXML
    TextField secondCoeficient;

    @FXML
    TextField raizValue;

    @FXML
    TextField errorValue;

    @FXML
    TextField thirdCoficient;

    @FXML
    TextField firstCoeficient;

    @FXML
    TextField XoInitValue;

    @FXML
    TextField iterationNumber;


    public void onClickCleanButton(){

        XoInitValue.clear();
        iterationNumber.clear();
        errorValue.clear();
    }

    public void onClickBackButton() throws IOException {
        Stage s = (Stage) back.getScene().getWindow();
        s.close();
    }

}
