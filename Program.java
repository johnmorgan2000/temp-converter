import java.util.Scanner;

public class Program {
    static Scanner stdin;
    static Converter converter;

    public static void main(String[] args) {
        stdin = new Scanner(System.in);
        converter = new Converter(getMagnitude(), getUnit());
        showResult();
    }

    private static Double getMagnitude() {
        System.out.print("Temperature Magnitude: ");
        return stdin.nextDouble();
    }

    private static String getUnit() {
        System.out.print("Temperature Unit: ");
        return stdin.next();
    }

    private static void showResult() {
        String formatString = "%-4s | %s\n";
        System.out.println();
        System.out.printf(formatString, "Unit", "Magnitude");
        System.out.printf(formatString, "F", converter.toFahrenheit());
        System.out.printf(formatString, "C", converter.toCelsius());
        System.out.printf(formatString, "K", converter.toKelvin());
        System.out.printf(formatString, "R", converter.toRankine());
    }
}
