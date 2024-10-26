public class cobaSoal {
    public static void main(String[] args) {
        // int i = 1;
        // while (i < 10)
        //     if ((i++) % 2 == 0)
        //         System.out.println(i);
    //    int i = 0;
    //    while (i < 5) {
    //     for (int j = i; i < 5; j--){
    //         System.out.println(j + " ");
    //     } System.out.print("****");
    //    } 

            int sum = 0, number = 0;

            while (number < 20) {

                number++;
                sum += number;
                if ( sum >= 100) 
                break;
                // continue; jika tidak ingin menjalan kan program di bawah continue

                System.out.println(sum);
            }
            System.out.println("Sum " + sum);
            System.out.println("Number " + number);
    }
}