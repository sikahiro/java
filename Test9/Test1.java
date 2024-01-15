package Test9;
import java.util.Scanner;
class Test1 {
    public static void main(String[] args){
        Scanner stdIn =new Scanner(System.in);
        String school =stdIn.nextLine();
        String name =stdIn.nextLine();

        play(school,name);
    }
    static void play(String school,String name){
        System.out.println("学校名："+school);
        System.out.println("名前："+name);

    }
}
