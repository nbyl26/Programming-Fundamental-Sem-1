import java.util.Scanner;
public class soal1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan titik: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double jarak = Math.pow(Math.pow(x - 0, 2), + Math.pow(y - 0, 2)) * 0.5;

        if (jarak <= 10) {
            System.out.print("Point (" + x + "," + y + ") di dalam lingkaran");
        } else {
            System.out.println("Point (" + x + ", " + y + ") tidak di dalam lingkaran");
        }
        input.close();
    }
}
