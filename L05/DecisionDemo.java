import java.util.Scanner;

public class DecisionDemo {
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Score: ");
		int score = kb.nextInt();
		String grade = "";
		if(score >= 80) grade = "A";
		else {
			if(score >= 70) grade = "B";
			else {
				if(score >= 60) grade = "C";
				else {
					if(score>=50) grade = "D";
					else grade = "F";
				}
			}
		}
		System.out.println(grade);
	}
}