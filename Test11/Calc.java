package Test11;

class Calc {
    int x;
    int y;

    Calc(int x,int y){
        this.x=x;
        this.y=y;
    }
    int sum(){
        int total =0;
        for (int i=x;i<=y;i++){
            total += i;
        }
        return total;
    }
}
