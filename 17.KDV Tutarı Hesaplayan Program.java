import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        double tutar, kdvoran = 0.18, kdvtutar, kdvlitutar;

        Scanner input = new Scanner(System.in);
        System.out.print("ücret tutarını giriniz : ");
        tutar = input.nextDouble();

        kdvtutar = tutar * kdvoran;
        kdvlitutar= tutar + kdvtutar;

        System.out.println("kdv siz tutar :" + tutar);
        System.out.println("kdv oranı :" + kdvoran);
        System.out.println("kdv tutarı :" + kdvtutar);
        System.out.println("kdvli tutar :" + kdvlitutar);
    }
    }



















