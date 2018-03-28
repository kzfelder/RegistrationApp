import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Curriculum
{
    ArrayList<String> curriculum;

    public Curriculum(String curr)
    {
        this.curriculum = readFromFile(curr);
    }

    @Override
    public String toString()
    {
        String curriculumLs = "";
        for (int i = 0; i < curriculum.size(); i++)
        {
            curriculumLs += (curriculum.get(i) + "\n");
        }
        return curriculumLs;
    }

    private static ArrayList<String> readFromFile(String fileName)
    {
        ArrayList<String> data = new ArrayList<>();

        File file = new File(fileName);
        try (Scanner sc = new Scanner(file))
        {
            while (sc.hasNext())
            {
                data.add(sc.nextLine());
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        return data;
    }

    public int countHours()
    {
        ArrayList<String> hours = listHours();
        int total = 0;
        for (int i = 0; i < hours.size(); i ++)
        {
            int numHour = Integer.parseInt(hours.get(i));
            total = total + numHour;
        }
        return total;
    }

    private ArrayList<String> listHours()
    {
        ArrayList<String> hours = new ArrayList<>();
        for(String course : curriculum)
        {
            String hour = String.valueOf(course.charAt(course.length() - 1));
            hours.add(hour);
        }
        return hours;
    }

    public int countCourses(String courseName)
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
                            if (temp.equals(courseName))
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
    }


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
