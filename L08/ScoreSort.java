import java.util.Scanner;
import java.io.*;

public class ScoreSort{
	// Do not change main().
	public static void main(String [] args) throws IOException {
		StudentScore [] scores = readScoreFile();	
	//Read score data from "score.csv" and store the data in an array of StudentScore
		sortByTotal(scores);
		listTop(scores, 20);
	}

	// List neccessary methods here.
	// Do not change method headers.
	public static StudentScore [] readScoreFile() throws FileNotFoundException {
		StudentScore [] scores = new StudentScore [1000];
		Scanner fs = new Scanner(new File("score.csv"));
		fs.useDelimiter(",");
		fs.nextLine();
		for(int i = 0; i < 1000; i++) scores[i] = new StudentScore(fs.nextLine()); 
		return scores;
	}

	public static void sortByTotal(StudentScore [] data){
		int n = data.length;
		for(int i = 0; i < n-1; i++) {
			for(int j = 0; j < n-i-1; j++) {
				if(data[j].getTotalScore() < data[j+1].getTotalScore()) {
					StudentScore temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
				}
			}
		}
	}

	public static void listTop(StudentScore[] sortedScores, int n){
		sortedScores[0].printScore(true);
		for(int i = 1; i < n; i++) sortedScores[i].printScore(false);
	}

}

