public class Employee extends Person {

    public Employee(){
        // invisible call to super();
        this("d) Invokes Employee's overloaded constructor.");
        //this("Bob", 2);
        System.out.println("b) Performs employee's tasks");
    }

    public Employee(String s){
        System.out.println(s);
    }

    public Employee(String s, int age){
        System.out.println(s + " is aged " + age);
    }

}
