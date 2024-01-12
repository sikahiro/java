package Test;
import java.util.Scanner;
class Test9 {
    public static void main(String[] args){
        Scanner stdIn=new Scanner(System.in,"shift-jis");
        System.out.println("お名前を入力してください。");
        String str =stdIn.next();
        System.out.println("こんにちは"+ str +"さん。");
    }
}
