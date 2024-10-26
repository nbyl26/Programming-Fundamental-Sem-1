import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pound = 0.454;

        System.out.print("Enter a number in pounds: ");

        double pounds = input.nextDouble();
        double kilogram = pound * pounds;

        System.out.println(pounds + " pounds " + " is " + kilogram + " kilograms");
        input.close();
    }

}
