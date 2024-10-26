import java.util.Scanner;

public class tugasKedua {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double pounds = input.nextDouble();

        System.out.print("Enter height in inches: ");
        double inches = input.nextDouble();

        double kilograms = pounds * 0.45359237;
        double meters = inches * 0.0254;
        double bmi = kilograms / (meters * meters);

        String formattedBmi = String.format("%.4f", bmi);
        System.out.println("BMI is " + formattedBmi);

        input.close();
    }
}
