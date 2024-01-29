package Test4;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args){
        Scanner sd =new Scanner(System.in);
        System.out.println("0~100までの得点(整数値)を2つ入力してください");
        System.out.print("国語の得点:");
        int kokugo =sd.nextInt();
        System.out.print("英語の得点:");
        int eigo =sd.nextInt();
        if (kokugo==100 && eigo==100)
            System.out.println("満点です");
    }
}
