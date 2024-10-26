import java.util.Scanner;
public class binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan biner: ");
        String binaryString = scanner.nextLine();

        if (isValidBinary(binaryString)) {
            if (binaryString.contains(".")) {
                String[] parts = binaryString.split("\\.");
                String integerPart = parts[0];
                String fractionalPart = parts[1];

                int decimalInteger = binaryToDecimal(integerPart);
                double decimalFractional = binaryFractionToDecimal(fractionalPart);

                System.out.println("Hasil konversi: " + (decimalInteger + decimalFractional));
            } else {
                int decimal = binaryToDecimal(binaryString);
                System.out.println("Hasil konversi: " + decimal);
            }
        } else {
            System.out.println("Bukan bilangan biner valid.");
        }
        scanner.close();
    }

    public static boolean isValidBinary(String binaryString) {
        for (char binaryChar : binaryString.toCharArray()) {
            if (binaryChar != '0' && binaryChar != '1' && binaryChar != '.') {
                return false;
            }
        }
        return true;
    }

    public static int binaryToDecimal(String binaryString) {
        int decimal = 0;
        int binaryLength = binaryString.length();

        for (int i = 0; i < binaryLength; i++) {
            char binaryChar = binaryString.charAt(i);

            if (binaryChar != '0' && binaryChar != '1') {
                System.out.println("Bukan bilangan biner valid.");
                System.exit(1);
            }

            int power = binaryLength - 1 - i;
            int digit = Character.getNumericValue(binaryChar);
            decimal += digit * Math.pow(2, power);
        }

        return decimal;
    }

    public static double binaryFractionToDecimal(String fractionalPart) {
        double decimalFractional = 0;

        for (int i = 0; i < fractionalPart.length(); i++) {
            char binaryChar = fractionalPart.charAt(i);

            if (binaryChar != '0' && binaryChar != '1') {
                System.out.println("bukan bilangan biner valid.");
                System.exit(1);
            }

            int power = -(i + 1);
            int digit = Character.getNumericValue(binaryChar);
            decimalFractional += digit * Math.pow(2, power);
        }

        return decimalFractional;
    }
}
