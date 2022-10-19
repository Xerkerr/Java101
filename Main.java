import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String kullaniciadi, sifre;
        Scanner input = new Scanner(System.in);

        int hak = 3;
        int bakiye = 1500;
        int secim;

        while (hak > 0) {
            System.out.print("Kullanıcı Adınız :");
            kullaniciadi = input.nextLine();
            System.out.print("Parolanız : ");
            sifre = input.nextLine();

            if(kullaniciadi.equals("x")&& sifre.equals("1")){
                System.out.println("Selamun aleyküm çiftlik banka hoşgeldin ");
                System.out.println("Yapmak istediğin seçeneği girebilirsin ");
                System.out.println("1-Bakiye sorulama\n2-Para çekme\n3-Para yatırma\n4-Çıkış");
                secim = input.nextInt();

                    switch(secim){
                        case 1:
                            System.out.println("Bakiyeniz : " +bakiye);
                                break;

                        case 2:
                             System.out.print("Çekmek istediğin para miktarı : ");
                             int para = input.nextInt();
                                    if(para > bakiye){
                                        System.out.println("Paran o kadar yok");}
                                    else{bakiye -= para;
                                        System.out.println("Yeni bakiyeniz : " +bakiye);}
                                    break;

                        case 3:
                             System.out.print("Yatırmak istediğin para tutarı : ");
                             int tutar = input.nextInt();
                             bakiye += tutar;
                             System.out.println("Paranız yatırıldı, yeni bakiyeniz : " + bakiye);
                                    break;

                        case 4:
                            System.out.println("Bir daha görüşmek üzere");
                                    break;
                 }}
            else{
                hak --;
                    System.out.println("Yanlış girdin. Tekrar dene !.");
                if(hak==0){
                    System.out.println("Hakkın bitti hadi selametle !.");
                }

            }
        }}}

