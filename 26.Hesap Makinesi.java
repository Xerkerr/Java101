import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, sec;


        Scanner input = new Scanner(System.in);
        System.out.print("ilk sayını gir : ");
        n1 = input.nextInt();
        System.out.print("ikinci sayını gir : ");
        n2 = input.nextInt();

        System.out.println("1-topla\n 2-çıkar\n 3-böl\n 4-çarp");
        System.out.println("seçiminiz : ");
        sec = input.nextInt();


        switch (sec) {
            case 1:
                System.out.println("Sonucunuz " + (n1+n2));
                break;
            case 2:
                System.out.println("Sonucunuz " + (n1-n2));
                break;
            case 3:
                System.out.println("Sonucunuz " + (n1/n2));
                break;
            case 4:
                System.out.println("Sonucunuz " + (n1*n2));
                break;

        }
    }}


