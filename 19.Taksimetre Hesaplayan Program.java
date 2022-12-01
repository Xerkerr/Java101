import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int km;
        double perKm = 2.20, startPrice = 10, total;

        Scanner input = new Scanner(System.in);
        System.out.print("mesafeyi km olarak gir :"  );
        km = input.nextInt();

        total = (km * perKm);
        total += startPrice;

        System.out.println("giren ücret : " + total);
//taksimetre


    }
}
