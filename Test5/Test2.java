package Test5;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args){
        Scanner hi = new Scanner(System.in);
        System.out.print("クラス番号(1~3)の値を入力してください:");
        int clas = hi.nextInt();
        switch(clas){
            case 1:System.out.println("情報処理コース");
                break;
            case 2:System.out.println("OAビジネスコース");
                break;
            case 3:System.out.println("税理士コース");
                break;
            default:System.out.println("不正な入力です");
                break;    
        }
    }
}
