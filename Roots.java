import java.util.Scanner;
public class Roots {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Type your number: ");
		double a = in.nextDouble();
		squareRoot(a);
}
	public static double squareRoot(double a) {
		if (a == 0) {
			return 0.0;
		}
		double x0 = a/2;
		double x1 = (x0 + a/x0) / 2.0;
		while (Math.abs(x1 - x0) >= 0.0001) {
		System.out.println(x0);
		x0 = x1;
		x1 = (x0 + a / x0) / 2.0;
}
			return x1;
}

}
