import java.util.Scanner;

public class lab53 {
    public static void main(String[] args) {
        double a=0, b=0, c=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть дробове число:    ");
        if(sc.hasNextDouble()){
            a=sc.nextFloat();
          }
        System.out.print("Введіть дробове число:");
        if(sc.hasNextDouble()){
            b=sc.nextDouble();
            }
        System.out.print("Введіть дробове число:");
        if(sc.hasNextDouble()){
            c=sc.nextDouble();
        }
        if(a>b && a>c){
            System.out.println("Перше число є найбільше");
        }
        if(b>a && b>c) {
                System.out.println("Друге число є найбільше");
        }
        if(c>a && c>b){
                System.out.println("Третє число є найбільше");

        }
        if(a==b && a==c && b==c){
                System.out.println("Числа є рівними");
        }
        if(a==b && a>c){

                System.out.println("Перше і друге число є найбільше");
        }
        if(b==c && b>a){
                System.out.println("Друге і третє число є найбільше");
        }
        if(a==c && a>b){
                System.out.println("Перше і третє число є найбільше");
        }
    }
}
