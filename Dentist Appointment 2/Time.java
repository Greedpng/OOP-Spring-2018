public class Time {
    int hours, minutes;

    Time(int hours) {

    }

    Time(int hours, int minutes) {
        
    }

    void addTime(int minutes) {
        
    }

    String display() {
        return String.format("%d:%02d",hours,minutes);
    }

    public static void main(String [] args) {
        Time [] test = new Time[4];

        test[0] = new Time(12,4);
        test[1] = new Time(7,30);
        test[2] = new Time(15,70);
        test[3] = new Time(26,20);
        for (int i = 0; i < 4; i++) {
            System.out.println("Time " + (i + 1) + ": " + test[i].display());
        }
        System.out.println();

        test[0].addTime(6);
        test[1].addTime(30);
        test[2].addTime(1);
        test[0].addTime(60);
        for (int i = 0; i < 4; i++) {
            System.out.println("Time " + (i + 1) + ": " + test[i].display());
        }
    }
}