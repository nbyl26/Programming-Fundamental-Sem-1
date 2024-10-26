import java.util.Scanner;
public class soal4_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Kilograms\t\t\tPounds");
        for ( int i=1; i < 200; i++) {
            if (i % 2 != 0){
                double j = i * 2.2;
                System.out.println(i + "\t\t\t" + j);
            }
        }
        input.close();
    }
}
