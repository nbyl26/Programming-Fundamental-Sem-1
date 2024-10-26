import java.util.Scanner;

public class decimal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan desimal: ");
        String decimalString = scanner.nextLine();

        try {
            double decimalNumber = Double.parseDouble(decimalString);

            String binaryResult = decimalToBinary(decimalNumber);
            System.out.println("Hasil konversi: " + binaryResult);
        } catch (NumberFormatException e) {
            System.out.println("Masukkan bukan bilangan desimal yang valid.");
        }
        scanner.close();
    }

    public static String decimalToBinary(double decimalNumber) {
        boolean isNegative = decimalNumber < 0;
        decimalNumber = Math.abs(decimalNumber);

        int integerPart = (int) decimalNumber;
        double fractionalPart = decimalNumber - integerPart;

        StringBuilder binaryInteger = new StringBuilder(Integer.toBinaryString(integerPart));

        StringBuilder binaryFractional = new StringBuilder(".");
        while (fractionalPart > 0) {
            fractionalPart *= 2;
            int bit = (int) fractionalPart;
            binaryFractional.append(bit);
            fractionalPart -= bit;
        }

        String result = binaryFractional.length() > 1 ? binaryInteger.append(binaryFractional).toString() : binaryInteger.toString();
        return isNegative ? "-" + result : result;
    }
}
