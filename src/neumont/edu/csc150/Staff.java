package neumont.edu.csc150;

public class Staff extends Perosn{
    private String jobTitle;

    public Staff(String name, int birthDay, int birthMonth, String jobTitle) {
        super(name, birthDay, birthMonth);
        setJobTitle(jobTitle);
    }

    public Staff() {

    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {

        this.jobTitle = jobTitle;

    }

    @Override
    public String toString() {
        return "\nStaff{" +
                super.toString() +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
