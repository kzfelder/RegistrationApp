import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n\nHello, RegistrationApp!\n");


        // read and store data from file
        Curriculum curr = new Curriculum("curriculum.dat");  // Kyrah's ArrayList is hidden in the Curriculum class
        System.out.println("Curriculum:\n\n" + curr);

        //ArrayList<Course> course = new ArrayList<>();
        //ArrayList<Category> category = new ArrayList<>();

        /*File file = new File("curriculum.dat");
        try(Scanner sc = new Scanner(file))
        {
            while (sc.hasNext())
            {
                //Course tempCourse = new Course();
                //Category tempCategory = new Category();
                String temp = sc.next();
                if (!temp.equals("*"))
                {
                    System.out.println(temp);
                    System.out.println(sc.nextInt());
                    System.out.println(sc.nextInt());
                }
                else
                {
                    System.out.println(temp);
                    String cat = "";
                    while (!sc.hasNextInt())
                    {
                        cat += sc.next() + " ";
                    }
                    System.out.println(cat);
                    System.out.println(sc.nextInt());
                }

                if (!sc.next().equals("*"))
                {
                    for (int i = 0; i < 1; i++)
                    {
                        switch (i)
                        {
                            case 1: tempCourse.setDepartment(sc.next());
                            //case 2: tempCourse.setNumber(sc.nextInt());
                            //case 3: tempCourse.setHours(sc.nextInt());
                            default: break;
                        }
                    }
                }
                course.add(tempCourse);
            }
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }*/


        /* Calculate the total hours in the curriculum
        int totalHours = curr.countHours();
        System.out.println( "Total hours: " + totalHours );


        // Count the number of [DEPT] courses
        int numCourses = curr.countCourses("MATH");
        System.out.println("MATH courses: " + numCourses);


        // Determine if a course is in the curriculum.
        boolean courseInCurr = curr.courseExists("MATH 2550");
        System.out.println("MATH 2550 in curriculum?: " + courseInCurr);*/
    }
   }
