import java.util.Scanner;

public class lab54 {
    public static void main(String[] args) {
        String s1 = "";
        String s2 = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть перше слово:");
        if(sc.hasNext()){
            s1=sc.next();
        }
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Введіть друге слово:");
        if(sc2.hasNext()){
            s2=sc2.next();
        }
        if(s2.equalsIgnoreCase(s1)){
            System.out.println("Слова однакові");
        }
        else{
            System.out.println("Слова різні");
        }
    }
}