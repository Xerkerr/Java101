import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sayi, total = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        sayi = in.nextInt();

              for(int i=1; i<sayi; i++){
                     if(sayi%i==0){
                         total +=i;}}

              if(total==sayi){
                  System.out.println("Sayınız mükemmellll"  +sayi   +total);
              }
              else{
                  System.out.println("Sayınız berbatt" +sayi +total);
              }
    }}
