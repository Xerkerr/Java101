import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int n;
        System.out.print("Ters üçgen için n sayısını giriniz: ");
        n = input.nextInt();



        for (int z = 1; z <= n; z++) {
            for (int m =1; m<=z ; m++) {
                System.out.print(" ");
            }
            for (int b =1; b<=(2*n-2*z-1); b++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}