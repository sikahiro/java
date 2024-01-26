package Test13.L13_4;

public class CalcExcuter implements CalcAddSub,CalcMultiDiv {
    private int num1;
    private int num2;

    public CalcExcuter(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }
    @Override public int dispAdd(){
        int total=this.num1+this.num2;
        System.out.println("足し算の結果:"+total);
        return total;
    }
    @Override public int dispSub(){
        int t=this.num1-this.num2;
        System.out.println("引き算の結果:"+t);
        return t;
    }
    @Override public int dispMulti(){
        int to=this.num1*this.num2;
        System.out.println("掛け算の結果:"+to);
        return to;
    }
    @Override public int dispDiv(){
        return num1/num2;
    }
}
