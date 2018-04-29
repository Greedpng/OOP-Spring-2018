import java.util.*;

public class Sample {
    public static void main(String[] args) {  

        int w, n, d;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter whole number for X: ");
        w = sc.nextInt();
        System.out.print("Enter numerator for X: ");
        n = sc.nextInt();
        System.out.print("Enter denominator for X: ");
        d = sc.nextInt();
        Fraction X = new Fraction(w, n, d);

        System.out.print("Enter whole number for Y: ");
        w = sc.nextInt();
        System.out.print("Enter numerator for Y: ");
        n = sc.nextInt();
        System.out.print("Enter denominator for Y: ");
        d = sc.nextInt();
        Fraction Y = new Fraction(w, n, d);

        System.out.println();
        System.out.println("X: " + X.toString());
        System.out.println("Y: " +  Y.toString());

        Fraction A = X.add(Y);
        System.out.println("ADD: " +  A.toString());
        
        Fraction S = X.substract(Y);
        System.out.println("SUB: " +  S.toString());
       
        Fraction M = X.multiply(Y);
        System.out.println("MUL: " +  M.toString());

        Fraction D = X.divide(Y);
        System.out.println("DIV: " +  D.toString());

    }
}