public class Circle {

    private static int numberOfObjects = 0;
    /** The radius of this circle**/
    private double radius; //data field (instance variable)

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
        return getDiameter() * Math.PI;
    }

    void setRadius(double newRadius){
        radius = newRadius;
    }

    double getRadius(){
        return radius;
    }

    static int getNumberOfObjects(){
        //System.out.println(getDiameter());
        return numberOfObjects;
    }

    double getDiameter(){
        return 2*radius;
    }

    void getDescription(){
        System.out.println("The number of objects is "
                + numberOfObjects);
    }
}
