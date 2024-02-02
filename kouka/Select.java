package kouka;


public class Select extends Game{
    public Select(String jewelS,String animalS,int score,int miss){
        super(jewelS, animalS, score, miss);
    }
    int miss;
    int score;
    public int mode;
    public void setmode(int mode){
        this.mode=mode;
    }
    public int getmode(){
        return this.mode;
    }

    public void select(){
        System.out.println("問題のジャンルを数字で選択してください(1~2)");
        System.out.println("1:動物  2:宝石");

        try{
            @SuppressWarnings("resource")
            int point=new java.util.Scanner(System.in).nextInt();
            setmode(point);

            if(getmode()==1){
                System.out.println("動物の問題を選択しました");
            }
            else if(getmode()==2){
                System.out.println("宝石の問題を選択しました");
            }
            else{
                System.out.println("1,2を入力してください");
                select();
            }
        }catch(Exception e){
            System.out.println("数字で入力してください");
            select();
        }
    }
    
}