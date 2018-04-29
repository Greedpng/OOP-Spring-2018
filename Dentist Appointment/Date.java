public class Date
{
    private int month;
    private int day;
    private int year;

    // default constructor
    public Date()
    {
        month = 1;
        day = 1;
        year = 2000;
    }

    public Date(int m, int d, int y)
    {
        this.month = m;
        this.day = d;
        this.year = y;
    }
    
    public void setMonth(int m)
    {
        this.month = m;
    }

    public void setDay(int d)
    {
        this.day = d;
    }

    public void setYear(int y)
    {
        this.year = y;
    }

    public void display()
    {
        System.out.println(month + "/" + day + "/" + year);
    }

    public static void main(String [] args)
    {
        Date date1 = new Date();
        date1.display();

        Date date2 = new Date();
        date2.setDay(Integer.parseInt(args[1]));
        date2.setMonth(Integer.parseInt(args[0]));
        date2.setYear(Integer.parseInt(args[2]));
        date2.display();
    }
}