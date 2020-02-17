import java.lang.Math;

class Calculation {
	public static void main(String args[]) {
		double a, b, c;
		a = 1;
		b = -3;
		c = -10;
		double sol1 = ((-1 * b) + Math.sqrt(b*b - (4 * a * c)))/(2 * a);
		double sol2 = ((-1 * b) - Math.sqrt(b*b - (4 * a * c)))/(2 * a);
		System.out.println(sol1);
		System.out.println(sol2);
	}
}