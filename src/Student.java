public class Student extends Person{
    private Course[] courseList;

    public void addCourse(Course c){
        // do stuff
    }

    @Override
    public String toString(){
        return "Student";
    }
}
