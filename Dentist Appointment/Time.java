public class Time {
    //------------//
    // Attributes //
    //------------//
    int hours,minutes;

    //====================================================================

    //--------------//
    // Constructors //
    //--------------//
    Time(int hours) { // Without minutes
        if (hours > 23) {
            this.hours = 23;
        } else {
            this.hours = hours;
        }
        this.minutes = 0;
    }

    Time(int hours, int minutes) { // With minutes
        if (hours > 23) {
            this.hours = 23;
        } else {
            this.hours = hours;
        }

        if (minutes > 59) {
            this.minutes = 59;
        } else {
            this.minutes = minutes;
        }
    }

    //---------------------//
    // Add minutes to time //
    //---------------------//
    void addTime(int minutes) {
        int count = 0;
        this.minutes += minutes;
        if (this.minutes > 59) {
            while (this.minutes > 59) {
                this.minutes -= 60;
                count++;
            }
            this.hours += count;
            while (this.hours > 23) {
                this.hours -= 24;
            }
        }
    }

    //-------------------------------//
    // Displays time in hh:mm format //
    //-------------------------------//
    void display() {
        System.out.printf("%d:%02d\n",hours,minutes);
    }

    public static void main(String [] args) {
        Time [] test = new Time[4];

        test[0] = new Time(12,4);
        test[1] = new Time(7,30);
        test[2] = new Time(15,70);
        test[3] = new Time(26,20);
        for (int i = 0; i < 4; i++) {
            System.out.print("Time " + (i + 1) + ": ");
            test[i].display();
        }
        System.out.println();

        test[0].addTime(6);
        test[1].addTime(30);
        test[2].addTime(1);
        test[3].addTime(60);
        for (int i = 0; i < 4; i++) {
            System.out.println("Time " + (i + 1) + ": ");
            test[i].display();
        }
    }
}