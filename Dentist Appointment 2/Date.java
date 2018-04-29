public class Date {
    private int day, month, year;

    public Date() {
        day = 1;
        month = 1;
        year = 2000;
    }

    public void display() {
        System.out.println(month + "/" + day + "/" + year);
    }
}