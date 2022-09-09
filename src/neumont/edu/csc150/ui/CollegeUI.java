package neumont.edu.csc150.ui;

import neumont.edu.csc150.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;

public class CollegeUI {
//    ArrayList<String> Courses = new ArrayList<>();

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public void displayMenu(){
        System.out.println("Welcome! Anything you'd like to do?\r\n"  +
                "\t1 - Add Student, Faculty, or Staff\r\n" +
                "\t2 - Remove Student, Faculty, or Staff\r\n" +
                "\t3 - View current details\r\n" +
                "\t4 - Exit");
    }
    public void displayFirstSelection(){
        System.out.println("what would you like to add? \r\n" +
                "\t1- Student \r\n" +
                "\t2 - Faculty\r\n" +
                "\t3 - Staff\r\n" +
                "\t4 - Return to main menu\r\n");
    }
    public void displaySecondSelection(){
        System.out.println("Who do you want to remove?\r\n " +
                "\t1- Remove Student \r\n" +
                "\t2 - Remove Faculty \r\n" +
                "\t3 - Remove Staff \r\n" +
                "\t4 - Return to main menu\r\n");

    }
    public void displayThirdSelection(){
        System.out.println("College Information:\r\n");
    }

    public int displayWhichToDelete(ArrayList<Perosn> person) {
        int persona = 0;
        System.out.print("Which Person would you like to remove? ");

        for (int i = 0; i < person.size(); i++) {
            System.out.println(i+1 + "- " + person.get(i));//Arraylist of people
        }

        try {
            String thing = in.readLine();
            persona = Integer.parseInt(thing);
            //Have user make selection, then return int of that object
        }catch(Exception e){

        }
        return persona -1;
    }

    public int getUserInputAsInt(int min, int max) throws IOException{
        float value = getUserInputAsFloat(min,max);
        return(int) value;
    }

    public float getUserInputAsFloat(float min, float max) throws IOException {
        float input = 0;
        do {
            String line = in.readLine();
            try {
                input= Float.parseFloat(line);
                if (input < min || input > max) {
                    throw new NumberFormatException("Out of range");
                }
                break;
            } catch (NumberFormatException ex) {
                System.out.println("Input Invalid " + "You must enter an number between " + min + " and " + max);
            }
        } while (true);
        return input;
    }

    public Perosn getValueForStudent() throws IOException {
        Student stu = new Student();
        System.out.print("What is the Student's name? ");
        stu.setName(in.readLine());

        System.out.println("Day of birth? ");
        stu.setBirthDay(Integer.parseInt(in.readLine()));

        System.out.println("Month of birth? ");
        stu.setBirthDay(Integer.parseInt(in.readLine()));

        System.out.println("What's their current GPA? ");
        stu.setGpa(Double.parseDouble(in.readLine()));

        return stu;
    }

    public Perosn getValueForFaculty() throws IOException {
        Faculty fac = new Faculty();
        System.out.print("What is their name? ");
        fac.setName(in.readLine());

        System.out.println("Day of birth? ");
        fac.setBirthDay(Integer.parseInt(in.readLine()));

        System.out.println("Month of birth? ");
        fac.setBirthDay(Integer.parseInt(in.readLine()));

        System.out.println("What's their room number? ");
        fac.setRoomNum(Integer.parseInt(in.readLine()));

        return fac;
    }

   public Perosn getValueForStaff() throws IOException {
        Staff staff = new Staff();
        System.out.print("What is their name? ");
        staff.setName(in.readLine());

        System.out.println("Day of birth? ");
        staff.setBirthDay(Integer.parseInt(in.readLine()));

        System.out.println("Month of birth? ");
        staff.setBirthDay(Integer.parseInt(in.readLine()));

        System.out.println("What's their room job title? ");
        staff.setJobTitle(in.readLine());

        return staff;
    }

}
