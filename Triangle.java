/**
 * Created by User on 07-May-16.
 */
public class Triangle extends TwoDShape {
    private double height;

    public double area(){
        return 0.5*getLength()*getHeight();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
