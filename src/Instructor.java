import  java.util.List;
import java.util.ArrayList;

public class Instructor {
    int instructorId;
    String name;
    List<Cours> courses;
    public Instructor(int instructorId , String name ){
        this.instructorId = instructorId;
        this.name = name;
        this.courses = new ArrayList<>();

    }

    void addCours(Cours c){
        courses.add(c);
        System.out.println("course add succcessfully !!");
    }

    void displayCourses(){
        if(courses.size() > 0){
            System.out.println("Courses theach by " + name + " are : ");
            for(int i = 0 ; i < courses.size() ; i++){
                System.out.println(courses.get(i).title);
            }
        }else{
            System.out.println("no Cours assigned yet !!");
        }

    }
}
