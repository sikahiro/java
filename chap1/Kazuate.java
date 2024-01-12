import java.util.Random;
import java.util.Scanner;
class Kazyate{
    public static void main(String[] args){
        Random rand =new Random();
        Scanner stbin =new Scanner(System.in);
        int no =rand.nextInt(100);
        System.out.println("数数当てゲーム開始");
        System.out.println("0～99の数を当ててください");
        int x;
        do{
            System.out.println("いくつかな：");
            x=stbin.nextInt();
            if (x>no)
                System.out.println("もっと小さな数だよ");
            else if (x<no)
                System.out.println("もっと大きな数だよ");
        }while (x!=no);
        System.out.println("正解です");
    }
}
