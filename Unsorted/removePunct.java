import java.util.Scanner;

public class removePunct {
	static String removePunct(String str) {
		String punctuation = ".,?!;:\'\"";
		str = str.replaceAll("\\s+","");;
		String newStr = str;
		int strLength = newStr.length();
		
		boolean punctFlag = false;
		for (int i = 0; i < strLength; i++) {
			for (int j = 0; j < punctuation.length(); j++) {
				if (str.charAt(i) == punctuation.charAt(j)) {
					newStr = newStr.substring(0, i) + newStr.substring(i + 1, strLength);
					strLength -= 1;
				}
			}
		}

		for (int i = 0; i < strLength; i++) {
			for (int j = 0; j < punctuation.length(); j++) {
				if (str.charAt(i) == punctuation.charAt(j)) {
					newStr = newStr.substring(0, i) + newStr.substring(i + 1, strLength);
					strLength -= 1;
				}
			}
		}
		return newStr;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Word: ");
		String str = sc.nextLine();

		System.out.println("Word: " + str);
		
		str = removePunct(str);
		
		System.out.println("Removed Punctuation: " + str);
	}
}