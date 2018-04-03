import java.util.Objects;

public class Course {
    String department;
    String crn;
    int hours;

    public Course(String department, String crn, int hours)
    {
        this.department = department;
        this.crn = crn;
        this.hours = hours;
    }

    @Override
    public String toString() {
        return department + " " + crn + " " + String.valueOf(hours);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCrn() {
        return crn;
    }

    public void setCrn(String crn) {
        this.crn = crn;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public boolean equals(Object rhs)
    {
        Course temp = (Course) rhs;
        return (getDepartment().equals(temp.getDepartment())
                && getCrn().equals(temp.getCrn())
                && getHours() == temp.getHours());
    }
}
