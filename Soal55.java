import java.util.Scanner;

public class Soal55 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan 3 Angka: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();
        displaySortedNumbers(number1, number2, number3);

        input.close();
    }
    public static void displaySortedNumbers(double num1, double num2, double num3){
        double temp;
        if (num1 > num2){
            temp = num1;
            num1 = num2;
            num2 = temp;
        } if (num2 > num3){
            temp = num2;
            num2 = num3;
            num3 = temp;
        } if (num1 > num2){
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.println("Tiga angka dalam urutan yang meningkat adalah: " + num1 + ", " + num2 + ", " + num3);
    }
}
    