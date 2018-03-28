import java.util.ArrayList;

public class Category
{
    String categoryName;
    int hours;
    ArrayList<Course> acceptedCourses;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public ArrayList<Course> getAcceptedCourses() {
        return acceptedCourses;
    }

    public void setAcceptedCourses(ArrayList<Course> acceptedCourses) {
        this.acceptedCourses = acceptedCourses;
    }
}
