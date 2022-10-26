import java.util.Scanner;

public class Main {

    static int power(int sayi, int üst){
        int result=1;

        for (int i=1; i<=üst; i++){
            result*=sayi;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("1. Sayı: ");
        int sayi = input.nextInt();
        System.out.print("2. Sayının üstü: ");
        int üst = input.nextInt();

        System.out.println("Sonuç: " + power(sayi, üst));


    }
}
