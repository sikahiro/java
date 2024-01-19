package Test11;

import java.util.Scanner;

class Circle2 {
    public static void main(String[] args){
            System.out.println("半径を整数値で入力:");
            Scanner stbln = new Scanner(System.in);
            double n =stbln.nextDouble();
            Circle c =new Circle(n);
            System.out.println("円周の長さは " + c + " です。");
            System.out.println("円の面積は " + c.getArea() + " です。");
        }  
}
