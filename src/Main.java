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

        //Calculate the total hours in the curriculum
        int totalHours = curr.countHours();
        System.out.println( "Total hours: " + totalHours );


        // Count the number of [DEPT] courses
        int numCourses = curr.countCourses("MATH");
        System.out.println("MATH courses: " + numCourses);


        // Determine if a course is in the curriculum.
        /*boolean courseInCurr = curr.courseExists("MATH 2550");
        System.out.println("MATH 2550 in curriculum?: " + courseInCurr);*/
    }
   }
