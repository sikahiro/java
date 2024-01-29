package Test14;

import java.util.Scanner;

public class L14_5 {
    public static void main(String[] args){
        Scanner gg=new Scanner(System.in,"shift-jis");
        System.out.print("【内容1】");
        String to =gg.nextLine();
        System.out.print("【内容2】");
        String toi =gg.nextLine();
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        s1.append(to);
        s2.append(toi);
        System.out.println(s1.append(s2));
    }
}
