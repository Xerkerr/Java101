import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        double boy, kilo, kitle ;

        Scanner input = new Scanner(System.in);
        System.out.print("boyunuzu metre cinsinden giriniz : ");
        boy = input.nextDouble();

        Scanner İnput = new Scanner(System.in);
        System.out.print("boyunuzu kilonuzu kg olarak giriniz : ");
        kilo = input.nextDouble();

        kitle = (kilo / (boy * boy));


        System.out.println("vücut kitle endeksiniz :" + kitle);
        String sonuç = (kitle >= 30) ? "tanker" : "ideal";
        System.out.println("Vaziyet " + sonuç );

    }
}
