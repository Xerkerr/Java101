import java.util.Scanner;
//Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
//Geçme Notu : 55
//Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.

public class Main {
    public static void main(String[] args) {
        //değişkenleri oluşturalım
        int mat, fizik, kimya, turkce, muzik;


        Scanner inp = new Scanner(System.in);


        System.out.print("matematik notun : ");
        mat = inp.nextInt();

        System.out.print("fizik notun : ");
        fizik = inp.nextInt();

        System.out.print("kimya notun : ");
        kimya = inp.nextInt();

        System.out.print("turkce notun : ");
        turkce = inp.nextInt();

        System.out.print("muzik notun : ");
        muzik = inp.nextInt();

        double toplam = (mat + fizik + kimya + turkce + muzik) / 5;
        if (toplam <= 55){
            System.out.print("kaldın : ");
            System.out.print("ortalaman : "  + toplam);}
        else{
            System.out.print("geçtin : ");
            System.out.print("ortalaman : "  + toplam);
            }

        }

    }