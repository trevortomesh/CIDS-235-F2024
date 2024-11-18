public class Circle extends GeometricObject{

   // private static int numberOfObjects = 0;
    /** The radius of this circle**/
    private double radius; //data field (instance variable)

    public Circle(){
        //System.out.println("Default Circle Constructor Called");
        this.radius= 1.0;
    }

    public Circle(double radius){
        //super();
        this.radius = radius;
        //numberOfObjects++;
        //this(1.0,"white",true);
        //System.out.println("Circle Constructor Called");

    }

    public Circle(double radius, String color, boolean filled){
        this.radius=radius;
        setColor(color);
        setFilled(filled);
        //System.out.println("Circle Constructor Called");

    }

    /** Return the area of this circle**/
    public double getArea(){
        //System.out.println("The Area is " + radius*radius*Math.PI);
        //System.out.println(Math.pow(5,2));
        return radius*radius*Math.PI;
    }

    /** Return the perimeter of this circle**/
    public double getPerimeter(){
        return getDiameter() * Math.PI;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

//    static int getNumberOfObjects(){
//        //System.out.println(getDiameter());
//        return numberOfObjects;
//    }

    public double getDiameter(){
        return 2*radius;
    }

    public void printCircle(){
        System.out.println("the circle was created "+getDateCreated()+
                " and the radius is "+getDateCreated());
    }
}
