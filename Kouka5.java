import java.util.Scanner;
class Kouka5 {
    // 合計点を求める関数
    static int sum(int a,int b,int c,int d,int e){
        int sum=a+b+c+d+e;
        return sum;
    }
    // 平均点を求める関数
    static float average(float a,float b,float c,float d,float e){
        float average =(a+b+c+d+e)/5;
        return average;
    }
    public static void main(String[] args){
        Scanner stbln =new Scanner(System.in);
        // 点数の入力
        System.out.print("1教科目の点数を入力してください:"); int a= stbln.nextInt();
        System.out.print("2教科目の点数を入力してください:"); int b= stbln.nextInt();
        System.out.print("3教科目の点数を入力してください:"); int c= stbln.nextInt();
        System.out.print("4教科目の点数を入力してください:"); int d= stbln.nextInt();
        System.out.print("5教科目の点数を入力してください:"); int e= stbln.nextInt();
        // 計算結果の表示
        System.out.println("合計点="+sum(a,b,c,d,e));
        System.out.println("平均点="+average(a, b, c, d, e));
        }
    }

