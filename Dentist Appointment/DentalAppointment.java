public class DentalAppointment {
    int duration;
    Time startTime, endTime;
    Person patient;
    Date aptDate;

    DentalAppointment(String firstName, String lastName, int month, int day, int year, int hours, int minutes, int duration) {
        this.patient = new Person(firstName, lastName, "X");
        this.aptDate = new Date(day, month, year);
        this.startTime = new Time(hours,minutes);
        this.endTime = new Time(hours,minutes);
        if (duration < 240) {
            this.endTime.addTime(duration);
        } else {
            this.startTime.addTime(30);
        }
    }
    
    DentalAppointment(String firstName, String lastName, int month, int day, int year, int hours, int minutes) {
        this.patient = new Person(firstName, lastName, "X");
        this.aptDate = new Date(month, day, year);
        this.startTime = new Time(hours,minutes);
        this.endTime = new Time(hours,minutes);
        this.endTime.addTime(30);
    }

    void display() {
        System.out.print("Name & Zipcode: ");
        patient.display();

        System.out.print("Date: ");
        aptDate.display();

        System.out.print("Start Time: ");
        startTime.display();

        System.out.print("End Time: ");
        endTime.display();
    }

    public static void main(String [] args) {
        DentalAppointment [] test = new DentalAppointment[3];

        test[0] = new DentalAppointment("Paige", "Weber", 1, 1, 2000, 12, 30, 45);
        test[1] = new DentalAppointment("Victoria", "Ludwig", 12, 15, 2006, 6, 0);
        test[2] = new DentalAppointment("Conner", "Guidry", 10, 23, 2010, 16, 45, 15);

        for (int i = 0; i < 3; i++) {
            test[i].display();
            System.out.println();
        }
    }
}