import java.util.Scanner;

public class lab55 {
    public static void main(String[] args) {
        String s1 = "";
        String s2 = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть перший рядок:");
        if(sc.hasNext()){
            s1=sc.next();
        }
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Введіть другий рядок:");
        if(sc2.hasNext()){
            s2=sc2.next();
    }
        if(s1.length()>s2.length()){
        System.out.println("Перший рядок довший");
        }
        else{
            System.out.println("Другий рядок довший");
        }
    }
}
