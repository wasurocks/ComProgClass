import java.util.Scanner;

public class PointTest1 {
	public static void main(String args[]) {
		var sc = new Scanner(System.in);
		System.out.print("Insert x1: ");
		double x1 = sc.nextDouble();
		System.out.print("Insert y1: ");
		double y1 = sc.nextDouble();
		System.out.print("Insert x2: ");
		double x2 = sc.nextDouble();
		System.out.print("Insert y2: ");
		double y2 = sc.nextDouble();
		
		var p1 = new Point(x1, y1);
		var p2 = new Point(x2, y2);
		System.out.print("The distance between the two points is: ");
		System.out.println(p1.distance(p2));
	}
}