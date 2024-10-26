import java.util.Scanner;

public class tugasPertama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int angka = input.nextInt();

        if (angka < 0 || angka > 1000) {
            System.out.println("Invalid Number!");
        } else {
            int sumDigit = 0;
            while (angka > 0) {
                int digit = angka % 10;
                sumDigit += digit;
                angka /= 10;
            }
            System.out.println("The sum of the digits is " + sumDigit);
        }
        input.close();
    }
}
