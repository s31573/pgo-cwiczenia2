import java.util.ArrayList;

public class StudentGroup {

    public String nazwa;

    private int maxMembers = 15;

    public ArrayList<Student> studentsList = new ArrayList<Student>();

    public StudentGroup(String name){
        this.nazwa = name;
    }

    public void addStudent(Student student){

        if(studentsList.contains(student)) throw new IllegalStateException("Lista zawiera już tego studenta.");
        if(studentsList.size() + 1 > maxMembers) throw new IllegalStateException("Przekroczono maksymalną liczbe studentow w tej grupie.");

        studentsList.add(student);

    }

}
