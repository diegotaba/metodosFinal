package metodos.model;

/**
 * Created by core i 5 on 5/04/2018.
 */
public class CalculateRecurrentMethods {
    public Function getFunction(double c1, double c2, double c3, String firstSign, String secondSign){

        Function function = new Function() {
            @Override
            public double eval(double x) {
                if (firstSign.equals("-") && secondSign.equals("-") ) {
                    return c1 * Math.pow(x, 3) - c2 * x - c3;
                }else if (firstSign.equals("+") && secondSign.equals("+") ) {
                    return c1 * Math.pow(x, 3) + c2 * x + c3;
                }else if(firstSign.equals("+") && secondSign.equals("-") ) {
                    return c1 * Math.pow(x, 3) + c2 * x - c3;
                }else
                    return c1 * Math.pow(x, 3) - c2 * x + c3;
            }
        };
        return function;
    }

    public Function getDerivateFunction(double c1, double c2, String firstSign){

        Function function= new Function() {
            @Override
            public double eval(double x) {
                if (firstSign.equals("-") ) {
                    return (c1  * 3)  * Math.pow(x, 2) - c2;
                }else
                    return (c1  * 3)  * Math.pow(x, 2) + c2;
            }
        };
        return function;
    }
}
