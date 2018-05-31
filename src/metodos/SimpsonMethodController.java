package metodos;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import metodos.model.SimpsonMethod;
import org.mariuszgromada.math.mxparser.Function;

public class SimpsonMethodController {

    @FXML
    TextField functionSimpsonTextField;

    @FXML
    TextField limitInferiorTextField;

    @FXML
    TextField limitSuperiorTextField;

    @FXML
    TextField nValueTextField;

    @FXML
    TextField hValueTextField;

    @FXML
    TextField integralValueTextField;

    @FXML
    Button calculateButton;

    @FXML
    Button cleanButton;


    public void onCalculateButtonClick(){

        Function function = new Function( " At(x) = " + functionSimpsonTextField.getText().toLowerCase());

        double inferiorLimitValue = Double.parseDouble(limitInferiorTextField.getText());
        double superiorLimitValue = Double.parseDouble(limitSuperiorTextField.getText());
        double nSubintervalValues = Double.parseDouble(nValueTextField.getText());

        SimpsonMethod simpsonMethod = new SimpsonMethod(function,inferiorLimitValue,superiorLimitValue,nSubintervalValues);

        hValueTextField.setText(String.valueOf(simpsonMethod.getH()));
        integralValueTextField.setText(String.valueOf(simpsonMethod.calculateSimpsonMethod()));

        }
    }
