import java.util.Scanner;
public class RecursiveFunction {
    static double[] storedF;
    static int callTimes = 0;    

    public static void main(String[] args) {
        storedF = new double[501];
	Scanner sc = new Scanner(System.in);
	while (true) {
	    int n = sc.nextInt();
	    if (n == -1) break;
	    System.out.println("The value of f(" + n + ") is " + computeF(n));
    	    System.out.println("Function called: " + callTimes + " times");
	}
    }

    public static double computeF(int n) {
	callTimes++;
	if(n < 3) return 1;
    	if(storedF[n] != 0) return storedF[n];
	storedF[n] = computeF(n-1) + computeF(n-2) + computeF(n-3);
	return storedF[n];   
    }
}

