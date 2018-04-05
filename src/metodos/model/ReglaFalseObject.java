package metodos.model;

/**
 * Created by core i 5 on 5/04/2018.
 */
public class ReglaFalseObject {

    private String iterator;
    private String x;
    private String xo;
    private String x1;
    private String error;

    public ReglaFalseObject(){
        this.iterator="";
        this.x="";
        this.xo="";
        this.x1="";
        this.error="";
    }

    public ReglaFalseObject(String iterator,String x, String xo, String x1, String error){
        this.iterator=iterator;
        this.x=x;
        this.xo=xo;
        this.x1=x1;
        this.error=error;
    }

    public String getIterator() {
        return iterator;
    }

    public void setIterator(String iterator) {
        this.iterator = iterator;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getXo() {
        return xo;
    }

    public void setXo(String xo) {
        this.xo = xo;
    }

    public String getX1() {
        return x1;
    }

    public void setX1(String x1) {
        this.x1 = x1;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }


}
