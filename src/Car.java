import java.util.*;
public class Car {
    private ArrayList<Wheel> wheels;

    public Car(ArrayList<Wheel> wheels){
        this.wheels = wheels;
    }

    public void printWheels(){
        System.out.println("My car has the following wheels: " + wheels);
    }

    // other methods and stuff
}
