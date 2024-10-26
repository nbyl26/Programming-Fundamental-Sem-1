import java.util.Scanner;

public class tugas3_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a, b, c, d, e, f, x, y;
        double atas, bawah, atasY, bawahY;

        System.out.print("Enter a, b, c, d, e, f: ");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        d = input.nextDouble();
        e = input.nextDouble();
        f = input.nextDouble();

        if (a * d - b * c == 0) {
            System.out.println("The equation has no solution");
        } else {
            atas = (e * d) - (b * f);
            bawah = (a * d) - (b * c);

            x = atas / bawah;

            atasY = (a * f) - (e * c);
            bawahY = (a * d) - (b * c);

            y = atasY / bawahY;

            System.out.println("x is: " + x);
            System.out.println("y is: " + y);
        }
        input.close();
    }
}