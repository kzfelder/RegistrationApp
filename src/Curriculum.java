import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Curriculum
{

    private ArrayList<Course> courses;  // CPSC 1710 3
    //private ArrayList<Category> categories;  // [*, African American Heritage, 3]


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

    public Curriculum(String fileName)
    {
        this.courses = readFromFile(fileName);
        //this.categories = categories;
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

    public boolean completedAllCourses(Transcript transcript)
    {
        for(Course course : courses)
        {
            if (!transcript.courseExists(course))
            {
                return false;
            }
        }
        return true;
    }

    /*public int countHours()
    {
        ArrayList<String> hours = listHours();
        int total = 0;
        for (int i = 0; i < hours.size(); i ++)
        {
            int numHour = Integer.parseInt(hours.get(i));
            total = total + numHour;
        }
        return total;
    }*/

    /*private ArrayList<String> listHours()
    {
        ArrayList<String> hours = new ArrayList<>();
        for(String course : curriculum)
        {
            String hour = String.valueOf(course.charAt(course.length() - 1));
            hours.add(hour);
        }
        return hours;
    }*/

    /*public int countCourses(String courseDept)
    {
        int count = 0;
        for (String course : curriculum)
        {
            String array1[] = course.split(" ");
            int numCase = 0;
            for (String temp : array1)
            {
                if (temp.trim().length() > 0 && !temp.equals("*"))
                {
                    numCase++;
                    //System.out.println(temp);
                    //System.out.println(counter);
                    switch (numCase)
                    {
                        case 1:
                            if (temp.equals(courseDept))
                            {
                                count++;
                            }
                            break;
                        default:
                            break;
                    }

                } else if (temp.equals("*"))
                {
                    break;
                }
                else {
                }
            }
        }
        return count;
    }*/

    /*public boolean courseExists(String courseName)
    {
        List<String> splitCourseName = Arrays.asList(courseName.split(" "));
        for (String course : curriculum)
        {
            List<String> splitCourse = Arrays.asList(course.split(" "));
            //System.out.println(splitCourse);
            if (splitCourse.get(0).equals(splitCourseName.get(0)))
            {
                if (splitCourse.get(1).equals(splitCourseName.get(1)))
                {
                    return true;
                }
            }
        }
        return false;
    }*/


    // read and store data from file
    /*private static ArrayList<Object> readFromFile(String fileName)
    {
        ArrayList<Object> data = new ArrayList<>();

        File file = new File(fileName);
        try (Scanner sc = new Scanner(file))
        {
            while (sc.hasNext())
            {
                String course = sc.nextLine();
                String array1[]= course.split(" ");
                int counter = 0;
                Course aCourse = new Course();
                Category aCategory = new Category();
                for (String temp: array1)
                {
                    if (temp.trim().length() > 0 && !temp.equals("*"))
                    {
                        counter++;
                        //System.out.println(temp);
                        //System.out.println(counter);
                        switch(counter)
                        {
                            case 1: aCourse.setDepartment(temp.trim()); break;
                            case 2: aCourse.setNumber(Integer.parseInt(temp.trim())); break;
                            case 3: aCourse.setHours(Integer.parseInt(temp.trim())); break;
                            default: break;
                        }

                    }
                    else if (temp.equals("*"))
                    {
                        counter++;
                        //System.out.println(temp);
                        //System.out.println(counter);
                        switch(counter)
                        {
                            case 2: aCategory.setCategoryName(temp.trim()); break;
                            case 3: aCategory.setHours(Integer.parseInt(temp.trim())); break;
                            default: break;
                        }
                    }
                    else {

                    }
                }
                data.add(aCourse);
                data.add(aCategory);
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        return data;
    }*/
}
