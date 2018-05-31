package metodos.model;

import org.mariuszgromada.math.mxparser.Expression;

/**
 * Created by core i 5 on 31/05/2018.
 */
public class DerivationMethod {

    private org.mariuszgromada.math.mxparser.Function function;
    private double xValue;
    private  double hValue;

    public DerivationMethod(org.mariuszgromada.math.mxparser.Function function, double xValue, double hValue){
        this.function = function;
        this.xValue = xValue;
        this.hValue = hValue;
    }

    public double calculateProgresiveDerivationMethod(){
        double result;
        double result1;
        double finalResult;

        Expression expression = new Expression( "At(" + ( xValue + hValue ) + ")" , function);
        result = (expression.calculate());

        Expression expression1 = new Expression( "At(" + ( xValue ) + ")" , function);
        result1 = (expression1.calculate() );

        finalResult = ((result - result1) / hValue);

        return finalResult;

    }

    public double calculateRegresiveDerivationMethod(){

        double result ;
        double result1 ;
        double finalResult;

        Expression expression = new Expression( "At(" + xValue + ")" , function);
        result = (expression.calculate());

        Expression expression1 = new Expression( "At(" + (xValue - hValue) + ")" , function);
        result1 = (expression1.calculate() );

        finalResult = ((result - result1) / hValue);

        return finalResult;

    }

    public double calculateCentreDerivationMethod(){

        double result;
        double result1;
        double finalResult;

        Expression expression = new Expression( "At(" + (xValue + hValue) + ")" , function);
        result = (expression.calculate());

        Expression expression1 = new Expression( "At(" + (xValue - hValue) + ")" , function);;
        result1 = (expression1.calculate());

        finalResult = ((result - result1) / (2 * hValue));
        return finalResult;
    }
}
