package ecuacionesLineales;

public class Punto {

    //abscisas 
    private float x;
    //ordenadas
    private float y;

    public Punto(float x, float y) {
        this.x = x;
        this.y = y;
    }

    /*public float getPunto(){
    return x,y;
    }*/
    public float getX() {
        return x;
    }

    public String getXY() {
        String XY = String.valueOf(getX()) + "; " + String.valueOf(getY());
        return XY;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

}
