public class Circle {

    static int numberOfObjects = 0;
    /** The radius of this circle**/
    double radius; //data field (instance variable)

    Circle(double radius){
        this.radius = radius;
        numberOfObjects++;
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

    static int getNumberOfObjects(){
        return numberOfObjects;
    }
}
