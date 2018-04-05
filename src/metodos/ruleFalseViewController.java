package metodos;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import metodos.model.Function;
import metodos.model.ReglaFalse;
import metodos.model.ReglaFalseObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by core i 5 on 4/04/2018.
 */
public class ruleFalseViewController {

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
    TableView<ReglaFalseObject> tableViewRuleFalse;

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

            Function function = new Function() {

                @Override
                public double eval(double x) {
                    if (firstSign.getText().equals("-") && secondSign.getText().equals("-") ) {
                        return c1 * Math.pow(x, 3) - c2 * x - c3;
                    }else if (firstSign.getText().equals("+") && secondSign.getText().equals("+") ) {
                        return c1 * Math.pow(x, 3) + c2 * x + c3;
                    }else if(firstSign.getText().equals("+") && secondSign.getText().equals("-") ) {
                        return c1 * Math.pow(x, 3) + c2 * x - c3;
                    }else
                        return c1 * Math.pow(x, 3) - c2 * x + c3;
                }
            };


        ReglaFalse reglaFalse = new ReglaFalse();
        raizValue.setText(String.valueOf(reglaFalse.getRaiz(function,x0,x1,it,error)));


        //populating table
        iterationColumn.setCellValueFactory(new PropertyValueFactory<>("iterator"));
        xColumn.setCellValueFactory(new PropertyValueFactory<>("x"));
        xoColumn.setCellValueFactory(new PropertyValueFactory<>("xo"));
        x1Column.setCellValueFactory(new PropertyValueFactory<>("x1"));
        errorColumn.setCellValueFactory(new PropertyValueFactory<>("error"));


        tableViewRuleFalse.setItems(reglaFalse.getItems());


    }

}
