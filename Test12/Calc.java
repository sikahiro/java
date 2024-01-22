package Test12;
import java.util.Scanner;
class Calculator{
    int x;
    int y;
    Calculator(int x,int y){this.x=x;this.y=y;}
    void setX(int x){this.x=x;}
    void setY(int y){this.y=y;}
    int getX(){return x;}
    int getY(){return y;}
    int calcSum(){
        int sum=0;
        sum=x+y;
        return sum;
    }
    int calcAve(){
        int ave=0;
        ave=(x+y)/2;
        return ave;
    }
}
class MoreCalc extends Calculator{
    MoreCalc(int x,int y){super(x, y);}
    int calcPow(){
        int pow=1;
        for(int i=1;i<=y;i++){
            pow=pow*x;
        }
        return pow;
    }
}

class Calc {
    public static void main(String[] args){
        MoreCalc a =new MoreCalc(0,0);
        Scanner as=new Scanner(System.in);
        System.out.print("整数値を入力");a.x=as.nextInt();
        System.out.print("整数値を入力");a.y=as.nextInt();
        System.out.println("Sum"+a.getX()+"And"+a.getY()+"="+a.calcSum());
        System.out.println("Average"+a.getX()+"And"+a.getY()+"="+a.calcAve());
        System.out.println("Power"+a.getX()+"Of"+a.getY()+"="+a.calcPow());
    }
}
