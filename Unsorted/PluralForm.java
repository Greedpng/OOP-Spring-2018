import java.util.Scanner;

public class PluralForm {
  static String PluralForm(String word) {
    char lastLetter = word.charAt(word.length() - 1);
    char secondLastLetter = word.charAt(word.length() - 2);
    char temp = '.';
    final String consonants = "bcdfghjklmnpqrstvwxz";
    final String punctuation = ",.!?;:\'\"";
    boolean flag = false;
    boolean punctuationCheck = false;
    int i;

    //Check for punctuation
    for (i = 0; i < punctuation.length(); i++) {
      if (lastLetter == punctuation.charAt(i)) {
        punctuationCheck = true;
      }
    }
    if (punctuationCheck == true) {
      temp = lastLetter;
      word = word.substring(0,(word.length() - 1));
      lastLetter = word.charAt(word.length() - 1);
    }

    //Check word ending to choose correct plural form
    if (lastLetter == 's' || lastLetter == 'x' || lastLetter == 'z' || (secondLastLetter == 'c' && lastLetter == 'h') || ((secondLastLetter - 2) == 's' && lastLetter == 'h')) {
      word += "es";
      System.out.println(secondLastLetter + " " + lastLetter)
    } else if (lastLetter == 'o') {
      for (i = 0; i < consonants.length(); i++) {
        if (secondLastLetter == consonants.charAt(i)) {
          flag = true;
        }
      }

      if (flag == true) {
        word += "es";
      } else {
        word += "s";
      }
    } else if (lastLetter == 'y') {
      for (i = 0; i < consonants.length(); i++) {
        if (secondLastLetter == consonants.charAt(i)) {
          flag = true;
        }
      }

      if (flag == true) {
        word = word.substring(0,(word.length() - 1));
        word += "ies";
      } else {
        word += "s";
      }
    } else {
      word += "s";
    }

    //Reapplies punctuation
    if (punctuationCheck == true) {
      word += temp;
    }

    return word;
  }
  public static void main (String [] args) {
    String word = "";

    System.out.println("This program converts an English word to its plural form.\n");

    Scanner sc = new Scanner(System.in);

    System.out.print("English word: ");
    word = sc.nextLine();

    String plural = PluralForm(word);
    System.out.println("Plural form: " + plural);
  }
}
