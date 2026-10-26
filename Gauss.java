public class Gauss {
    public static void main(String[] args) {
        double number = 2.0;

        System.out.println("Actual Value: " + Math.exp(-number * number));
        System.out.println("Estimated Value: " + computeGauss(number, 1000));
    }

    public static double computeGauss(double x, int steps) {
        double total = 1.0;
        double term = 1.0;

        for (int i = 1; i < steps; i++) {
            term = term * (-x * x) / i; 
            total += term;              
        }

        return total;
    }
}
