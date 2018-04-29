import java.util.Scanner;

public class Collatz {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("First number: ");
    int i = sc.nextInt();
	int iPrint = i;

    System.out.print("Second number: ");
    int j = sc.nextInt();
	int jPrint = j;
	
	if (j<i) {
		int tmp = i;
		i = j;
		j = tmp;
	}

	int max = 0;
	for (int n = i; n <= j; n++) {
		int count = 1;
		i = n;
		while (i != 1) {
			if (i % 2 == 0) {
			  i = i / 2;
			} else {
			  i = 3*i + 1;
			}
			count++;
			if (count > max) {
				max = count;
			}
		}
		
	}

    System.out.println("Maximum cycle between " + iPrint + " and " + jPrint + " is " + max);
  }
}