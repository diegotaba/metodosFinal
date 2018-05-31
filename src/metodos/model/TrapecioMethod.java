package metodos.model;

import org.mariuszgromada.math.mxparser.Expression;

/**
 * Created by core i 5 on 31/05/2018.
 */
public class TrapecioMethod {

    private double nSubintervalsValue;
    private double inferiorLimitValue;
    private double superiorLimitValue;
    private double h;
    private org.mariuszgromada.math.mxparser.Function simpsonMethodFunction;

    public TrapecioMethod(org.mariuszgromada.math.mxparser.Function function, double inferiorLimitValue, double superiorLimitValue, double nSubintervalsValue){

        this.simpsonMethodFunction = function;
        this.inferiorLimitValue = inferiorLimitValue;
        this.superiorLimitValue = superiorLimitValue;
        this.nSubintervalsValue = nSubintervalsValue;

    }

    public double calculateTrapecioMethod(){

        double counter = 0;
        double result = 0;
        double hStatic = h;
        while (inferiorLimitValue  <= superiorLimitValue){
            if (counter == 0) {
                Expression expression = new Expression( "At(" + inferiorLimitValue + ")" , simpsonMethodFunction);
                result = (expression.calculate() + result );
                System.out.println(result);
            }else if(counter == superiorLimitValue){
                Expression expression = new Expression( "At(" + inferiorLimitValue + ")" , simpsonMethodFunction);
                result = (expression.calculate() + result );
                System.out.println(result);

            } else {
                Expression expression = new Expression( "At(" + inferiorLimitValue + ")" , simpsonMethodFunction);
                result =  (( 2  * expression.calculate()) + result );
                System.out.println(result);
            }
            counter = counter+1;
            inferiorLimitValue = inferiorLimitValue + h;

        }
        System.out.println((( h / (2) ) * result));
        return ((h / (2) * result));
    }

    public double calculateHValue(){
        this.h = ((superiorLimitValue - inferiorLimitValue) / nSubintervalsValue);
        return this.h;
    }


    public double getinferiorLimitValue() {
        return inferiorLimitValue;
    }

    public void setinferiorLimitValue(double inferiorLimitValue) {
        this.inferiorLimitValue = inferiorLimitValue;
    }

    public double getnSubintervalsValue() {
        return nSubintervalsValue;
    }

    public void setnSubintervalsValue(double nSubintervalsValue) {
        this.nSubintervalsValue = nSubintervalsValue;
    }

    public double getsuperiorLimitValue() {
        return superiorLimitValue;
    }

    public void setsuperiorLimitValue(double superiorLimitValue) {
        this.superiorLimitValue = superiorLimitValue;
    }

    public double getH() {
        return calculateHValue();
    }
}
