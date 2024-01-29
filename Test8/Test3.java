package Test8;
import java.util.*;
class Test3 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int[] input =new int[10];
        List<Integer> even =new ArrayList<>();
        List<Integer> odd=new ArrayList<>(); 
        for (int i = 0; i < 10;i++){
            System.out.print(i+1+"件目:整数を入力=");
            input[i] = stdIn.nextInt();
        }
        for (int num:input)
            if (num %2==0)
                even.add(num);
            else
                odd.add(num);
        System.out.println("偶数値配列="+even);
        System.out.println("奇数値配列="+odd);
                


            

    }
}
