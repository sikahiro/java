package Test8;
// import java.util.List;
// import java.util.Arrays;
// import java.util.ArrayList;

class Test5 {
    public static void main(String[] args){
        // 要素が5個の配列
        int[] n ={1,2,3,4,5};
        // 要素数を取得
        int length =n.length;
        // 合計値の変数
        int sum =0;
        // 平均の変数
        double average =0.0;
        // iが要素数より多くなるまで繰り返す
        for (int i = 0; i < length;i++){
            // sumに加算
            sum+=n[i];
        }
        // 平均を計算
        average =(double)sum/length;
        // 結果の表示
        System.out.println("合計値は"+sum+"です");
        System.out.println("平均値は"+average+"です");
    }
}
// """"リストで書く場合"""
// public static void main(String[] args){
//     List<Integer> array = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
//     int sum =0;
//     for (int i =0;i<array.size();i++){
//         sum+=array.get(i);
//     }
//     System.out.println("合計値は"+sum+"です");
//     System.out.println("合計値は"+(sum/array.size())+"です");
//     }
// }