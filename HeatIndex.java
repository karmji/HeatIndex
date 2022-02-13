package Homework1;
import java.text.*;
public class HeatIndex {
	public static void main(String[] args) {
		final double c1 = -8.78469475556;
		final double c2 = 1.61139411;
		final double c3 = 2.33854883889;
		final double c4 = -0.14611605;
		final double c5 = -0.012308094;
		final double c6 = -0.0164248277778;
		final double c7 = 0.002211732;
		final double c8 = 0.00072546;
		final double c9 = -0.000003582;
		double T = Double.parseDouble(args[0]);
		double R = Double.parseDouble(args[1]);
		double HI = ((c1 + (c2 * T)) + (c3 * R) + (c4 * T * R) + (c5 * Math.pow(T, 2)) + (c6 * Math.pow(R, 2)) + (c7 * Math.pow(T, 2) * R) + (c8 * T * Math.pow(R, 2)) + (c9 * Math.pow(T, 2) * Math.pow(R, 2)));
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println("Heat Index:");
		System.out.println("Temperature: " + T);
		System.out.println("Relative Humidity: " + R);
		System.out.println("Heat Index: " + df.format(HI));
	}
}
