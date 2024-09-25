public class Main {
    public static void main(String[] args) {

        int b = 7;
        int a;
        a = 5;
        b = a; //a is 5 and b is 5
        a = 12;
        System.out.println("b is now " + b +
                " and a is now " + a);

        Circle c1; //create a reference variable
       // System.out.println(c1);
        c1 = new Circle(6.0); //create the object
        Circle c2 = new Circle(8.0);

        System.out.println("c1 was " + c1);
        System.out.println("c2 was " + c2);
        c2 = c1;
        System.out.println("c1 is now" + c1);
        System.out.println("c2 is now " + c2);


        c1.radius = 100;
        System.out.println("c2 radius is now: " + c2.radius);
        System.out.println(c1);


//        double area = c1.getArea();
//        double rad = c1.radius;
//        System.out.println(rad);
//        int[] x = {1,2,3,4,5};
//        int y = 7;

//        System.out.println("x is storing: " + x);
//        System.out.println("y is storing: "+ y);
//        System.out.println("c1 is storing: " + c1);

//        Cat glitch = new Cat();
//        //glitch.name = "Glitch McPixel Tomesh";
//        //glitch.age = 13;
//        //glitch.weight = 15.0;
//        //glitch.sex = 'M';
//        //glitch.color = "Tuxedo";
//        System.out.println(glitch.name);
//
//        Circle c1 = new Circle(7.0);
//        Circle c2 = new Circle(2.0);
//        //c2.setRadius(2.0);
//        System.out.println(c1.radius);
//        System.out.println(c2.radius);
//        c1.setRadius(3.1415);
//        System.out.println("The radius is now "+ c1.radius);
//        double x = c1.getArea();
//        System.out.println("The area of my circle is " + c1.getArea());
//        //System.out.println("Hello world!");
//        String cat1Name = "Glitch";
//        String cat2Name = "Haku";
//        String cat3Name = "Genki";
//        String cat4Name = "Soo soo";
//        String cat5Name = "Tsuki";
//        String cat6Name = "Wooper";
//
//        int cat1Age = 13;
//        int cat2Age = 4;
//        int cat3Age = 1;
//        int cat4Age = 0;
//        int cat5Age = 2;
//        int cat6Age = 1;
//
//        char cat1Sex = 'M';
//        char cat2Sex = 'M';
//        char cat3Sex = 'M';
//        char cat4Sex = 'F';
//        char cat5Sex = 'M';
//        char cat6Sex = 'M';
//
//        double cat1Weight = 15.0;
//        double cat2Weight = 13.5;
//        double cat3Weight = 14.0;
//        double cat4Weight = 5.0;
//        double cat5Weight = 8.0;
//        double cat6Weight = 0.2;
//
//        String cat1Color = "tuxedo";
//        String cat2Color = "tuxedo";
//        String cat3Color = "orange";
//        String cat4Color = "black";
//        String cat5Color = "black";
//        String cat6Color = "pink";

        //sayMeow(cat1Name,cat6Color);

    }

    public static void printThing(int a){
        System.out.println(a);
    }

}

