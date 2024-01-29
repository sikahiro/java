package Test11.L11_3;
import java.util.Scanner;
class Calc2 {
    public static void main(String[] args){
        Scanner stbin =new Scanner(System.in);
        System.out.print("整数値を入力:"); int x=stbin.nextInt();
        System.out.print("整数値を入力:"); int y=stbin.nextInt();
        Calc calc = new Calc(x, y);

        System.out.println(x+"から"+y+"までの合計値は"+calc.sum()+"です。");
    }
}
