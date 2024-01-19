package Test8;
import java.util.Scanner;
class Test8 {
    // 最大を求める関数
    static int max(int a,int b,int c){
        int max =a;
        if (b>max) max=b;
        if (c>max) max=c;
        return max;
    }
    // 最小を求める関数
    static int min(int a,int b,int c){
        int min =a;
        if (b<min) min=b;
        if (c<min) min=c;
        return min;
    }
    public static void main(String[] args){
        Scanner stbln =new Scanner(System.in);
        // 数値の入力
        System.out.println("整数値を3つ入力してください");
        System.out.print("1つ目の整数値:"); int a= stbln.nextInt();
        System.out.print("2つ目の整数値:"); int b= stbln.nextInt();
        System.out.print("3つ目の整数値:"); int c= stbln.nextInt();
        // 結果の表示
        System.out.println(String.format("最大値:%d", max(a, b, c)));
        System.out.println(String.format("最小値:%d", min(a, b, c)));
    }
}
