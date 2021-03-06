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

        newtonMethodWindow.setScene(new Scene(root,600,650));
        newtonMethodWindow.setResizable(false);
        newtonMethodWindow.show();
    }

    public void onMethodRuleFalseClickButton() throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("views/falsePositionWindow.fxml"));

        Stage newtonMethodWindow = new Stage();

        newtonMethodWindow.initModality(Modality.APPLICATION_MODAL);
        newtonMethodWindow.setTitle("Metodo de Falsa Posicion");

        newtonMethodWindow.setScene(new Scene(root,600,650));
        newtonMethodWindow.setResizable(false);
        newtonMethodWindow.show();

    }

    public void onMethodSecanteClickButton() throws IOException{

        Parent root = FXMLLoader.load(getClass().getResource("views/secanteMethodWindow.fxml"));

        Stage newtonMethodWindow = new Stage();

        newtonMethodWindow.initModality(Modality.APPLICATION_MODAL);
        newtonMethodWindow.setTitle("Metodo de Secante");

        newtonMethodWindow.setScene(new Scene(root,415,460));
        newtonMethodWindow.setResizable(false);
        newtonMethodWindow.show();
    }

    public void onMethodIntegrationButton () throws IOException{

        Parent root = FXMLLoader.load(getClass().getResource("views/menuIntegracionNumerica.fxml"));

        Stage methodIntegrationWindow = new Stage();

        methodIntegrationWindow.initModality(Modality.APPLICATION_MODAL);
        methodIntegrationWindow.setTitle("Menu Integración Numerica");
        methodIntegrationWindow.centerOnScreen();


        methodIntegrationWindow.setScene(new Scene(root,300,150));
        methodIntegrationWindow.setResizable(false);
        methodIntegrationWindow.show();
    }

    public void onMethodDerivationClickButton () throws IOException{

        Parent root = FXMLLoader.load(getClass().getResource("views/derivationMethodView.fxml"));

        Stage methodderivationMethodView = new Stage();

        methodderivationMethodView.initModality(Modality.APPLICATION_MODAL);
        methodderivationMethodView.setTitle("Derivacion Numerica");
        methodderivationMethodView.centerOnScreen();


        methodderivationMethodView.setScene(new Scene(root,600,400));
        methodderivationMethodView.setResizable(false);
        methodderivationMethodView.show();
    }

}
