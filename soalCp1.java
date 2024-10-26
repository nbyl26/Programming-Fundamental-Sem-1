import java.util.Random;
public class soalCp1 {
    public static void main(String[] args){
        Random random = new Random();
        int a = random.nextInt();
        int b = random.nextInt();

        int jumlah = a + b;
        if(jumlah > 0)
        System.out.println(jumlah + " adalah bilangan positif");
        else if(jumlah < 0)
        System.out.println(jumlah + " adalah bilangan negatif");
        else 
        System.out.println(jumlah + " adalah nol");
    }
}
