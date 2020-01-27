import java.lang.Math;

class Calculation {
	public static void main(String args[]) {
		int a, b, c;
		a = 1;
		b = -3;
		c = -10;
		int sol1 = ((-1 * b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c)))/(2 * a);
		int sol2 = ((-1 * b) - Math.sqrt(Math.pow(b, 2) - (4 * a * c)))/(2 * a);
		System.out.println(sol1);
		System.out.println(sol2);
	}
}