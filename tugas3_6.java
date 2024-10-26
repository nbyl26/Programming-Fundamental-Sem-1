import java.util.Scanner;

public class tugas3_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pounds, feet, inches;
        double BMI;

        // Meminta user memasukkan berat badan dalam pounds
        System.out.print("Enter weight in pounds: ");
        pounds = input.nextInt();

        // Meminta user memasukkan tinggi badan dalam kaki dan inci
        System.out.print("Enter feet: ");
        feet = input.nextInt();

        System.out.print("Enter inches: ");
        inches = input.nextInt();

        // Menghitung BMI dengan rumus 
        double kiloGram = pounds * 0.45359237;
        double inches2 = feet * 12 + inches;
        double heightMeter = inches2 * 0.0254;

        BMI = kiloGram / (heightMeter * heightMeter);

        System.out.println("BMI is " + BMI);

        if (BMI < 18.5)
            System.out.println("Underweight");
        else if (BMI < 25)
            System.out.println("Normal");
        else if (BMI < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");

        input.close();
    }
}