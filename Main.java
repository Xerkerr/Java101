import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    Scanner scan=new Scanner(System.in);
        System.out.println("Dizinin eleman sayısını giriniz");
        int elemanboyu= scan.nextInt();
        System.out.println("Dizinin elemanlarını giriniz");
        int[] elemanlar=new int[elemanboyu];
        for ( int i=0; i<elemanlar.length; i++){
            elemanlar[i]= scan.nextInt();
        }

        Arrays.sort(elemanlar);
        System.out.println(Arrays.toString(elemanlar));


       /*
        Scanner scan=new Scanner(System.in);
        System.out.println("dizinin boyutunu giriniz");
        int boyut=scan.nextInt();
        System.out.println("dizinin elemanlarini giriniz");
        int[] arr=new int[boyut];
        for (int i=0; i<arr.length; i++){

            arr[i]=scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.print(Arrays.toString(arr));
*/
   }

}