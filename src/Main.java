import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n\nHello, RegistrationApp!\n");

        System.out.println(readFromFile("curriculum.dat"));


        //Read and stMethod to ore the data from "curriculum.dat"
        // write the data to stdout
        // Calculate the total hours in the curriculum
        // Count the number of [DEPT] courses
        // Determine if a course is in the curriculum.
    }
}

// read and store data from file
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