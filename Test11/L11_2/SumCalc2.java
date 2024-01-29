package Test11.L11_2;
import java.util.Scanner;
class SumCalc2 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        SumCalc scalc =new SumCalc();
        System.out.println("整数値を入力"); scalc.x=sc.nextInt();
        System.out.println("整数値を入力"); scalc.y=sc.nextInt();
        System.out.println(scalc.x+"から"+scalc.y+"までの合計値は"+scalc.calcSum()+"です");
    }
}
