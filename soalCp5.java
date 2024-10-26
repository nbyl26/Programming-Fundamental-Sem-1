import java.util.Scanner;
public class soalCp5 {
    private static boolean isPalindrome(String str){
        int kiri = 0;
        int kanan = str.length() - 1;
        while(kiri < kanan){
        if (str.charAt(kiri) != str.charAt(kanan)){
            return false;
        }
        kiri++;
        kanan--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan sebuah kata: ");
        String kata = input.nextLine();
        String kata2 = kata.replaceAll("[\\s+]", "").toLowerCase();

        if (isPalindrome(kata2)){
            System.out.println(kata2 + " adalah Palindrom");
        }
        else{
            System.out.println(kata2 + " Bukan Palindrom");
        }
        input.close();
    }
}
