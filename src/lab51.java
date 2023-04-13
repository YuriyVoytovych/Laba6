import java.util.Scanner;

public class lab51 {
    public static void main(String[] args) {
        String s1;
        String s2 = "";
        for(int i = 1; i<=5; i++){
            System.out.print("Введіть слово");
            Scanner sc = new Scanner(System.in);
            s1=sc.next();
            s2=s2.concat(" " + s1);
        }
        System.out.print(s2);
    }
}