package metodos;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class PresentationController {

    @FXML
    Button buttonNewtonMethod;


    public void onMethodNewtonClickButton() throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("views/newtonMethodWindow.fxml"));

        Stage newtonMethodWindow = new Stage();

        newtonMethodWindow.initModality(Modality.APPLICATION_MODAL);
        newtonMethodWindow.setTitle("Metodo de newton");

        newtonMethodWindow.setScene(new Scene(root,415,460));
        newtonMethodWindow.setResizable(false);
        newtonMethodWindow.show();

    }

}
