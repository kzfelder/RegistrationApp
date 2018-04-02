public class Category
{
    private String asterisk;
    private String catName;
    private int hours;

    @Override
    public String toString()
    {
        return asterisk + " " + catName + " " + String.valueOf(hours);
    }

    public String getAsterisk()
    {
        return asterisk;
    }

    public void setAsterisk(String asterisk)
    {
        this.asterisk = asterisk;
    }

    public String getCatName()
    {
        return catName;
    }

    public void setCatName(String catName)
    {
        this.catName = catName;
    }

    public int getHours()
    {
        return hours;
    }

    public void setHours(int hours)
    {
        this.hours = hours;
    }
}
