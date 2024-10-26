import java.util.Scanner;

public class soal4_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, d, gcd = 0;
        n1 = input.nextInt();
        n2 = input.nextInt();

        d = (n1 < n2) ? n1 : n2;

        for (int i = d; i >= 1; i--){
            if(n1 % i == 0 && n2 % i == 0) {
                gcd = d;
            }
        } System.out.print("FBP nya adalah: " + gcd);

        input.close();
    } 
}
