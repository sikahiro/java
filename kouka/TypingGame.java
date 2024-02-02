package kouka;

public class TypingGame extends Select{
    public TypingGame(String jewelS,String animalS,int score,int miss){
        super(jewelS, animalS, score, miss);
    }
    public void typingGame(){
        System.out.println("タイピングゲーム");
        select();

        if(getmode()==1){
            animalgame();
        }
        else if(getmode()==2){
            jewelgame();
        }
    }
    
}
