import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double foot = 0.305;

        System.out.print("Enter value for feet:");
        double feet = input.nextDouble();
        double meter = feet * foot;

        System.out.println(feet + " feet is " + meter + " meters");
        input.close();
    }
}