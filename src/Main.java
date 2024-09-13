public class Main {
    public static void main(String[] args) {

        Cat glitch = new Cat();
        glitch.name = "Glitch McPixel Tomesh";
        glitch.age = 13;
        glitch.weight = 15.0;
        glitch.sex = 'M';
        glitch.color = "Tuxedo";
        //System.out.println(glitch.name);

        Circle c1 = new Circle();
        Circle c2 = new Circle();
        c2.setRadius(2.0);
        System.out.println(c1.radius);
        System.out.println(c2.radius);
        c1.setRadius(3.1415);
        System.out.println("The radius is now "+ c1.radius);
        System.out.println("The area of my circle is " + c1.getArea());
        //System.out.println("Hello world!");
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

    public static void sayMeow(String cat, String catColor){
        System.out.println(cat + " a " + catColor + " cat says MEOW!");
    }

}