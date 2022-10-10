import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    double armut , elma , domates , patlıcan, muz, toplam ;

    //armut = 2.14, elma = 3.67, domates = 1.11, patlıcan = 5.00, Muz: 0,95 TL

        Scanner girdi = new Scanner(System.in);
    //scanner ekliyoruz

        System.out.print("Kaç kilo armut");
        armut = girdi.nextInt();

        System.out.print("Kaç kilo elma");
        elma = girdi.nextInt();

        System.out.print("Kaç kilo domates");
        domates = girdi.nextInt();

        System.out.print("Kaç kilo muz");
        muz = girdi.nextInt();

        System.out.print("Kaç kilo patlıcan");
        patlıcan = girdi.nextInt();




        armut = armut * 2.14;
        elma = elma * 3.67;
        domates = domates * 1.11;
        muz = muz *0.95;
        patlıcan = patlıcan * 5.00;


        toplam = armut+elma+domates+patlıcan+muz;
        System.out.println("Toplam tutar : " + toplam);


    }
    }