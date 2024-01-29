package Test14;

import java.util.Scanner;

public class L14_3 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in,"shift-jis");
        System.out.print("文字列を入力:");
        String set =sc.nextLine();
        StringBuilder si = new StringBuilder();
        si.append(set);
        if (si.length()>10)
            si.delete(10,si.length());
        System.out.println("結果文字列:"+si);
    }
}
