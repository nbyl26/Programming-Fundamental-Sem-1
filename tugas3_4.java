import java.util.Scanner;

public class tugas3_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1 = (int) (System.currentTimeMillis() % 100);
        int number2 = (int) (System.currentTimeMillis() / 70 % 100);

        System.out.print("What is " + number1 + " + " + number2 + " ? ");
        int answer = input.nextInt();

        if ( answer == (number1 + number2)){
        System.out.println(number1 + " + " + number2 + " adalah " + answer + " is " + (number1 + number2 == answer));
        } else {
        System.out.println("jawaban salah " + number1 + " + " + number2 + " bukan " + answer + " tetapi " + (number1 + number2));
        }
        input.close();
    }
}
