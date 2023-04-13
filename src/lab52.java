import java.util.Scanner;

public class lab52 {
    public static void main(String[] args) {
        String s1;
        String s2 = "";
        String s3 = "";
        for(int i = 1; i<=5; i++){
            System.out.print("Введіть слово");
            Scanner sc = new Scanner(System.in);
            s1=sc.next();
            s2=s1.substring(0,1);
            s3=s3.concat(" " + s2);
        }
        System.out.print(s3);
    }
}