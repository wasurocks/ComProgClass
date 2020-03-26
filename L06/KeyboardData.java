import java.util.Scanner;

public class KeyboardData {
	public static void main(String args[]){
		Scanner kb = new Scanner(System.in);
		int sum = 0, data = 0;
		while(data>=0) {
			sum += data;
			data = kb.nextInt();
		}
		System.out.println(sum);
	}
}
