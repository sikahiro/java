package Test13.L13_4;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scannerint =new Scanner(System.in);
        System.out.println("1個目の整数を入力してください:");int num1=scannerint.nextInt();
        System.out.println("2個目の整数を入力してください:");int num2=scannerint.nextInt();
        CalcExcuter calc =new CalcExcuter(num1, num2);
        calc.dispAdd();
    }
}
