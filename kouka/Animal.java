package kouka;
// animalクラスにTypingインターフェースを実装する
public class Animal implements Typing {
    // animal配列に動物の名前を格納する
    private String[] animal={"雀","鳶","鷹","鷲","鯨","土竜","麒麟","蝙蝠","鴉","水牛","蜥蜴","蛇","亀","兎","犬","鰐","蛙","白鳥","猫"};
    // 代入用の変数
    private String animalS;
    // コンストラクタでanimalSを初期化する
    public Animal(String animalS){
        this.animalS=animalS;
    }
    // 配列からランダムに名前を選んでanimalSに代入
    @Override public String setwordanimal(){
        int num = new java.util.Random().nextInt(getwordanimalnum());
        return this.animalS=animal[num];
    }
    // animalSの値を返すメソッド
    @Override public String getwordanimal(){
        return this.animalS;
    }
    // 配列の長さを取得
    @Override public int getwordanimalnum(){
        return animal.length;
    }
    
}
