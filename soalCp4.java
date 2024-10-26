import java.util.Scanner;
public class soalCp4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan bilangan pertama: ");
        int num1 = input.nextInt();

        System.out.println("Masukkan bilangan kedua: ");
        int num2 = input.nextInt();

        System.out.println("Masukkan bilangan ketiga: ");
        int num3 = input.nextInt();

        if(num1 > num2){
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if(num2 > num3){
            int temp = num2;
            num2 = num3;
            num3 = temp;
            if (num1 > num2){
                int temp2 = num1;
                num1 = num2;
                num2 = temp2;
            }
        }
        System.out.println("Bilangan dalam urutan ascending: " + num1 + num2 + num3);

        input.close();
    }
}
