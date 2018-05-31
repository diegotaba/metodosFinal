package metodos;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import metodos.model.DerivationMethod;
import org.mariuszgromada.math.mxparser.Function;

/**
 * Created by core i 5 on 31/05/2018.
 */
public class DerivationNumericController {

    @FXML
    TextField functionTextField;

    @FXML
    TextField xValueTextField;

    @FXML
    TextField hValueTextField;

    @FXML
    TextField progresiveValueTextField;

    @FXML
    TextField regresiveValueTextField;

    @FXML
    TextField centralValueTextField;

    @FXML
    Button calculateButton;

    public void onCalculateButtonDerivationMethod(){

        Function function = new Function( " At(x) = " + functionTextField.getText().toLowerCase());

        double xValueTextFieldValue = Double.parseDouble(xValueTextField.getText());
        double hValueTextFieldValue = Double.parseDouble(hValueTextField.getText());

        DerivationMethod derivationMethod = new DerivationMethod(function,xValueTextFieldValue,hValueTextFieldValue);
        progresiveValueTextField.setText(String.valueOf(derivationMethod.calculateProgresiveDerivationMethod()));
        regresiveValueTextField.setText(String.valueOf(derivationMethod.calculateRegresiveDerivationMethod()));
        centralValueTextField.setText(String.valueOf(derivationMethod.calculateCentreDerivationMethod()));


    }
}
