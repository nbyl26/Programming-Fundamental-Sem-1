public class Soal58 {
    public static void main(String[] args) {
        System.out.println("Celsius     Fahrenheit   |  Fahrenheit   Celsius");
        System.out.println("------------------------------------------------");
        for (int c = 40, f = 120; c >= 31; c--, f -= 10) {
            System.out.printf("%.1f     %8.1f        |  %5.1f   %9.2f\n", (double) c, celciusToFahrenheit(c), (double) f, fahrenheitToCelcius(f));
        }
    }
    public static double celciusToFahrenheit(double celcius) {
        return (9.0 / 5) * celcius + 32;
    }

    public static double fahrenheitToCelcius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }
}

