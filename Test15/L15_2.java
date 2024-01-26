package Test15;
import java.util.InputMismatchException;
import java.util.Scanner;
public class L15_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            // 整数を入力
            System.out.print("整数を入力=");
            int num =sc.nextInt();
            //偶数と奇数の判定を行う
            if (num%2==0)
                System.out.println(num+"は偶数");
            else
                System.out.println(num+"は奇数");
        // 入力が整数以外の場合
        }catch (InputMismatchException e){
            System.out.println("整数と認識できません!!");
        }
    }
}