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

    @FXML
    Button buttonRuleFalseMethod;


    public void onMethodNewtonClickButton() throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("views/newtonMethodWindow.fxml"));

        Stage newtonMethodWindow = new Stage();

        newtonMethodWindow.initModality(Modality.APPLICATION_MODAL);
        newtonMethodWindow.setTitle("Metodo de newton");

        newtonMethodWindow.setScene(new Scene(root,600,760));
        newtonMethodWindow.setResizable(false);
        newtonMethodWindow.show();
    }

    public void onMethodRuleFalseClickButton() throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("views/falsePositionWindow.fxml"));

        Stage newtonMethodWindow = new Stage();

        newtonMethodWindow.initModality(Modality.APPLICATION_MODAL);
        newtonMethodWindow.setTitle("Metodo de Falsa Posicion");

        newtonMethodWindow.setScene(new Scene(root,600,760));
        newtonMethodWindow.setResizable(false);
        newtonMethodWindow.show();

    }

    public void onMethodSecanteClickButton() throws IOException{

        Parent root = FXMLLoader.load(getClass().getResource("views/secanteMethodWindow.fxml"));

        Stage newtonMethodWindow = new Stage();

        newtonMethodWindow.initModality(Modality.APPLICATION_MODAL);
        newtonMethodWindow.setTitle("Metodo de Secante");

        newtonMethodWindow.setScene(new Scene(root,600,760));
        newtonMethodWindow.setResizable(false);
        newtonMethodWindow.show();
    }


}
