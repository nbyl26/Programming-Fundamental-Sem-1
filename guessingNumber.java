import java.util.Scanner;
public class guessingNumber {
    public static void main(String[] args) {
        int userGuess, guessNumber;

        guessNumber = (int) (Math.random() * 1001);

        System.out.print("Masukkan angka tebakan dari 0 - 1000: ");
        Scanner input = new Scanner(System.in);
        userGuess = input.nextInt();
        while (userGuess != guessNumber) {
            if (userGuess < guessNumber) {
                System.out.println("Tebakan kamu terlalu rendah, silahkan masukan angka tebakan ");
                userGuess = input.nextInt(); 
            } else if (userGuess > guessNumber) {
                System.out.println("Tebakan kamu terlalu tinggi, silahkan masukan angka tebakan ");
                userGuess = input.nextInt();
            }    
        }
         System.out.println("Tebakan Kamu Benar, gacor sekali anda ");
         input.close();
    }
}