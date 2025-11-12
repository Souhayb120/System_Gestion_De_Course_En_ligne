//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    Instructor instructor = new Instructor(1, "Dr. Smith");
    Cours c1 = new Cours("Java", instructor);
    Student s = new Student(1, "Souhayb");
    System.out.println(s.name + " is enrolled in: " + c1.title + " teach by " + instructor.name);
    System.out.println(c1.title + " has student: " + s.name);



}
