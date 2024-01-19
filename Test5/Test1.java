package Test5;
//Scannerモジュールをインポート
import java.util.Scanner;
class Test1 {
    public static void main(String[] args){
        Scanner hi = new Scanner(System.in);
        //A～Dの値を入力してくださいと表示
        System.out.print("A~Dの値を入力してください:");
        String m =hi.nextLine();
        //A~Dのランクに合わせて結果を表示する
        switch (m) {
            case "A":System.out.print("ランクAは評価「優」です");    
                break;
            case "B":System.out.print("ランクBは評価「良」です");    
                break;
            case "C":System.out.print("ランクCは評価「可」です");    
                break;
            case "D":System.out.print("ランクDは評価「不可」です");    
                break;   
        }
        System.out.println();
    }
}
