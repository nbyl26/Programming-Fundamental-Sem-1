import java.util.Scanner;
public class switchC {
    public static void main(String[] args) {
        int memilih;
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih lah nomor 1 - 3 ");
        memilih = input.nextInt();

        switch((memilih > 0 && memilih <= 10) ? memilih : 4){
            case 1 : System.out.println("UTS mu hari ini akan gacor");
            break;
            
            case 2 : System.out.println("Kuis pemrog hari ini akan sangat lancar");
            break;

            case 3 : System.out.println("Semua yang kamu jalani hari ini akan sangat mudah");
            break;

            default : System.out.println("Semoga hari mu indah");
        }
        input.close();
    }
}
