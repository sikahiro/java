package Test7;

class Test4 {
    public static void main(String[] args){
        //合計を入れる変数
        int sum =0;
        // カウントする変数
        int c = 1;
        // 100000以上になるまで繰り返し
        while (sum<=100000) {
            // 合計にcを加算
            sum+=c;
            // cをインクリメント
            c++;
        }
        // 結果を表示
        System.out.println("合計が100000を超えるnは"+c+"です");
    }
}
