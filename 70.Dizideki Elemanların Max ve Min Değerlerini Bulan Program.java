import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int[] numbers = {15, 12, 788, 1, -1, -788, 2, 0};
        int min = numbers[3];
        int max = numbers[0];

        System.out.print("Numara giriniz: ");
        number = sc.nextInt();

        for (int num : numbers) {
            if (num >= number) {
                if (num - number < max - number) {
                    max = num;
                }
            } else {
                if (number - num < number - min) {
                    min = num;
                }}}
        System.out.println("Yakın numara(büyük): " + max);
        System.out.println("Yakın numara(kucuk): " + min);
    }
}
