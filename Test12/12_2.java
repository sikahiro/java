package Test12;
// Personクラスの定義
class Person {
    String name;
    String job;
    // コンストラクタ
    Person(String name,String job){
        this.name=name;
        this.job=job;
    }
    // 自己紹介をするメソッド
    public void introduce(){
        System.out.println("氏名:"+this.name);
        System.out.println("職業:"+this.job);
    }
}
// Teacherクラスの定義、Personクラスを継承
class Teacher extends Person{
    String subject;
    // コンストラクタ
    Teacher(String name,String job,String subject){
        super(name, job);
        this.subject=subject;
    }
    public void introduce(){
        // 親クラスのメソッドを呼び出す
        super.introduce();
        System.out.println("担当科目:"+this.subject);
    }
}
// Cookクラスの定義、Personクラスを継承
class Cook extends Person { 
    String favorite;
    // コンストラクタ
    Cook(String name,String job,String favorite){
        super(name, job);
        this.favorite=favorite;
    }
    public void introduce(){
        super.introduce();
        System.out.println("得意料理:"+this.favorite);
    }
}

class Main {
    public static void main(String[] args){
        // Teacherクラスのインスタンスを生成
        Teacher teacher=new Teacher("近藤勇", "教員", "Go言語");
        // Cookクラスのインスタンスを生成
        Cook cook =new Cook("沖田総司","シェフ", "オムライス");
        teacher.introduce();
        System.out.println();
        cook.introduce();
    }
}