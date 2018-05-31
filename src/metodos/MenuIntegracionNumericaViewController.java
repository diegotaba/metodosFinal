package metodos;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.io.IOException;

/**
 * Created by core i 5 on 30/05/2018.
 */
public class MenuIntegracionNumericaViewController {

    @FXML
    Button simpsonMethodButton;

    @FXML
    Button trapecioButtonMenuOption;


    public void simpsonMethodClick ( ) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("views/simpsonMethodView.fxml"));

        Stage simpsonMethodView = new Stage();

        simpsonMethodView.initModality(Modality.WINDOW_MODAL);
        simpsonMethodView.setTitle("Menu Integración Numerica");
        simpsonMethodView.centerOnScreen();


        simpsonMethodView.setScene(new Scene(root,600,400));
        simpsonMethodView.setResizable(false);
        simpsonMethodView.show();

    }

    public void trapecioButtonMenuOptionClick () throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("views/trapecioMethodView.fxml"));

        Stage trapecioMethodView = new Stage();

        trapecioMethodView.initModality(Modality.WINDOW_MODAL);
        trapecioMethodView.setTitle("Menu Integración Numerica");
        trapecioMethodView.centerOnScreen();


        trapecioMethodView.setScene(new Scene(root,600,400));
        trapecioMethodView.setResizable(false);
        trapecioMethodView.show();


    }
}
