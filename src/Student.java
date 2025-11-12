import java.util.List;
import java.util.ArrayList;
public class Student {
    int id;
    String name;
    List<Cours> courses;

    public Student(int id , String name){
        this.id = id;
        this.name = name;
        this.courses = new ArrayList<>();
    }

    void inscrire(Cours c){
        courses.add(c);
        c.ajouterS(this);

    }
}
