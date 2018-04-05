package metodos;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import metodos.model.*;

import java.io.IOException;

/**
 * Created by core i 5 on 3/04/2018.
 */
public class NewtonMethodViewController {

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

    @FXML
    TextField secondSign;

    @FXML
    TableView<NewtonMethodObject> newtonMethodTable;

    @FXML
    TableColumn<String, NewtonMethodObject> iterationColumn;

    @FXML
    TableColumn<String, NewtonMethodObject> xColumn;

    @FXML
    TableColumn<String, NewtonMethodObject> xoColumn;


    @FXML
    TableColumn<String, ReglaFalseObject> errorColumn;


    public void onClickCleanButton(){

        XoInitValue.clear();
        iterationNumber.clear();
        errorValue.clear();
    }

    public void onClickBackButton() throws IOException {
        Stage s = (Stage) back.getScene().getWindow();
        s.close();
    }

    public void onClickCalculateButton() {

        double c1 = Double.parseDouble(firstCoeficient.getText());
        double c2 = Double.parseDouble(secondCoeficient.getText());
        double c3 = Double.parseDouble(thirdCoficient.getText());
        int it = Integer.parseInt(iterationNumber.getText());
        double error = Double.parseDouble(errorValue.getText());
        double x0 = Double.parseDouble(XoInitValue.getText());

        CalculateRecurrentMethods calculateRecurrentMethods = new CalculateRecurrentMethods();
        Function function = calculateRecurrentMethods.getFunction(c1, c2, c3, firstSign.getText(), secondSign.getText());
        Function dfunction = calculateRecurrentMethods.getDerivateFunction(c1, c2, firstSign.getText());

        NewthonMethod newthonMethod = new NewthonMethod();
        raizValue.setText(
                String.valueOf(
                        newthonMethod.getRaiz(function,dfunction,x0,it,error)
                )
        );

        //populating table
        iterationColumn.setCellValueFactory(new PropertyValueFactory<>("iterator"));
        xColumn.setCellValueFactory(new PropertyValueFactory<>("x"));
        xoColumn.setCellValueFactory(new PropertyValueFactory<>("xo"));
        errorColumn.setCellValueFactory(new PropertyValueFactory<>("error"));


        newtonMethodTable.setItems(newthonMethod.getItems());


    }
}

