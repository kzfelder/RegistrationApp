import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Registrar
{
    private ArrayList<CourseSection> courses;

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

    public Registrar(String fileName)
    {
        this.courses = readFromFile(fileName);
    }

    private ArrayList<CourseSection> readFromFile(String fileName)
    {
        File file = new File(fileName);
        ArrayList<CourseSection> courseLs = new ArrayList<>();

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

                String time = sc.next();
                LocalTime formattedTime = LocalTime.parse(time, DateTimeFormatter.ofPattern("H:mm"));
                //DateTimeFormatter format = DateTimeFormatter.ofPattern("H:mm");
                //LocalTime formattedTime = LocalTime.from(format.parse(time));
                //System.out.println("Time: " + formattedTime);


                CourseSection tempCourse = new CourseSection(dept, crn, hours, formattedTime);
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

    public ArrayList<CourseSection> storeDeptCourses(String dept)
    {
        ArrayList<CourseSection> deptCourses = new ArrayList<>();
        for (CourseSection course : courses)
        {
            if (course.getDepartment().equals(dept))
            {
                deptCourses.add(course);
            }
        }
        return deptCourses;
    }
}
