import  java.util.List;
import java.util.ArrayList;

public class Cours {
    String title;
    Instructor instructor;
    List<Student> students;

    public Cours(String title , Instructor instructor){
        this.title = title;
        this.instructor= instructor;
        this.students = new ArrayList<>();
    }

    void ajouterS(Student s){
        students.add(s);
    }
}
