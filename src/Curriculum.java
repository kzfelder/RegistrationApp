import java.util.ArrayList;

public class Curriculum
{
    ArrayList<String> curriculum;

    public Curriculum(ArrayList<String> curriculum)
    {
        this.curriculum = curriculum;
    }

    @Override
    public String toString()
    {
        return "Curriculum: " + curriculum;
    }

    public static ArrayList<String> listHours(ArrayList<String> curriculum)
    {
        ArrayList<String> hours = new ArrayList<>();
        for(String course : curriculum)
        {
            String hour = String.valueOf(course.charAt(course.length() - 1));
            hours.add(hour);
        }
        return hours;
    }

    public static int countHours(ArrayList<String> courseHours)
    {
        //ArrayList<Integer> hours = new ArrayList<>();
        int total = 0;
        for (int i = 0; i < courseHours.size(); i ++)
        {
            int numHour = Integer.parseInt(courseHours.get(i));
            total = total + numHour;
        }
        return total;
    }
}
