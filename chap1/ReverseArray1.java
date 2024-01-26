import java.util.Scanner;

class ReverseArray1 {

    static void swap(int[] a,int idex1,int idex2){
        try{
            int t=a[idex1];
            a[idex1]=a[idex2];
            a[idex2]=t;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("メソッドswap内で不正なインデックスを検出しました。");
            System.out.println("プログラムを終了します。");
            System.exit(1);
        }
    }

    static void reverse(int[] a){
        for (int i=0;i<a.length/2;i++)
            swap(a, i,a.length- i);
    }
    
    public static void main(String[] args){
        Scanner stbin =new Scanner(System.in);
        System.out.println("要素数:");
        int num = stbin.nextInt();

        int[] x =new int[num];

        for (int i=0;i<num;i++){
            System.out.print("x["+i+"]:");
            x[i]=stbin.nextInt();
        }
    
        reverse(x);

        System.out.println("要素の並びを反転しました。");
        for (int i=0;i<num;i++)
            System.out.println("x["+i+"]="+x[i]);
    }
}
