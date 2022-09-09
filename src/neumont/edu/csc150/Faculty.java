package neumont.edu.csc150;

import java.util.ArrayList;

public class Faculty extends Perosn{

    private int roomNum;
    private boolean officeWorkTime;
    private ArrayList<String> courseList = new ArrayList<>();
    private String officeHours;

    //CONSTRUCTOR
    public Faculty(String name, int birthDay, int birthMonth, int roomNum, boolean officeWorkTime, String officeHours) {
        super(name, birthDay, birthMonth);
        setRoomNum(roomNum);
        setOfficeWorkTime(officeWorkTime);
        //setCourseList(courseList);
        setOfficeHours(officeHours);
    }


//DEFAULT CONS
    public Faculty() {

    }
 //GETTERS AND SETTERS
    public int getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    public boolean isOfficeWorkTime() {
        return officeWorkTime;
    }

    public void setOfficeWorkTime(boolean officeWorkTime) {
        this.officeWorkTime = officeWorkTime;
    }

    public ArrayList<String> getCourseList() {
        return courseList;
    }

    private void setCourseList(ArrayList<String> courseList) {
        this.courseList = courseList;
    }

    public void addCourseToTeach(String c){
        this.courseList.add(c);
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public void addCourse(String c) {
        courseList.add(c);

    }


    @Override
    public String toString() {
        return "\nFaculty{" +
                super.toString() +
                "roomNum=" + roomNum +
                ", officeWorkTime=" + officeWorkTime +
                ", course = '" + courseList + '\'' +
                ", officeHours='" + officeHours + '\'' +
                '}';
    }
}
