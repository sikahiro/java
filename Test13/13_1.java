package Test13;
// 抽象クラスPersonの定義
abstract class Person {
    String name;
    String job;
    // コンストラクタ
    Person(String name,String job){
        this.name=name;
        this.job=job;
    }
    // 氏名と職種を表示するメソッド
    public void show(){
        System.out.println("氏名:"+this.name);
        System.out.println("職種"+this.job);
    }
    // 特徴を表示する抽象メソッド
    abstract void showF();
}
// Teacherクラスの定義、Personクラスを継承
class Teacher extends Person{
    String subject;
    // コンストラクタ
    Teacher(String name,String subject){
        super(name, "教員");
        this.subject=subject;
    }
    // 特徴を表示するメソッド（オーバーライド）
    @Override
    public void showF(){
        System.out.println("担当科目:"+this.subject);
    }
}
// Cookクラスの定義、Personクラスの継承
class Cook extends Person{
    String favorite;
    // コンストラクタ
    Cook(String name,String favorite){
        super(name, "シェフ");
        this.favorite=favorite;
    }
    // 特徴を表示するメソッド（オーバーライド）
    @Override
    public void showF(){
        System.out.println("得意料理"+favorite);
    }
}

class Main{
    public static void main(String[] args){
        // Teacherクラスのインスタンスを生成
        Teacher teacher =new Teacher("竹井一馬", "情報処理");
        // Cookクラスのインスタンスを生成
        Cook cook=new Cook("大原太郎", "オムライス");
        // showメソッドとshowFメソッドを呼び出す
        teacher.show();
        teacher.showF();
        System.out.println();
        cook.show();
        cook.showF();
    }
}