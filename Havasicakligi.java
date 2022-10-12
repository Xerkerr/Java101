import java.util.Scanner;


        //Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner. bitti
        //Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.bitti
        //Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
        //Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.

public class Main {
    public static void main(String [] args){
        int heat;

        Scanner input = new Scanner(System.in);
            System.out.print("sıcaklık giriniz : ");
            heat = input.nextInt();

            if (heat<5){
                System.out.println("kayabilirsiniz.");}

            else if (heat <=25 ) {
                     if (heat <= 15){
                    System.out.println("sinemaya git");}
                     if (heat >= 10){
                    System.out.println("pikniğe git");} }

            else {
            System.out.println("yüzmeye git");}
        }
}


