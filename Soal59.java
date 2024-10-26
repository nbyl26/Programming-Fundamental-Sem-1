public class Soal59 {
    public static void main(String[] args) {
        System.out.println("Feet  Meters     |   Meters  Feet");
        System.out.println("_________________|___________________");
        for (double foot = 1.0, meter = 20.0; foot <= 10.0; foot++, meter += 5.0){
            double nilaiMeters = footToMeter(foot);
            double nilaiFoot = meterToFoot(meter);
            System.out.printf("%4.1f %6.3f      |   %.1f %10.3f\n", (double)foot, nilaiMeters, (double)meter, nilaiFoot);
        }
    }
    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }
    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }
}
