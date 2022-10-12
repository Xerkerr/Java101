import java.util.Scanner;

public class burc {
    public static void main(String[] args) {
        int gün, ay;
        String burc, yanlış;

        Scanner input = new Scanner(System.in);

        System.out.println("Gününüzü giriniz : ");
        gün = input.nextInt();
        System.out.println("Ayınızı giriniz : ");
        ay = input.nextInt();

        if (ay == 1) {
            if (gün >= 1 && gün <= 31) {
                if (gün < 22) {
                    System.out.println("burcunuz oğlak");
                } else {
                    burc = "Kova";
                    System.out.println("burcunuz kova");
                }
            } else {
                yanlış = "yanlış ay";
                System.out.println("Hatalı giriş yaptınız. Lütfen tekrar deneyiniz..");
            }
        }


        }}