package kouka;
// Animalクラスを継承しTyping2インターフェースを実装
public class Jewel extends Animal implements Typing2{
    // jewel配列に宝石の名前を格納する
    private String[] jewel={"サファイア","エメラルド","ダイヤモンド","ルビー","パール","アレキサンドライト","ガーネット","アメシスト","サンストーン","ジャスパー","ターコイズ","トパーズ","ブラックオパール","マラカイト","ムーンストーン","ラピスラズリ","クォーツ","アクアマリン","オブシディアン","タイガーアイ"};
    // 代入用の変数
    private String jewelS;
    // コンストラクタでjewelSとanimalSを初期化する
    public Jewel(String jewelS,String animalS){
        super(animalS);
        this.jewelS=jewelS;
    }
    // 配列からランダムに名前を選んでjewelSに代入
    @Override public String setwordjewel(){
        int num1 = new java.util.Random().nextInt(getwordjewelnum());
        return this.jewelS=jewel[num1];
    }
    // jewelSに値を返すメソッド
    @Override public String getwordjewel(){
        return this.jewelS;
    }
    // 配列の長さを取得
    @Override public int getwordjewelnum(){
        return jewel.length;
    }
}
