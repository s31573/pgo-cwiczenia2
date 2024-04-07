import java.util.ArrayList;

public class Student {

    private String fname, lname, email, address;
    private int indexNumber;
    public ArrayList<Integer> grades = new ArrayList<Integer>();


    public Student(String fname, String lname, int indexNumber, String email, String address){
        this.fname = fname;
        this.lname = lname;
        this.indexNumber = indexNumber;
        this.email = email;
        this.address = address;
    }
    public Student(String fname, String lname, int indexNumber, String email, String address, ArrayList<Integer> grades){
        this.fname = fname;
        this.lname = lname;
        this.indexNumber = indexNumber;
        this.email = email;
        this.address = address;
        this.grades = grades;
    }

    public int getIndexNumber() {
        return indexNumber;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void addGrade(int grade){
        if(grade < 2 || grade > 5) throw new IllegalArgumentException("Ocena nie znajduje się miedzy 2 a 5.");
        grades.add(grade);
    }

    public double getGradesAverage(){

        if(grades.size()<=0) throw new IllegalArgumentException("Brak ocen.");
        if(grades.size()>20) throw new IllegalArgumentException("Student ma wiecej niz 20 ocen.");

        double gradeSum = 0;
        for (double grade : grades ) {
            gradeSum+=grade;
        }

        return Math.round(gradeSum / grades.size());

    }




}
