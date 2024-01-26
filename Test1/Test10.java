package Test1;
import java.util.Scanner;
public class Test10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in,"shift-jis");
        System.out.print("文字の入力:");
        String memo =sc.next();
        System.out.print("整数を入力:");
        int num =sc.nextInt();
        System.out.print("小数の入力:");
        double num2 = sc.nextDouble();
        System.out.println("入力された文字＝"+memo);
        System.out.println("入力された整数＝"+num);
        System.out.println("入力された小数"+num2);
    }
    
    
}
