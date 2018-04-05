package metodos.model;

/**
 * Created by core i 5 on 5/04/2018.
 */
public class NewtonMethodObject {

    private String iterator;
    private String x;
    private String xo;
    private String error;

    public NewtonMethodObject(){
        this.iterator="";
        this.x="";
        this.xo="";
        this.error="";
    }

    public NewtonMethodObject(String iterator,String x, String xo, String error){
        this.iterator=iterator;
        this.x=x;
        this.xo=xo;
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


    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }


}
