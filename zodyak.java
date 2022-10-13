
import java.util.Scanner;


public class zodyak{
    public static void main(String[] args) {
        int kalan, mod;
        String burc = null;

        Scanner inp = new Scanner(System.in);
        System.out.println("Doğum yılınızı giriniz:");
        int yil = inp.nextInt();

        mod=yil%12;

        switch (mod){
            case 0:
                burc = "maymun";
                break;
            case 1:
                burc = "horoz";
                break;
            case 2:
                burc = "köpek";
                break;
            case 3:
                burc = "domuz";
                break;
            case 4:
                burc = "fare";
                break;
            case 5:
                burc = "öküz";
                break;
            case 6:
                burc = "kaplan";
                break;
            case 7:
                burc = "davşan";
                break;
            case 8:
                burc = "ejderha";
                break;
            case 9:
                burc = "yılan";
                break;
            case 10:
                burc = "at";
                break;
            case 11:
                burc = "koyun";
                break;

        }
        System.out.println("Hayvanınız :" +burc  );

    }}