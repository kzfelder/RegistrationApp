import java.util.ArrayList;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n\nHello, RegistrationApp!\n");

        // Curriculum Milestone
        // read and store data from file
        Curriculum curr = new Curriculum("curriculum.dat");  // Kyrah's ArrayList is hidden in the Curriculum class
        System.out.println("Curriculum:\n\n" + curr);

        // Calculate the total hours in the curriculum
        int totalHours = curr.countHours();
        System.out.println( "Total hours [Curriculum]: " + totalHours );


        // Count the number of [DEPT] courses
        int numCourses = curr.countCourses("MATH");
        System.out.println("MATH courses: " + numCourses);


        // Determine if a course is in the curriculum.
        Course userCourse = new Course("*", "CPSC Elective", 3);
        boolean courseInCurr = curr.courseExists(userCourse);
        System.out.println("(" + String.valueOf(userCourse) + ")" + " in curriculum? " + courseInCurr);


        // Transcript milestone
        // Read, store and write transcript
        Transcript transcript = new Transcript("transcript.txt");  // Kyrah's ArrayList is hidden in the Curriculum class
        System.out.println("\n\nTranscript:\n\n" + transcript);

        // Calculate total hours in transcript
        int totalTranscriptHrs = transcript.countHours();
        System.out.println("Total hours [Transcript]: " + totalTranscriptHrs);

        // Determine if a transcript course is also in the curriculum
        Random rand = new Random();
        Course transcriptCourse = transcript.get(rand.nextInt(transcript.size()));
        boolean transcriptCrsInCurr = curr.courseExists(transcriptCourse);
        System.out.println("(" + String.valueOf(transcriptCourse) + ")" + " in curriculum? " + transcriptCrsInCurr);

        // Determine if a course is also in the transcript courses
        Course randCurrCourse = curr.get(rand.nextInt(curr.size()));
        boolean randCurrCrsInCurr = transcript.courseExists(randCurrCourse);
        System.out.println("(" + String.valueOf(randCurrCourse) + ")" + " in transcript? " + randCurrCrsInCurr);

        // Determine if the student has completed all courses needed to graduate
        boolean studentCanGraduate = curr.completedAllCourses(transcript);
        System.out.println("Completed All Courses: " + studentCanGraduate);


        // Registrar Milestone
        // Read and store data from file
        Registrar registrar = new Registrar("registrar.txt");
        System.out.println("Registrar:\n\n" + registrar);

        // Separately store all [DEPT] courses
        String dept = "MATH";
        ArrayList<CourseSection> deptCourses = registrar.storeDeptCourses(dept);
        System.out.println(dept + " courses: " + deptCourses);
    }
   }
