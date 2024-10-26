import java.util.Scanner;
public class sentinelValue {
    public static void main(String[] args) {
        int number, sum = 0;
        Scanner input = new Scanner(System.in);

        number = input.nextInt();
        sum += number;

        // ketika user menginputkan selain nol, program akan berjalan terus
        while (number != 0) {
            number = input.nextInt();
            sum += number;
        }
            System.out.println("The sum is = " + sum);
        
            input.close();
    }
}