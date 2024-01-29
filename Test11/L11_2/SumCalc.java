package Test11.L11_2;

class SumCalc {
    int x;
    int y;

    int calcSum(){
        int sum=0;
        for (int o =x;o<=y;o++){
            sum+=o;
        }
        return sum;
    }
}
