/**
 * Created by User on 07-May-16.
 */
public class Rectangle extends TwoDShape {
    private double width;

    public double area(){
        return getLength()*getWidth();
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
