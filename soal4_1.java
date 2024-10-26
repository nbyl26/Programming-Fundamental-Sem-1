import java.util.Scanner;
public class soal4_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int total = 0, number, positive = 0, negative = 0;
        double avarage;
        
        do {
            number = input.nextInt();
            if (number > 0){
            positive++;
            } else if (number < 0) {
            negative++;
            }
            total += number;
        }
        while (number != 0);
        avarage = (double) total / (positive + negative);

        System.out.println("Total nya adalah: " + total);
        System.out.println("number nya adalah: " + number);
        System.out.println("The avarage is: " + avarage);
        
        input.close();
    }
}
