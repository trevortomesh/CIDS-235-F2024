public class WonkyRectangle{
    private double width;
    private double height;

    public WonkyRectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public WonkyRectangle(double width, double height,
                     String color, boolean filled){
        this.width = width;
        this.height = height;
       // setColor(color);
       // setFilled(filled);

    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }




//    public String toString(){
//
//        return "rectangle " + super.toString() + "\nand the area is " + this.getArea();
//    }
}
