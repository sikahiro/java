package Test4;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args){
        Scanner vr = new Scanner(System.in);
        System.out.println("0~100までの得点(整数値)を2つ入力してください");
        System.out.print("国語の得点:");
        int kokugo = vr.nextInt();
        System.out.print("英語の得点:");
        int eigo = vr.nextInt();
        if (kokugo>=80 && eigo>=80)
            System.out.println("2科目とも合格です。");
    }
}
