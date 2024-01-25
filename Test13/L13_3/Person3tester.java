package Test13.L13_3;

public class Person3tester {
    public static void main(String[] args){
        Person3[] a=new Person3[2];
        a[0]=new Teacher3("竹井一馬","教員","情報処理");
        a[1]=new Cook3("大原太郎","シェフ","オムライス");

        for (Person3 P:a){
            P.introduce();
            System.out.println();
        }
    }
}
