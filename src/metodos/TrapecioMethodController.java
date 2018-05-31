package metodos;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import metodos.model.TrapecioMethod;
import org.mariuszgromada.math.mxparser.Function;


public class TrapecioMethodController {

    @FXML
    TextField functionTrapecioTextField;

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

        Function function = new Function( " At(x) = " + functionTrapecioTextField.getText().toLowerCase());

        double inferiorLimitValue = Double.parseDouble(limitInferiorTextField.getText());
        double superiorLimitValue = Double.parseDouble(limitSuperiorTextField.getText());
        double nSubintervalValues = Double.parseDouble(nValueTextField.getText());

        TrapecioMethod trapecioMethod = new TrapecioMethod(function,inferiorLimitValue,superiorLimitValue,nSubintervalValues);

        hValueTextField.setText(String.valueOf(trapecioMethod.getH()));
        integralValueTextField.setText(String.valueOf(trapecioMethod.calculateTrapecioMethod()));

    }
}
