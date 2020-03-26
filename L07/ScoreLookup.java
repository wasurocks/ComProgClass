import java.util.Scanner;
import java.io.*;

public class ScoreLookup {
	public static void main(String [] args) throws FileNotFoundException {
		String lookupString = constructLookUpStringFromFile("score.csv");
		boolean toQuit = false;
		do {
			char choice = showMainMenu();
			switch (choice) {
				case 'L':
					commenceLookUpProcedure(lookupString);
					break;
				case 'Q':
					toQuit = true;
					break;
				default:
					System.out.println("Invalid choice. Quitting.");
					toQuit = true;
			}
		} while(!toQuit);
	}

	// Add static methods here.
	// The methods include, but not limited to
	// - constructLookUpStringFromFile(String)
	public static String constructLookUpStringFromFile(String fileName) throws FileNotFoundException {
		Scanner fs = new Scanner(new File(fileName)).useDelimiter(",");
		String lookupString = "";
		while(fs.hasNext()) lookupString += fs.next();
		return lookupString;
	}
	// - showMainMenu()
	public static char showMainMenu() {
		System.out.println("-----------------------------");
		System.out.println("Main Menu");
		System.out.println("-----------------------------");
		System.out.println("L) Look Up Score");
		System.out.println("Q) Quit");
		System.out.println("-----------------------------");
		Scanner sc = new Scanner(System.in);
		return sc.next().charAt(0);
	}
	// - commenceLookUpProcedure(String)
	public static void commenceLookUpProcedure(String lookupString) {
		System.out.print("Enter student ID: ");
		Scanner sc = new Scanner(System.in);
		String studentID = sc.next();
		System.out.println("\t\tQ1\tQ2\tQ3\tQ4\tQ5\tTotal");
		System.out.print(studentID);
		int total = 0, startIndex = lookupString.indexOf(studentID) + 10;
		for(int i = startIndex ; i < startIndex + 5 && i > 9; i++) {
			System.out.print("\t" + lookupString.substring(i, i+1));
			total += Integer.parseInt(lookupString.substring(i, i+1));
		}
		System.out.println("\t" + ((startIndex>9)?total:"Score does not exist"));
	}
}
