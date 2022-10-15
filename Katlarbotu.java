import java.util.Scanner;

public class Katlarbotu {
    public static void main(String[] args) {
     int n;
     int total = 0;
     Scanner scan =new Scanner(System.in);

     do{
         System.out.print("Sayi giriniz :");
         n = scan.nextInt();
         if(n%2 == 0 || n%4 == 0){
             total +=1;

         }
     }while (n%2 == 0 || n%4 == 0);
     System.out.println("toplam :" +total);
    }}
