public class Course {
    String department;
    int number;
    int hours;

    @Override
    public String toString() {
        return String.valueOf(department) + " " + String.valueOf(number) + " " + String.valueOf(hours);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
}
