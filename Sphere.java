/**
 * Created by User on 07-May-16.
 */
public class Sphere extends ThreeDShape {

    public double area(){
        return 4*3.1416*getLength()*getLength();
    }

    public double volume(){
        return (4/3)*3.1416*getLength()*getLength()*getLength();
    }

}
