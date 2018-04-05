package metodos.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * Created by core i 5 on 5/04/2018.
 */
public class NewthonMethod {

    ObservableList<NewtonMethodObject> newtonMethodObjects = FXCollections.observableArrayList();

    public double getRaiz(IFuncion f, IFuncion df, double xo, int n, double error){
        double r=Double.NaN;
        int k = 0;
        double errorT=0;
        double x = 0;
        while(Math.abs(f.eval(xo))> error && k < n ){
            x=xo;
            xo=xo-f.eval(xo)/df.eval(xo);
            if(k>0){
                error=errorT-x;
            }
            errorT=x;
            newtonMethodObjects.add(new NewtonMethodObject(String.valueOf(k+1),String.valueOf(x),String.valueOf(xo),String.valueOf(error)));
            k++;
        }
        if (k < n || k == n) { r = xo; }
        return r;
    }

    public ObservableList<NewtonMethodObject> getItems(){
        return newtonMethodObjects;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
