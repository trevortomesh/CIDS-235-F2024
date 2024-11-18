public class Employee extends Person {

    public Employee(){
        this("d) Invokes Employee's overloaded constructor.");
        System.out.println("b) Performs employee's tasks");
    }

    public Employee(String s){
        System.out.println(s);
    }

}
