import java.util.Scanner;
import java.io.*;

public class CSVTest {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("score.csv"));
		// Enables values to be separated by commas
		in.useDelimiter("\\r\\n|,");
		double[][] q = new double[5][1001];
		String st;
		int count = 0;
		while (count < 1000) {
			st = in.next();
			if(st.substring(0,2).equals("56")) {
				for(int i=0; i<5; i++) q[i][count] = Double.parseDouble(in.next());
				count++;
			}
			
		}
		System.out.print(q[0][999] + "," + q[1][999]);
		in.close();
	}

	public static average(double[] values) return 
	}

}
