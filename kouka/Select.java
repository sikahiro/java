package kouka;

import java.util.InputMismatchException;

public class Select extends Game{
    public Select(String jewelS,String animalS,int score,int miss){
        super(jewelS, animalS, score, miss);
    }
    // ゲームを続けるかどうかの真偽値の変数
    private boolean logic = true; 
    // ゲームのモードを選択する変数
    private int mode;
    // モードに引数の値を代入するメソッド
    public void setmode(int mode){
        this.mode=mode;
    }
    // モードに値を返すメソッド
    public int getmode(){
        return this.mode;
    }
    // logicに引数の値をを代入するメソッド
    public void setLogic(boolean logic) {
        this.logic = logic;
    }
    // logicの値を返すメソッド
    public boolean getLogic() {
        return this.logic;
    }
    // selectメソッドでモードを選択
    public void select(){
        // 問題のジャンルを選択するよう促す
        System.out.println("問題のジャンルを数字で選択してください(1~2)");
        System.out.println("1:動物(漢字)  2:宝石(カタカナ)");

        try{
            // 入力を受け付ける
            @SuppressWarnings("resource")
            int point=new java.util.Scanner(System.in).nextInt();
            // モードに入力値を代入
            setmode(point);
            // モードによって分岐する
            if(getmode()==1){
                // モードが1なら動物の問題を選択したと表示
                System.out.println("動物の問題を選択しました\n---------------");
            }
            else if(getmode()==2){
                // モードが2なら宝石の問題を選択したと表示
                System.out.println("宝石の問題を選択しました\n---------------");
            }
            else{
                // モードが1,2以外なら1,2を入力するように表示し、selectメソッドを呼び出す
                System.out.println("1,2を入力してください\n---------------");
                select();
            }
        }catch(InputMismatchException e){
            // 入力が数字でない場合数字で入力するよう表示しselectメソッドで呼び出す
            System.out.println("数字で入力してください\n---------------");
            select();
        }
    }
    // reStartメソッドでゲームを再開するかどうか選択
    public void reStart() {
        // ゲームを続けるか選択するよう表示
        System.out.println("もう一度プレイしますか？【はい,いいえ : 1,2】");

        try {
            // 入力を受け付ける
            @SuppressWarnings("resource")
            int restart = new java.util.Scanner(System.in).nextInt();
            // 入力値によって分岐する
            if(restart==1) {
                // 入力値が1ならスコアを0にし、logicをtrueにする
                setscore(-(getscore()));
                setLogic(true);
            }
            else if(restart==2){
                // 入力値が2ならお疲れさまでしたと表示し、logicをfalseにする
                System.out.println("お疲れさまでした。");
                setLogic(false);
            }
            else {
                // 入力値が1,2以外なら1,2を入力するように表示し、logicをfalseにして、reStartメソッドを呼び出す
                System.out.println("1か2で入力してください");
                setLogic(false);
                reStart();
            }
        }
        catch(InputMismatchException e) {
            // 入力が数字でない場合数字の1か2を入力するように表示し、logicをfalseにして、reStartメソッドを呼び出す
            System.out.println("数字の1か2を入力してください");
            setLogic(false);
            reStart();
        }
    }
    
}