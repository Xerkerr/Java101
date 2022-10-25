public class Main {
    static boolean isPalindrom (int sayi){
        int temp=sayi,terssayi =0,sonsayi;
        while (temp!=0){
            sonsayi=temp%10;
            terssayi=(terssayi*10)+sonsayi;
            temp/=10;
            if (temp==terssayi){
                return true;
            }else {
                return false;
            }
        }
        return true;
    }
    public static void main(String[]args){
        System.out.println(isPalindrom(4));
    }

}
