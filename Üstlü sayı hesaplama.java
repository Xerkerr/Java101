import java.util.Scanner ;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n,k ;

        System.out.print("Enter the bottom number : ");
        n = input.nextInt();

        System.out.print("Enter the exponent : ");
        k = input.nextInt();

        int total = 1 ;

        for (int i = 1 ; i <= k ; i++){
            total *= n ;
        }
        System.out.println(n + "^" + k + " : " + total);
    }
}
