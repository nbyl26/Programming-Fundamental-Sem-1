import java.util.Scanner;
public class soalCp3 {
    private static double celciusToFahrenheit(double celsius){
        return (celsius * 9 / 5) + 32;
    }

    private static double fahrenheitToCelcius(double fahrenheit){
        return (fahrenheit - 32) * 5 / 9;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka suhu: ");
        double suhu = input.nextDouble();

        System.out.print("Pilih jenis konversi: \n1 untuk Celcius ke Fahrenheit \n2 untuk Fahrenheit ke Celcius \n= ");
        int pilih = input.nextInt();
        double hasil;

        if(pilih == 1){
            hasil = celciusToFahrenheit(suhu);
            System.out.println(suhu + " Celcius sama dengan " + hasil + " Fahrenheit");
        }
        else if(pilih == 2){
            hasil = fahrenheitToCelcius(suhu);
            System.out.println(suhu + " Fahrenheit sama dengan " + hasil + " Celcius");
        }
        else{
            System.out.println("Pilihan anda tidak valid");
        }
        input.close();
    }
}
