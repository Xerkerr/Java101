import java.util.Scanner;

public class Main {
    public static void main (String [] args ){
        int n;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        n = input.nextInt();

        for(int i =1 ; i<=n ; i*=5 ){
            System.out.println(i);
        }




    }






}
