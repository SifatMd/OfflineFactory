/**
 * Created by User on 07-May-16.
 */
public class Cube extends ThreeDShape {

    public double area(){
        return getLength()*getLength();
    }

    public double volume(){
        return getLength()*getLength()*getLength();
    }


}
