/* The Figure class must be declared as abstract 
   because it contains an abstract method */
public abstract class Oop {
    /* because this is an abstract method the body will be blank */
    public abstract double getArea();
}

public class Oop extends Figure {
    private double radius;
    public Oop (double radius) {
        this.radius = radius;}
    public double getArea() {
			return (3.14 * (radius * 2));
    }   
} 
