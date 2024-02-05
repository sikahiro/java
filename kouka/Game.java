package kouka;

import java.util.Scanner;

public class Game extends Jewel{
    // スコアカウント用の変数
    private int score;
    // ミスカウント用の変数
    private int miss;
    public Game(String jewelS, String animalS,int score,int miss){
        super(jewelS, animalS);
    }
    // スコアに引数を加算するメソッド
    public void setscore(int score){
        this.score+=score;
    }
    // スコアの値を返すメソッド
    public int getscore(){
        return this.score;
    }
    // ミス数に引数の値を加算するメソッド
    public void setmiss(int miss){
        this.miss+=miss;
    }
    // ミス数の値を返すメソッド
    public int getmiss(){
        return this.miss;
    }
    // animalgameメソッドで動物の名前のタイピングゲームを行う
    public void animalgame(){
        for (int count=0;count<10;count++){
            // 動物の名前をランダムに設定する
            setwordanimal();
            // 動物の名前を表示する
            System.out.println(getwordanimal());
            // 入力を受け付ける
            @SuppressWarnings("resource")
            String input =new Scanner(System.in,"shift-jis").nextLine();
            System.out.println("-------");
            // 入力が正しいか判定する
            if(input.equals(getwordanimal())){
                // 正しい場合スコアに10点加算
                setscore(10);
                }
            else{
                // 間違っている場合ミス数に1加算し、スコアに0点加算する
                setmiss(1);
                setscore(0);
            }
        }
        // ループ終了後、解答終了とスコアとミス数を表示
        System.out.println("解答終了\nスコア"+getscore()+"\nミス数"+getmiss());
        System.out.println("-----------");
    }
    // jewelgameメソッドで宝石の名前のタイピングゲームを行う
    public void jewelgame(){
        for (int count=0;count<10;count++){
            // 宝石の名前をランダムに設定する
            setwordjewel();
            // 宝石の名前を表示する
            System.out.println(getwordjewel());
            // 入力を受け付ける
            @SuppressWarnings("resource")
            String input =new Scanner(System.in,"shift-jis").nextLine();
            System.out.println("-------");
            // 入力が正しいか判定する
            if(input.equals(getwordjewel())){
                // 正しい場合スコアに10点加算
                setscore(10);
                }
            else{
                // 間違っている場合ミス数に1加算し、スコアに0点加算する
                setmiss(1);
                setscore(0);
            }
        }
        // ループ終了後、解答終了とスコアとミス数を表示
        System.out.println("解答終了\nスコア"+getscore()+"\nミス数"+getmiss());
        System.out.println("---------");
    }   
}