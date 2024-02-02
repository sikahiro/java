package kouka;
// animalクラスにインターフェースTypingをimplementsする
public class Animal implements Typing {
    public String[] animal={"雀","鳶","鷹","鷲","鯨","土竜","麒麟","蝙蝠","鴉","牛","蜥蜴"};
    public String animalS;

    public Animal(String animalS){
        this.animalS=animalS;
    }

    @Override public String setwordanimal(){
        int num = new java.util.Random().nextInt(getwordanimalnum());
        return this.animalS=animal[num];
    }
    @Override public String getwordanimal(){
        return this.animalS;
    }
    @Override public int getwordanimalnum(){
        return animal.length;
    }
    
}
