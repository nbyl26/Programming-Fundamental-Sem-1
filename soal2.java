import java.util.Scanner;
public class soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai tukar dollar ke rupiah: ");
        Double nilai = input.nextDouble();

        System.out.print("Masukkan 0 untuk menukarkan mata uang dollar ke rupiah da 1 untuk sebaliknya: ");
        int pilihan = input.nextInt();
        if (pilihan == 1) {
            System.out.println("Masukkan jumlah rupiah yang ingin di tukarkan: ");
            Double rupiah = input.nextDouble();
            Double dolar = rupiah / nilai;

            System.out.println("Rp." + rupiah + "senilai $" + dolar);
        }
        input.close();
    }
}
