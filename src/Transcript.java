import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Transcript
{
    private ArrayList<Course> courses;

    public Transcript(String fileName)
    {
        this.courses = readFromFile(fileName);
    }

    @Override
    public String toString()
    {
        String curr = "";
        for (int i = 0; i < courses.size(); i++)
        {
            curr += courses.get(i) + "\n";
        }
        return curr;
        //return String.valueOf(courses);

    }

    private ArrayList<Course> readFromFile(String fileName)
    {
        File file = new File(fileName);
        ArrayList<Course> courseLs = new ArrayList<>();

        try (Scanner sc = new Scanner(file))
        {
            while (sc.hasNext())
            {
                //Category tempCategory = new Category();
                //ArrayList<Category> category = new ArrayList<>();
                String dept = sc.next();
                //System.out.println("Dept: " + dept);
                String crn = sc.next();
                while (!sc.hasNextInt())
                {
                    crn += " " + sc.next();
                }
                //System.out.println("CRN: " + crn);

                int hours = sc.nextInt();
                //System.out.println("Hours: " + hours);

                Course tempCourse = new Course(dept, crn, hours);
                //System.out.println("Course: " + tempCourse + "\n");
                courseLs.add(tempCourse);
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        return courseLs;
    }

    public int countHours()
    {
        int total = 0;
        for (Course course : courses)
        {
            total += course.getHours();
        }
        return total;
    }

    public int countCourses(String department)
    {
        int count = 0;
        for (Course course : courses)
        {
            if (course.getDepartment().equals(department))
            {
                count += 1;
            }
        }
        return count;
    }

    public boolean courseExists(Course course)
    {
        return courses.contains(course);
    }

    public ArrayList<Course> getCourses()
    {
        return courses;
    }

    public Course get(int index)
    {
        return courses.get(index);
    }

    public int size()
    {
        return courses.size();
    }
}
