package neumont.edu.csc150.controller;

import neumont.edu.csc150.College;
import neumont.edu.csc150.Perosn;
import neumont.edu.csc150.ui.CollegeUI;

import java.io.IOException;
import java.text.CollationElementIterator;
import java.util.ArrayList;

public class CollegeController {

    private CollegeUI ui = new CollegeUI();
    private ArrayList<Perosn> people = new ArrayList<>();
    private ArrayList<College> college = new ArrayList<>();

    public void run() throws IOException{
        boolean keepLooping = true;
        while (keepLooping){
            //ui.displayFirstSelection();
            ui.displayMenu();
            int selection = ui.getUserInputAsInt(1, 4);

            switch (selection){
                case 1:
                    boolean stuLooop = true;
                    while (stuLooop) {
                        ui.displayFirstSelection();
                        int selec2 = ui.getUserInputAsInt(1, 4);
                        switch (selec2){
                            case 1:
                                doCreateStudent();
                                break;
                            case 2:
                            doCreateFaculty();
                            break;
                            case 3:
                            doCreateStaff();
                            break;
                            case 4:
                            stuLooop = false;
                            break;
                        }
                    }
                case 2:
                    boolean remLoop = true;
                    while(remLoop) {
                        ui.displaySecondSelection();
                        int select3 = ui.getUserInputAsInt(1, 4);
                        switch (select3){
                            case 1:
                                doDeleteStudent();
                                break;
                            case 2:
                                doDeleteFaculty();
                                break;
                            case 3:
                                doDeleteStaff();
                                break;
                            case 4:
                                remLoop = false;
                                break;

                        }
                    }
                case 3:
                    doDisplayItems();

                    break;
                case 4:
                    keepLooping = false;
                    break;
                default:
                    throw new IllegalArgumentException("unknown menu Item");
            }
        }
    }

//    private void doDeletePerson() throws IOException{
//        this.people.remove();
//    }

//    private void NameCollege() throws IOException{
//        this.college.set(ui.setCollegeName(college));
//    }

    private void doDeleteStudent() throws IOException{
        this.people.remove(ui.displayWhichToDelete(people));
    }
    private void doDeleteFaculty() throws IOException{
        this.people.remove(ui.displayWhichToDelete(people));
    }
    private void doDeleteStaff() throws IOException{
        this.people.remove(ui.displayWhichToDelete(people));
    }

    private void doCreateStudent() throws IOException{
        this.people.add(ui.getValueForStudent());
    }

    private void doCreateFaculty() throws IOException{

        this.people.add(ui.getValueForFaculty());
    }

    private void doCreateStaff() throws IOException{
//        Student staff = ui.getValueForStaff();
        this.people.add(ui.getValueForStaff());
    }

    private void doDisplayItems() throws IOException{
//        people.addAll(ui.displayThirdSelection());
        //System.out.println(people);
        //or
        for(int i = 0; i < people.size(); i++){
            System.out.println(people.get(i));
        }
    }


}
