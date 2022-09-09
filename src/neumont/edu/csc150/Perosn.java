package neumont.edu.csc150;

import java.util.Objects;

public class Perosn {
    public static final int MIN_NAME_LENGTH = 3;
    protected String name;
    protected int birthDay;
    protected int birthMonth;

//CONSTRUCTOR
    public Perosn(String name, int birthDay, int birthMonth) {
        setName(name);
        setBirthDay(birthDay);
        setBirthMonth(birthMonth);
    }
//DEFAULT CONST
    public Perosn() {
    }

    // GETTERS AND SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.isEmpty() || name.length() < MIN_NAME_LENGTH){
            throw new IllegalArgumentException("Invalid name");
        }
        this.name = name;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    @Override
    public String toString() {
        return "Person: " +
                "name='" + name + '\'' +
                ", birthDay=" + birthDay +
                ", birthMonth=" + birthMonth +
                ' ';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Perosn that = (Perosn) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(name , that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

//    public void setStudentName(String readLine) {
//    }
}
