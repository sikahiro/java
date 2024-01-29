package Test14;

import java.util.Scanner;

public class L14_4 {
    public static void main(String[] args){
        Scanner sd = new Scanner(System.in,"shift-jis");
        System.out.println("文字列を2つ入力してください");
        System.out.print("1つ目文字列を入力:");
        String si=sd.nextLine();
        System.out.print("2つ目文字列を入力:");
        String so =sd.nextLine();
        if (si.equals(so)){
            System.out.println("同じ文字列です");
        }else{
            System.out.println("違う文字列です");
        }
    }
}
