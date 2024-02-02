package kouka;

public class Jewel extends Animal implements Typing2{
    public String[] jewel={"",""};
    public String jewelS;

    public Jewel(String jewelS,String animalS){
        super(animalS);
        this.jewelS=jewelS;
    }

    @Override public String setwordjewel(){
        int num1 = new java.util.Random().nextInt(getwordjewelnum());
        return this.jewelS=jewel[num1];
    }
    @Override public String getwordjewel(){
        return this.jewelS;
    }
    @Override public int getwordjewelnum(){
        return jewel.length;
    }
}
