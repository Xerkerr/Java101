import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //değişkenleri oluşturalım
        int mat, fizik, kimya, turkce, tarih, muzik;

        //scanner sınıfı
        Scanner inp = new Scanner(System.in);

        //kullanıcıdan değeri al
        System.out.print("matematik notun : ");
        mat = inp.nextInt();

        System.out.print("fizik notun : ");
        fizik = inp.nextInt();

        System.out.print("kimya notun : ");
        kimya = inp.nextInt();

        System.out.print("turkce notun : ");
        turkce = inp.nextInt();

        System.out.print("tarih notun : ");
        tarih = inp.nextInt();

        System.out.print("muzik notun : ");
        muzik = inp.nextInt();

        int toplam = (mat+fizik+kimya+turkce+tarih+muzik);
        double ortalama = toplam / 6.0 ;
        String sonuc = (ortalama >= 50 ) ? "geçtiniz" : "kaldınız";
        System.out.println("ortalamanız = " + sonuc);

    }

}