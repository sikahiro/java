package kouka;

import java.util.Scanner;

public class Game extends Jewel{
    public int score;
    public int miss;
    public Game(String jewelS, String animalS,int score,int miss){
        super(jewelS, animalS);
    }

    public void setscore(int score){
        this.score+=score;
    }
    public int getscore(){
        return this.score;
    }
    public void setmiss(int miss){
        this.miss+=miss;
    }
    public int getmiss(){
        return this.miss;
    }

    public void animalgame(){
        for (int count=0;count<10;count++){
            setwordanimal();
            System.out.println(getwordanimal());
            @SuppressWarnings("resource")
            String input =new Scanner(System.in).nextLine();
            if(input.equals(getwordanimal())){
                setscore(10);
                }
            else{
                setmiss(1);
                setscore(0);
            }
        }
        System.out.println("解答終了\nスコア"+getscore()+"\nミス数"+getmiss());
    }
    public void jewelgame(){
        for (int count=0;count<10;count++){
            setwordjewel();
            System.out.println(getwordjewel());
            @SuppressWarnings("resource")
            String input =new Scanner(System.in).nextLine();
            if(input.equals(getwordjewel())){
                setscore(10);
                }
            else{
                setmiss(1);
                setscore(0);
            }
        }
        System.out.println("解答終了\nスコア"+getscore()+"\nミス数"+getmiss());
    }
    
}