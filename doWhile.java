import java.util.Scanner;
public class doWhile {
    public static void main(String[] args) {
        int number, max;
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Angka: ");
        number = input.nextInt();
        max = number;

        do {
            number = input.nextInt();
            if (number > max){
            max = number;
            }
            
        }
        while (number != 0);

        
        System.out.println("Max nya adalah: " + max);
        System.out.println("number nya adalah: " + number);
        input.close();
    }
}