package Sample;
import java.util.*;
class Sample1_2 {
    public static void main(String[] args){
        // ArrayListのインスタンス化
        List<Integer> list =new ArrayList<>();
        // listに用紙を追加
        list.add(0); list.add(1); print("要素を追加:",list);
        // listのindex1に要素を挿入
        list.add(1,2);print("要素数を挿入:",list);
        // listのindex１の要素を削除
        list.remove(1);print("要素を削除",list);
        // listのindex０の要素を変更
        list.set(0,10);print("要素を変更",list);
        // listの要素を検索
        int index = list.indexOf(10);
        System.out.println("要素を検索:"+index);
        //listに要素が含まれるか確認
        boolean chk = list.contains(10);
        System.out.println("要素の確認:"+chk);
        //listの要素数
        int indexNum =list.size();
        System.out.print("要素数:"+indexNum);
    }
    //出力用のメソッド
    static void print(String text,List<Integer> list){
        System.out.print(text);
        //コレクションは拡張 for も使用可能
        for(int val : list) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
