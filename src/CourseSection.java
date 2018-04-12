import java.time.LocalTime;

public class CourseSection
{
    String department;
    String crn;
    int hours;
    LocalTime time;


    public CourseSection(String department, String crn, int hours, LocalTime time)
    {
        this.department = department;
        this.crn = crn;
        this.hours = hours;
        this.time = time;
    }

    @Override
    public String toString() {
        return department + " " + crn + " " + String.valueOf(hours) + " " + String.valueOf(time);
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

    public LocalTime getTime()
    {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object rhs)
    {
        CourseSection temp = (CourseSection) rhs;
        return (getDepartment().equals(temp.getDepartment())
                && getCrn().equals(temp.getCrn())
                && getHours() == temp.getHours()
                && getTime().getHour() == temp.getTime().getHour()
                && getTime().getMinute() == temp.getTime().getMinute());
    }
}
