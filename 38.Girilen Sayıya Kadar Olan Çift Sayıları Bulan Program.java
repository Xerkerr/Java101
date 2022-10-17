import java.util.Scanner;


public class Ciftsayibulma {
    public static void main(String [] args){
    int k;
    Scanner inp = new Scanner(System.in);


    System.out.print("sayi giriniz : ");
    k = inp.nextInt();

    //for ile bulma
  for(int i = 1; i <= k; i++) {
      if (i % 2 == 0) {
          System.out.println(i);
      }
  }}}
