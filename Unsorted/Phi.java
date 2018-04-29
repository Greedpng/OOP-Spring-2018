import java.util.Scanner;

public class Phi {
	static int phi(int n) {
		int phi_out = n;
		
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				while (n % i == 0) {
					n /= i;
				}
				phi_out -= phi_out / i;
			}
		}

		if (n > 1) {
			phi_out -= phi_out / n;
		}
		
		return phi_out;
	}
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = 250001;
		
		while (i > 250000) {
			System.out.print("Enter positive integer n: ");
			i = sc.nextInt();
			
			if (i > 250000) {
				System.out.println("Number too large.\n");
			}
		}
		
		int phi_n = phi(i);
		System.out.println("Phi(n): " + phi_n);
	}
}