public class Circle {
    /** The radius of this circle**/
    double radius = 1;

    Circle(double newRadius){
        radius = newRadius;
    }

    /** Return the area of this circle**/
    double getArea(){
        return radius*radius*Math.PI;
    }

    /** Return the perimeter of this circle**/
    double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    void setRadius(double newRadius){
        radius = newRadius;
    }
}
