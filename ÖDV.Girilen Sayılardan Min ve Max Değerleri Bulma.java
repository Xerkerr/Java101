
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int min=0,max=0,sayi,n;

        Scanner inp=new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz:");
        n=inp.nextInt();

        for(int i=1;    i<=n;    i++){
            System.out.print(i+". Sayıyı giriniz:");
            sayi=inp.nextInt();
            if(i==1){
                min=sayi;
                max=sayi;
            }
            if(sayi<min){
                min=sayi;
            }if (sayi>max) {
                max=sayi;
            }
        }
        System.out.println("Min: "+min);
        System.out.println("Max: "+max);




    }
}


































/*import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n1 = 0, n2=0, n3=0, n4= 0;
        System.out.println(" 4 tane sayı giriniz : ");

        System.out.println(" 1.Sayınızı giriniz : ");
        n1 = input.nextInt();
        System.out.println(" 2.Sayınızı giriniz : ");
        n2 = input.nextInt();
        System.out.println(" 3.Sayınızı giriniz : ");
        n3 = input.nextInt();
        System.out.println(" 4.Sayınızı giriniz : ");
        n4 = input.nextInt();

*/

