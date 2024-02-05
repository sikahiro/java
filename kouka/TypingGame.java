package kouka;

public class TypingGame extends Select{
    public TypingGame(String jewelS,String animalS,int score,int miss){
        super(jewelS, animalS, score, miss);
    }
    // typingGameメソッドでタイピングゲームを実行する
    public void typingGame(){
        while (getLogic()==true) {
        // タイピングゲームと表示
        System.out.println("タイピングゲーム");
        // selectメソッドでモードを選択する
        select();

        // getmodeメソッドで選択したモードによって分岐する
        if(getmode()==1){
            // モード1の場合、動物のタイピングゲームを開始
            animalgame();
            // reStartメソッドでゲームを続けるか選択
            reStart();
        }
        else if(getmode()==2){
            // モード2の場合、宝石のタイピングゲームを開始
            jewelgame();
            // reStartメソッドでゲームを続けるか選択
            reStart();
        }
    }
}    
}
