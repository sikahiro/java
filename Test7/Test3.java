package Test7;
import java.util.Scanner;
class Test3 {
    public static void main(String[] args){
        Scanner stbin = new Scanner(System.in);
        int x;
        do{
            System.out.println("整数値を入力：");
            x=stbin.nextInt();
        }while (x<=0);
        while (x>0) {
            System.out.print(x%10);
            x/=10;
        }
    }
}
