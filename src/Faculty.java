public class Faculty extends Employee {
    private Course[] courseList;

    public Faculty(){
        // invisible call to super()
        System.out.println("a) Performs faculty tasks");
    }
    public void addCourse(Course c){
        // do stuff
    }
}
