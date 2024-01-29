package Test4;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("0~100までの得点(整数値)を入力してください:");
        int score =sc.nextInt();
        if (score>=80)
            System.out.println("合格です");
    }
}
