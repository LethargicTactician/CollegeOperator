package neumont.edu.csc150;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class  College {
    private String name;

    private ArrayList<Staff> staff = new ArrayList<>();
    private ArrayList<Faculty> faculty = new ArrayList<>();
    private ArrayList<Student> student = new ArrayList<>();
    private ArrayList<Course> course = new ArrayList<>();

    public void addStudent (Student s) {
        student.add(s);
    }
// add item
    public void addFaculty(Faculty f) {
        faculty.add(f);
    }
    //remove item
    public void removeFaculty(Faculty f) {
        faculty.remove(f);
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public void addStaff(Staff sff) {
        staff.add(sff);
    }
    public void addCourse(Course cse){
        course.add(cse);
    }

    public String toString(){
        String college = "";
        for (int i = 0; i < student.size(); i++) {
            college += student.get(i).toString();
        }

        for (int i = 0; i < faculty.size(); i++){
            college += faculty.get(i).toString();
        }

        for (int i = 0; i < staff.size(); i++){
            college += staff.get(i).toString();
        }
        return college;
    }

}
