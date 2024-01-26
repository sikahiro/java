package Test15;
import java.util.Scanner;
public class L15_1 {
    public static void main(String[] args){
        Scanner hi = new Scanner(System.in);
        try{
            System.out.print("整数1=");
            int num1=hi.nextInt();
            System.out.print("整数2=");
            int num2 =hi.nextInt();
            System.out.println(num1+"/"+num2+"="+num1/num2);
        }catch(ArithmeticException e){
            System.out.println("0による割り算です!!");
        }finally{
            System.out.println("処理終了");
        }
    }
}
