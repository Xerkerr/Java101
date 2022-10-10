import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//değişkenlerimizi oluşturalım
    int r;
    double pi = 3.14;

    Scanner inp = new Scanner(System.in);

    System.out.print("dairenin yarı çapını gir : " );
    r = inp.nextInt();

    double alan = pi * r * r;
    double cevre = pi * r * 2;


    System.out.println("sistemin çevresi = " + cevre);
    System.out.println("sistemin alanı = " + alan);





    }
    }