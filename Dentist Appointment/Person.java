public class Person {
    String firstName, lastName, zipCode;

    public Person(String first, String last, String zip) {
        firstName = first;
        lastName = last;
        zipCode = zip;
    }

    public Person(String first, String las) {
        firstName = first;
        lastName = last;
        zipCode = "X";
    }

    public void display() {
        System.out.println(firstName + " " + lastName + " " + zipCode);
    }
}