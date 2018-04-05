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
import java.util.ArrayList;
import java.util.List;

/**
 * Created by core i 5 on 4/04/2018.
 */
public class SecanteMethodViewController {

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
    TextField secondSign;

    @FXML
    TextField XoInitValue;

    @FXML
    TextField X1InitValue;

    @FXML
    TextField iterationNumber;

    @FXML
    TableView<ReglaFalseObject> tableViewSecanteMethod;

    @FXML
    TableColumn<String, ReglaFalseObject> iterationColumn;

    @FXML
    TableColumn<String, ReglaFalseObject> xColumn;

    @FXML
    TableColumn<String, ReglaFalseObject> xoColumn;

    @FXML
    TableColumn<String, ReglaFalseObject> x1Column;

    @FXML
    TableColumn<String, ReglaFalseObject> errorColumn;


    public void onClickCleanButton(){

        XoInitValue.clear();
        iterationNumber.clear();
        errorValue.clear();
        X1InitValue.clear();
    }

    public void onClickBackButton() throws IOException {
        Stage s = (Stage) back.getScene().getWindow();
        s.close();
    }

    public void onClickCalculateButton(){

        double c1 = Double.parseDouble(firstCoeficient.getText());
        double c2 = Double.parseDouble(secondCoeficient.getText());
        double c3 = Double.parseDouble(thirdCoficient.getText());
        int it =Integer.parseInt(iterationNumber.getText());
        double error = Double.parseDouble(errorValue.getText());
        double x0=Double.parseDouble(XoInitValue.getText());
        double x1=Double.parseDouble(X1InitValue.getText());

        CalculateRecurrentMethods calculateRecurrentMethods = new CalculateRecurrentMethods();
        Function function = calculateRecurrentMethods.getFunction(c1, c2, c3, firstSign.getText(), secondSign.getText());


        SecanteMethod secanteMethod = new SecanteMethod();
        raizValue.setText(String.valueOf(secanteMethod.getRaiz(function,x0,x1,it,error)));


        //populating table
        iterationColumn.setCellValueFactory(new PropertyValueFactory<>("iterator"));
        xColumn.setCellValueFactory(new PropertyValueFactory<>("x"));
        xoColumn.setCellValueFactory(new PropertyValueFactory<>("xo"));
        x1Column.setCellValueFactory(new PropertyValueFactory<>("x1"));
        errorColumn.setCellValueFactory(new PropertyValueFactory<>("error"));


        tableViewSecanteMethod.setItems(secanteMethod.getItems());

    }

}
