import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What size is the grid? ");
        int size = sc.nextInt();

        String[] grid = new String[size];
        System.out.println("Enter the initial grid layout:");
        for (int g = 0; g < size; g++) {
            grid[g] = sc.nextLine();
            System.out.println("Ping");
        }
    }
}