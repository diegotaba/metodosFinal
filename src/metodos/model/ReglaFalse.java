package metodos.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * Created by core i 5 on 4/04/2018.
 */
public class ReglaFalse {

    ObservableList<ReglaFalseObject> reglaFalseObjects = FXCollections.observableArrayList();

    public double getRaiz(Function f, double xo, double x1, int n, double error) {

        double r = Double.NaN;
        double x = xo;
        int k = 0;
        double errorP = 0;
        while (Math.abs(f.eval(x)) > error && k < n) {
            x = (xo * f.eval(x1) - x1 * f.eval(xo)) / (f.eval(x1) - f.eval(xo));
            if(k>0){
                error=x-errorP;
            }
            errorP=x;

            reglaFalseObjects.add(new ReglaFalseObject(String.valueOf(k+1),String.valueOf(x),String.valueOf(xo),String.valueOf(x1),String.valueOf(error)));

            if (f.eval(xo) * f.eval(x) < 0)
                x1 = x;
            else
                xo = x;
            k++;

        }
        if (k < n || k == n) { r = x; };
        return r;
    }

    public ObservableList<ReglaFalseObject> getItems(){
        return reglaFalseObjects;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}