package metodos.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * Created by core i 5 on 5/04/2018.
 */
public class SecanteMethod {

    ObservableList<ReglaFalseObject> reglaFalseObjects = FXCollections.observableArrayList();

    public double getRaiz(Function f, double xo, double x1, int n, double error) {

        double r = Double.NaN;
        double x2=xo;
        int k = 0;
        double errorP = 0;
        while (Math.abs(f.eval(x2)) > error && k < n) {
            x2=xo-f.eval(xo) * (x1-xo) / (f.eval(x1) - f.eval(xo));
            if(k>0){
                error=x2-errorP;
            }
            errorP=x2;
            reglaFalseObjects.add(new ReglaFalseObject(String.valueOf(k+1),String.valueOf(xo),String.valueOf(x1),String.valueOf(x2),String.valueOf(error)));
            xo=x1;
            x1=x2;
            k++;

        }
        if (k < n || k == n) { r = x2; };
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