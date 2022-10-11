import java.util.Scanner;

public class kullanicigirisi {
    public static void main(String[] args){
        String username, password;

    Scanner inp = new Scanner(System.in);

    System.out.println("kullanici adiniz ");
    username= inp.nextLine();

    System.out.println("sifreniz ");
    password = inp.nextLine();

    if (username.equals("patika") && (password.equals("123213") )){
    
    }
        System.out.println("sokuldun !" );

    }


}
