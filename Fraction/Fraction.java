import java.lang.Math;
public class Fraction {
    private int whole;
    private int numerator;
    private int denominator;


    // Create a paramaterless constructor, which sets
    // the whole number and numerator to 0 and the denominator to 1.
    public Fraction() {
       
    }


    // Create a constructor that accepts two parameters
    // for the numerator and denominator. When the constructor
    // is used, the whole number value is 0.
    public Fraction(int numerator, int denominator) {
        this.numerator = Math.abs(numerator);
        this.denominator = Math.abs(denominator);
    }


    // Create a constructor that accepts three parameters
    // for the whole number, numerator, and denominator.
    public Fraction(int whole, int numerator, int denominator) {
        int temp = whole * denominator;
        numerator += temp;
        if (denominator < 0) {
            denominator = Math.abs(denominator);
            numerator *= -1;
        }
        this.whole = 0;
        this.numerator = numerator;
        this.denominator = denominator;
    }

    // This calculates greatest common divisor (GCD)
    // I expect that you will find it useful
    int gcd(int a, int b) {
        if( b == 0 )
            return a;
        return gcd(b,a%b);
    }

    // Reduces the Fraction value to the lowest possible denominator
    // example 72/20 should be reduced to 18/5, which is also 3 3/5.
    public void reduce() {
        int common = 0;

        int n = Math.abs(this.numerator);
        int d = this.denominator;

        if (n > d) {
            common = gcd(n, d);
        } else if (n < d) {
            common = gcd(d, n);
        } else {
            common = n;
        }

        this.numerator = numerator / common;
        this.denominator = denominator / common;
    }

    // Add the current Fraction to Fraction A, return the result as a new Fraction (reduced, of course)
    public Fraction add(Fraction A) {
        Fraction result;

        int n = this.numerator * A.denominator + A.numerator * this.denominator;
        int d = this.denominator * A.denominator;

        result = new Fraction(n, d);
        result.reduce();
        return result;
    }

    // Fraction C = this - A;
    // Subtract the current Fraction Fraction A, return the result as a new Fraction (reduced, of course)
    public Fraction substract(Fraction A) {
        Fraction result;

        int n = this.numerator * A.denominator - A.numerator *this.denominator;
        int d = this.denominator * A.denominator;
        
        result = new Fraction(n,d);
        return result;
    }

    // Multiply the current Fraction to Fraction A, return the result as a new Fraction (reduced, of course)
    public Fraction multiply(Fraction A) {
        Fraction result;
        
        int n = A.numerator * this.numerator;
        int d = A.denominator * this.denominator;

        result = new Fraction(n, d);
        result.reduce();
        return result;
    }

    // Divide Fractions (this/A), return the result as a new Fraction (reduced, of course)
    // You may assume that A will be a non-zero value
    public Fraction divide(Fraction A) {
        Fraction result;

        int n = this.numerator * A.denominator;
        int d = this.denominator * A.numerator;

        result = new Fraction(n, d);
        result.reduce();
        return result;
    }

    // returns a string that contains a fraction in the format:
    // whole number, a space, the numerator, a slash (/), and a denominator (e.g: 2 3/4).
    // When the whole number is 0, just display the fraction part (e.g: 1/2 instead of 0 1/2.
    // When the numerator is 0, just display the whole number (e.g: 2 instead of 2 0/3).
    // Also, just display 3 instead of 3/1.
    public String toString() {
        String output = new String();
        int n = this.numerator;
        int d = this.denominator;
        int w = this.whole;

        while (n > d) {
            w++;
            n -= d;
        }

        if (d == 1) {
            w += n;
            output = String.format("%d",w);
        } else if (n == d) {
            w++;
            output = String.format("%d",w);
        } else if (w == 0) {
            output = String.format("%d/%d",n, d);
        } else {
            output = String.format("%d %d/%d",w, n, d);
        }

        return output;
    }
}