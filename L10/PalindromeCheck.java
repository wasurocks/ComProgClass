import java.util.Scanner;
public class PalindromeCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String word = sc.nextLine();
			if(word.equals("q")) System.exit(0);
			System.out.println(checkPalindrome(word));
		}
	}

	public static boolean checkPalindrome(String word) {
		if (word.length() < 2) return true;
		return (word.substring(0,1).equals(word.substring(word.length() - 1)))
				&& checkPalindrome(word.substring(1, word.length() - 1));
	}
}
