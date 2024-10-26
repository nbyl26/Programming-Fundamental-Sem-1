import java.util.Scanner;
public class hargaPC{
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Masukkan Harga Pc ");
       System.out.print("Masukkan harga Processor: ");
       int processor = input.nextInt();
       System.out.print("Masukkan harga Mother Board: ");
       int motherBoard = input.nextInt();
       System.out.print("Masukkan harga Memory(RAM): ");
       int memory = input.nextInt();
       System.out.print("Masukkan harga SSD: ");
       int ssd = input.nextInt();
       System.out.print("Masukkan harga GPU: ");
       int gpu = input.nextInt();
       System.out.print("Masukkan harga PSU: ");
       int psu = input.nextInt();
       System.out.print("Masukkan harga Casing: ");
       int casing = input.nextInt();
       System.out.print("Masukkan harga Monitor: ");
       int monitor = input.nextInt();
       System.out.print("Masukkan harga Keyboard: ");
       int keyboard = input.nextInt();
       System.out.print("Masukkan harga Mouse: ");
       int mouse = input.nextInt();
       System.out.print("Masukkan harga Speaker: ");
       int speaker = input.nextInt();
       System.out.print("Masukkan harga Headset: ");
       int headset = input.nextInt();
       System.out.print("Masukkan harga Webcam: ");
       int webcam = input.nextInt();
       System.out.print("Masukkan harga Wireless Adapter: ");
       int wireless = input.nextInt();

    int total = processor + motherBoard + memory + ssd + gpu + psu + casing + monitor + keyboard + mouse + speaker + headset + webcam + wireless;

    System.out.println("Total nya adalah: Rp. " + total + ",00");

    input.close();
    }
}