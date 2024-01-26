package Test14;
import java.util.Scanner;
public class L14_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 文字列を入力してもらう
        System.out.print("文字列を入力:");
        String tg =sc.nextLine();
        // 入力された文字数を表示
        System.out.println("入力された文字列は"+tg.length()+"です");
    }
}
