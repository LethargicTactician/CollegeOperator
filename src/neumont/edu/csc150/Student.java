package neumont.edu.csc150;

import java.util.ArrayList;

public class Student extends Perosn {

  public static final double MIN_GPA_REQUREMENT = 1.0;
  private ArrayList<String> students;
  private double gpa;
  private ArrayList<String> course = new ArrayList<>();


  public Student(){

  }

  //GETTERS AND SETTERS

  public double getGpa() {

    return gpa;
  }

  public void setGpa(double gpa) {
    if (gpa < MIN_GPA_REQUREMENT){
      throw new IllegalArgumentException("Gpa too low");
    }
    this.gpa = gpa;
  }

  public ArrayList<String> getCourse() {
    return course;
  }

  public void setCourse(ArrayList<String> course) {
    setCourse(course);
  }

//  public void addCourse(String c) {
//    course.add(c);
//    course.add("CS Math");
//    course.add("Networking");
//    course.add("OOP");
//    course.add("Web");
//
//  }

//REMOVE/ ADD STUDENT
  public ArrayList<String> getStudents() {
    return students;
  }
  public void addStudent(String studentName) {
    this.students.add(studentName);
  }
  public boolean removeStudent(String studentName){
    return this.students.remove(studentName);
  }


  public Student(String name, int birthDay, int birthMonth, double gpa) {
    super(name, birthDay, birthMonth);
    setGpa(gpa);
//    setCourse(course);
  }

  @Override
  public String toString() {
    return "Student{" +
            super.toString() +
            ", gpa = " + gpa +
            ", course = '" + getCourse() + '\'' +
            '}';
  }
}
