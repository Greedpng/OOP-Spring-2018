import java.util.Scanner;
import java.util.Arrays;

public class Anagrams {
    static boolean anagramCheck(String word1, String word2) {
		word1 = word1.replaceAll("[^A-Za-z]+", "").toUpperCase();
		word2 = word2.replaceAll("[^A-Za-z]+", "").toUpperCase();

		char [] array1 = word1.toLowerCase().toCharArray();
		char [] array2 = word2.toLowerCase().toCharArray();
		
        boolean flag = true;
        if(word1.length() != word2.length()) {
            flag = false;
        } else {
            Arrays.sort(array1);
            Arrays.sort(array2);

            flag = Arrays.equals(array1, array2);
		}
		
		return flag;
    }
 
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        System.out.println("This program determines if two input strings are anagrams.");
		
		System.out.print("#1: ");
		String word1 = sc.nextLine();

		System.out.print("#2: ");
		String word2 = sc.nextLine();
		
		if (anagramCheck(word1, word2) == true) {
			System.out.println("\"" + word1 + "\" is an anagram of " + "\"" + word2 + "\"");
		} else {
			System.out.println("\"" + word1 + "\" is not an anagram of " + "\"" + word2 + "\"");
		}
    }
}